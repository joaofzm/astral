package astral.components.visualComponents;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import astral.config.AstralConfig;
import astral.util.Resizer;

public class Frame {

	private JFrame jFrame;
	public JFrame getJFrame() {
		return jFrame;
	}

	public Frame(String windowTitle, String windowIconUrl, Page page) {
		jFrame = new JFrame();

		jFrame.setContentPane(new JLabel(Resizer.resize(page.getBgUrl(), AstralConfig.x, AstralConfig.y)));

		jFrame.setSize(AstralConfig.x, AstralConfig.y);
		jFrame.setMinimumSize(new Dimension(AstralConfig.x, AstralConfig.y));
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setUndecorated(AstralConfig.borderless);
		jFrame.setVisible(true);
		ImageIcon windowIcon = new ImageIcon(getClass().getClassLoader().getResource(windowIconUrl));
		jFrame.setIconImage(windowIcon.getImage());
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
