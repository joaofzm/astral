package astral.components.visualComponents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public abstract class Page implements ActionListener {

	private Panel panel;
	
	private JLabel bg;
	
	private String bgUrl;

	private Frame frame;
	
	public Page(String bgUrl) {
		panel = new Panel(1920,1080);
		bg = new JLabel();
		this.bgUrl = bgUrl; 
	}

	public Panel getPanel() {
		return panel;
	}

	public void setPanel(Panel panel) {
		this.panel = panel;
	}

	public JLabel getBg() {
		return bg;
	}

	public void setBg(JLabel bg) {
		this.bg = bg;
	}

	public Frame getFrame() {
		return frame;
	}

	public void setFrame(Frame frame) {
		this.frame = frame;
	}

	public String getBgUrl() {
		return bgUrl;
	}

	public void setBgUrl(String bgUrl) {
		this.bgUrl = bgUrl;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	

}
