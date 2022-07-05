package astral.components.visualComponents;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;

import astral.component.Component;
import astral.config.Config;

public class TextButton implements Component, MouseListener {
	
	private JButton jButton;

	@Override
	public JComponent getJComponent() {
		return jButton;
	}
	
	public TextButton(double x, double y, double xSize, double ySize, int fontSize, String text, int red, int green, int blue) {
		
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
		jButton.setBorderPainted(false);
	}

	
	public void setVisible(boolean value) {
		getJComponent().setVisible(value);
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

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
}
