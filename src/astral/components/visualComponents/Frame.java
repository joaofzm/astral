package astral.components.visualComponents;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import astral.util.Resizer;

public class Frame {
	
	//-------------------------------------------------------------------------------------
	public static int res = 1;
	public static boolean borderless = true;
	
	public static int x = 1920;
	public static int y = 1080;
	public static double multiplier = 1;
	
	public static void setConfig(int res, boolean border) {
		borderless = border;
		if (res==1) {
			multiplier=1;
			x=1920;
			y=1080;
		} else if (res==2) {
			multiplier=0.933333335;
			x=1792;
			y=1008;
		} else if (res==3) {
			multiplier=0.666666666666666666666666;
			x=1280;
			y=720;
		}
	}
	//-------------------------------------------------------------------------------------

	private JFrame jFrame;
	public JFrame getJFrame() {
		return jFrame;
	}

	public Frame(String windowTitle, String windowIconUrl, Page page) {
		jFrame = new JFrame();

		try {
			jFrame.setContentPane(new JLabel(Resizer.resize(page.getBgUrl(), Frame.x, Frame.y)));
		} catch (NullPointerException e) {
			jFrame.setContentPane(new JLabel(Resizer.resize("astralBg1920x1080.png", Frame.x, Frame.y)));
		}
		
		jFrame.setSize(Frame.x, Frame.y);
		jFrame.setMinimumSize(new Dimension(Frame.x, Frame.y));
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setUndecorated(Frame.borderless);
		jFrame.setVisible(true);
		
		try {
			ImageIcon windowIcon = new ImageIcon(getClass().getClassLoader().getResource(windowIconUrl));
			jFrame.setIconImage(windowIcon.getImage());
		} catch (Exception e) {
			ImageIcon windowIcon = new ImageIcon(getClass().getClassLoader().getResource("astralWindowIcon.jpg"));
			jFrame.setIconImage(windowIcon.getImage());
		}
		
		jFrame.setTitle(windowTitle);
		jFrame.setResizable(false);
		jFrame.pack();
		jFrame.setVisible(true);

		jFrame.getContentPane().setBackground(Color.black);
		
		jFrame.getContentPane().removeAll();
		jFrame.getContentPane().add(page.getPanel().getJComponent());
		jFrame.revalidate();
		
		page.setFrame(this);
		page.getPanel().getJComponent().repaint();

	}
	
	public void switchPage(Page page) {
		jFrame.getContentPane().removeAll();
		jFrame.getContentPane().add(page.getPanel().getJComponent());
		jFrame.revalidate();
		page.setFrame(this);
		page.getPanel().getJComponent().repaint();
	}

}
