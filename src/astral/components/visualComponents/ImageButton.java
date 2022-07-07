package astral.components.visualComponents;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

import astral.component.interfaces.Component;
import astral.config.Config;

public class ImageButton implements Component, MouseListener {
	
	private JButton jButton;

	@Override
	public JComponent getJComponent() {
		return jButton;
	}
	
	public ImageButton(double x, double y, double xSize, double ySize, String imageURL) {
		jButton = new JButton();
		jButton.addMouseListener(this);
		
		jButton.setBounds((int) (x * Config.multiplier), (int) (y * Config.multiplier),
				(int) (xSize * Config.multiplier), (int) (ySize * Config.multiplier));
		
		jButton.setContentAreaFilled(false);

		ImageIcon originalIcon = new ImageIcon(getClass().getClassLoader().getResource(imageURL));
		Image originalImage = originalIcon.getImage();
		Image resizedImage = originalImage.getScaledInstance((int) (xSize * Config.multiplier),
				(int) (ySize * Config.multiplier), java.awt.Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(resizedImage);
		jButton.setIcon(icon);

		jButton.setBorderPainted(false);
		jButton.setBorder(BorderFactory.createLineBorder(Color.red,6));
		jButton.setFocusable(false);
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
