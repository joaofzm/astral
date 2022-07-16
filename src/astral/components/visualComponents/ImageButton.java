package astral.components.visualComponents;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

import astral.component.interfaces.Component;
import astral.config.AstralConfig;
import astral.util.Resizer;

public class ImageButton implements Component, MouseListener {
	
	private JButton jButton;
	@Override
	public JComponent getJComponent() {
		return jButton;
	}
	
	public ImageButton(double x, double y, double xSize, double ySize, String imageURL) {
		jButton = new JButton();
		jButton.addMouseListener(this);
		
		jButton.setBounds((int) (x * AstralConfig.multiplier), (int) (y * AstralConfig.multiplier),
				(int) (xSize * AstralConfig.multiplier), (int) (ySize * AstralConfig.multiplier));
		
		jButton.setContentAreaFilled(false);

		jButton.setIcon(Resizer.resize(imageURL, (int) (xSize * AstralConfig.multiplier), (int) (ySize * AstralConfig.multiplier)));

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
