package astral.components.visualComponents;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import astral.components.visualComponents.interfaces.VisualComponent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CenteredTextButton implements VisualComponent, MouseListener {
	
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
	
	public CenteredTextButton(double y, double xSize, double ySize, String text, int fontSize,
			int red, int green, int blue, int hoverRed, int hoverGreen, int hoverBlue, boolean border) {
		
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.hoverRed = hoverRed;
		this.hoverGreen = hoverGreen;
		this.hoverBlue = hoverBlue;
		
		jButton = new JButton();
		jButton.addMouseListener(this);
		
		
		jButton.setBounds((int) (((1920 - xSize) / 2) * Frame.multiplier), (int) (y * Frame.multiplier),
				(int) (xSize * Frame.multiplier), (int) (ySize * Frame.multiplier));
		
		jButton.setContentAreaFilled(false);
		
		jButton.setText(text);
		jButton.setForeground(new Color(red, green, blue));
		jButton.setFont(new Font("Impact", Font.PLAIN, (int) (fontSize * Frame.multiplier)));
		jButton.setFocusable(false);
	
		jButton.setBorder(BorderFactory.createLineBorder(Color.white));
		jButton.setBorderPainted(border);
		

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
