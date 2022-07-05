package astral.test.panels;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import astral.components.visualComponents.Label;
import astral.components.visualComponents.Panel;
import astral.components.visualComponents.TextButton;
import astral.config.Config;


public class MenuPanel implements ActionListener {

	private Panel panel;
	public Panel getPanel() {
		return panel;
	}
	
	private JLabel bg;
	
	private TextButton exitButton;


	private JFrame frame;
	
	public MenuPanel(JFrame frame) {
		
		this.frame=frame;

		panel = new Panel(1920,1080);
		
		exitButton = new TextButton(892, 850, 136, 70,62, "Exit",255,255,255);
		exitButton.getJComponent().addActionListener(this);
		panel.add(exitButton);
		
		bg = new JLabel();
		
		ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("Backgrounds/bg1920x1080.png"));
		bg.setSize(1920,1080);
		if (Config.res==2) {
			icon = new ImageIcon(getClass().getClassLoader().getResource("Backgrounds/bg1280x720.png"));
			bg.setSize(1280,720);
		}
		bg.setIcon(icon);
		panel.getJComponent().add(bg);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == exitButton.getJComponent()) {
			try {
				Thread.sleep(900);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.exit(0);
		}
	}

}