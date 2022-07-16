package astral.components.visualComponents;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import astral.component.interfaces.Component;
import astral.config.AstralConfig;

public class Label implements Component {

	private JLabel jLabel;
	@Override
	public JLabel getJComponent() {
		return jLabel;
	}

	public Label(double x, double y, double xSize, double ySize, String imageURL) {
		jLabel = new JLabel();
		
		ImageIcon originalIcon = new ImageIcon(getClass().getClassLoader().getResource(imageURL)); 
		Image originalImage = originalIcon.getImage();
		Image resizedImage = originalImage.getScaledInstance((int)(xSize*AstralConfig.multiplier),(int) (ySize*AstralConfig.multiplier),  java.awt.Image.SCALE_SMOOTH); 
		ImageIcon icon = new ImageIcon(resizedImage);
	
		jLabel.setIcon(icon);
		jLabel.setBounds((int) (x * AstralConfig.multiplier), (int) (y * AstralConfig.multiplier), (int) (xSize * AstralConfig.multiplier),
				(int) (ySize * AstralConfig.multiplier));
	}

	public Label(double x, double y, double xSize, double ySize, String text, int fontSize, int red, int green, int blue) {
		jLabel = new JLabel();
		jLabel.setBounds((int) (x * AstralConfig.multiplier), (int) (y * AstralConfig.multiplier), (int) (xSize * AstralConfig.multiplier),
				(int) (ySize * AstralConfig.multiplier));
		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel.setVerticalAlignment(SwingConstants.CENTER);
		jLabel.setText(text);
		jLabel.setFont(new Font("Impact", Font.PLAIN, (int) (fontSize * AstralConfig.multiplier)));
		jLabel.setForeground(new Color(red,green,blue));
		
//		label.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
	}

	public void setVisible(boolean value) {
		getJComponent().setVisible(value);
	}

}
