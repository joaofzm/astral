package astral.components.visualComponents;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import astral.components.visualComponents.interfaces.VisualComponent;

public class Label implements VisualComponent {

	private JLabel jLabel;
	@Override
	public JLabel getJComponent() {
		return jLabel;
	}

	public Label(double x, double y, double xSize, double ySize, String imageURL) {
		jLabel = new JLabel();
		
		ImageIcon originalIcon = new ImageIcon(getClass().getClassLoader().getResource(imageURL)); 
		Image originalImage = originalIcon.getImage();
		Image resizedImage = originalImage.getScaledInstance((int)(xSize*Frame.multiplier),(int) (ySize*Frame.multiplier),  java.awt.Image.SCALE_SMOOTH); 
		ImageIcon icon = new ImageIcon(resizedImage);
	
		jLabel.setIcon(icon);
		jLabel.setBounds((int) (x * Frame.multiplier), (int) (y * Frame.multiplier), (int) (xSize * Frame.multiplier),
				(int) (ySize * Frame.multiplier));
	}

	public Label(double x, double y, double xSize, double ySize, String text, int fontSize,
			int red, int green, int blue, boolean border) {
		jLabel = new JLabel();
		jLabel.setBounds((int) (x * Frame.multiplier), (int) (y * Frame.multiplier), (int) (xSize * Frame.multiplier),
				(int) (ySize * Frame.multiplier));
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel.setVerticalAlignment(SwingConstants.CENTER);
		jLabel.setText(text);
		jLabel.setFont(new Font("Impact", Font.PLAIN, (int) (fontSize * Frame.multiplier)));
		jLabel.setForeground(new Color(red,green,blue));
		
		if(border) {
			jLabel.setBorder(BorderFactory.createLineBorder(Color.white));
		}

	}

	public void setVisible(boolean value) {
		getJComponent().setVisible(value);
	}

}
