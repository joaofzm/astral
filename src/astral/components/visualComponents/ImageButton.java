package astral.components.visualComponents;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import astral.component.interfaces.Component;
import astral.util.Resizer;

public class ImageButton implements Component, MouseListener {
	
	private JButton jButton;
	@Override
	public JButton getJComponent() {
		return jButton;
	}
	
	private double xSize;
	private double ySize;
	
	private ImageIcon defaultImageIcon;
	private ImageIcon hoverImageIcon;
	
	
	
	public ImageButton(double x, double y, double xSize, double ySize, boolean border,
			String defaultImageURL, String hoverImageURL) {
		
		this.xSize=xSize;
		this.ySize=ySize;
		defaultImageIcon=Resizer.resize(defaultImageURL, (int) (xSize * Frame.multiplier), (int) (ySize * Frame.multiplier));
		hoverImageIcon=Resizer.resize(hoverImageURL, (int) (xSize * Frame.multiplier), (int) (ySize * Frame.multiplier));
		
		jButton = new JButton();
		jButton.addMouseListener(this);
		
		jButton.setBounds((int) (x * Frame.multiplier), (int) (y * Frame.multiplier),
				(int) (xSize * Frame.multiplier), (int) (ySize * Frame.multiplier));
		
		jButton.setContentAreaFilled(false);

		jButton.setIcon(Resizer.resize(defaultImageURL, (int) (xSize * Frame.multiplier), (int) (ySize * Frame.multiplier)));
		jButton.setFocusable(false);

		jButton.setBorder(BorderFactory.createLineBorder(Color.white));
		jButton.setBorderPainted(border);
	}

	
	public void setVisible(boolean value) {
		getJComponent().setVisible(value);
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		jButton.setIcon(hoverImageIcon);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		jButton.setIcon(defaultImageIcon);
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
