package astral.components.visualComponents;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import astral.util.Resizer;

public class Frame {
	
	//-------------------------------------------------------------------------------------
	public static int res = 3;
	public static boolean borderless = false;
	
	public static int x = 1280;
	public static int y = 720;
	public static double multiplier = 0.666666666666666666666666;
	
	public static void setConfig(int resolution, boolean border) {
		borderless = border;
		if (resolution==1) {
			res = resolution;
			multiplier=1;
			x=1920;
			y=1080;
		} else if (resolution==2) {
			res = resolution;
			multiplier=0.933333335;
			x=1792;
			y=1008;
		} else if (resolution==3) {
			res = resolution;
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

	public Frame(String windowTitle, String windowIconUrl, Page page, boolean centeredOnScreen) {
		jFrame = new JFrame();

		/*
		 If the user URL result in a NullPointer, the background will automatically be set
		 as the Astral default one.
		 */
		try {
			jFrame.setContentPane(new JLabel(Resizer.resize(page.getBgUrl(), Frame.x, Frame.y)));
		} catch (NullPointerException e) {
			jFrame.setContentPane(new JLabel(Resizer.resize("astralBg1920x1080.png", Frame.x, Frame.y)));
		}
		
		jFrame.setSize(Frame.x, Frame.y);
		jFrame.setMinimumSize(new Dimension(Frame.x, Frame.y));
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setUndecorated(Frame.borderless);
		if (centeredOnScreen) {
			jFrame.setLocationRelativeTo(null);
		}
		jFrame.setVisible(true);
		
		/*
		 If the user pass null as a parameter when instantiating a Frame, the window icon will not be set,
		 and as a result the icon will be the default Java one.
		 If the user passes one URL, but it results in a NullPointer, then the icon will be set as the
		 Astral default one.
		 */
		if(windowIconUrl!=null) {
			try {
				ImageIcon windowIcon = new ImageIcon(getClass().getClassLoader().getResource(windowIconUrl));
				jFrame.setIconImage(windowIcon.getImage());
			} catch (Exception e) {
				ImageIcon windowIcon = new ImageIcon(getClass().getClassLoader().getResource("astralWindowIcon.png"));
				jFrame.setIconImage(windowIcon.getImage());
			}
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
	
	public void dispose() {
		jFrame.dispose();
	}
	
	public void switchPage(Page page) {
		jFrame.getContentPane().removeAll();
		jFrame.getContentPane().add(page.getPanel().getJComponent());
		jFrame.revalidate();
		page.setFrame(this);
		page.getPanel().getJComponent().repaint();
	}

}
