package astral.components.visualComponents;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

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

		String bgUrl = page.getBgUrl();
		if (Config.res == 1) {
			jFrame.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource(bgUrl))));
		} else if (Config.res == 2) {
			ImageIcon originalIcon = new ImageIcon(getClass().getClassLoader().getResource(bgUrl)); 
			Image originalImage = originalIcon.getImage();
			Image resizedImage = originalImage.getScaledInstance(1280,720,java.awt.Image.SCALE_SMOOTH); 
			ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
			jFrame.setContentPane(new JLabel(resizedImageIcon));
		}

		jFrame.setSize(Config.x, Config.y);
		jFrame.setMinimumSize(new Dimension(Config.x, Config.y));
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setUndecorated(Config.borderless);
		jFrame.setVisible(true);
		ImageIcon windowIcon = new ImageIcon(getClass().getClassLoader().getResource(windowIconUrl));
		jFrame.setIconImage(windowIcon.getImage());
		jFrame.setTitle(windowTitle);
		jFrame.setResizable(true);
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
