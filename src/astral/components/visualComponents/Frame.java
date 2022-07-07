package astral.components.visualComponents;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import astral.config.Config;
import astral.test.panels.TestPage1;

public class Frame {

	private JFrame jFrame;
	public JFrame getJFrame() {
		return jFrame;
	}

	public Frame(String windowTitle, String windowIconUrl, Page page) {
		jFrame = new JFrame();

		/*
		 * Necessary work-around in-case user is not using a border-less window.
		 * Although this background will be overlaid by the panel one, it's necessary to
		 * make sure the window borders respect the frame size and don't "eat" part of
		 * the frame.
		 */
		if (Config.res == 1) {
			jFrame.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Backgrounds/bg1920x1080.png"))));
		} else if (Config.res == 2) {
			jFrame.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Backgrounds/bg1280x720.png"))));
		}

		jFrame.setSize(Config.x, Config.y);
		jFrame.setMinimumSize(new Dimension(Config.x, Config.y));
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setUndecorated(Config.borderless);
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
