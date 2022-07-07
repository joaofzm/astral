package astral.components.visualComponents;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import astral.component.interfaces.Component;
import astral.config.Config;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TextButton implements Component, MouseListener {
	
	private int red;
	private int green;
	private int blue;
	
	private int hoverRed;
	private int hoverGreen;
	private int hoverBlue;
	
	private JButton jButton;
	@Override
	public JButton getJComponent() {
		return jButton;
	}
	
	public TextButton(double x, double y, double xSize, double ySize, String text, int fontSize,
			int red, int green, int blue, int hoverRed, int hoverGreen, int hoverBlue) {
		
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.hoverRed = hoverRed;
		this.hoverGreen = hoverGreen;
		this.hoverBlue = hoverBlue;
		
		jButton = new JButton();
		jButton.addMouseListener(this);
		
		jButton.setBounds((int) (x * Config.multiplier), (int) (y * Config.multiplier),
				(int) (xSize * Config.multiplier), (int) (ySize * Config.multiplier));
		
		jButton.setContentAreaFilled(false);
		
		jButton.setText(text);
		jButton.setForeground(new Color(red, green, blue));
		jButton.setFont(new Font("Impact", Font.PLAIN, (int) (fontSize * Config.multiplier)));
		jButton.setFocusable(false);
	
		jButton.setBorder(BorderFactory.createLineBorder(Color.white));
		jButton.setBorderPainted(true);
		

	}

	
	public void setVisible(boolean value) {
		getJComponent().setVisible(value);
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		jButton.setForeground(new Color(hoverRed,hoverGreen,hoverBlue));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		jButton.setForeground(new Color(red,green,blue));
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

}
