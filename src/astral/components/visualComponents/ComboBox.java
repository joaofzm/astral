package astral.components.visualComponents;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JComboBox;

import astral.components.visualComponents.interfaces.VisualComponent;

public class ComboBox implements VisualComponent {

	private JComboBox<String> comboBox;
	@Override
	public JComboBox<String> getJComponent() {
		return comboBox;
	}
	
	public ComboBox(double x, double y, double xSize, double ySize, String text,
			int foreGroundRed, int foreGroundGreen, int foreGroundBlue,
			int backGroundRed, int backGroundGreen, int backGroundBlue, int fontSize) {
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds((int) (x * Frame.multiplier), (int) (y * Frame.multiplier),
				(int) (xSize * Frame.multiplier), (int) (ySize * Frame.multiplier));
//		comboBox.setText(text);
		comboBox.setForeground(new Color(foreGroundRed, foreGroundGreen, foreGroundBlue));
		comboBox.setBackground(new Color(backGroundRed, backGroundGreen, backGroundBlue));
		comboBox.setFont(new Font("Impact", Font.PLAIN, (int) (fontSize * Frame.multiplier)));
		comboBox.setFocusable(false);
	
//		comboBox.setBorder(BorderFactory.createLineBorder(new Color(foreGroundRed,foreGroundGreen,foreGroundBlue)));
		
		comboBox.setVisible(true);
	}

	public void setVisible(boolean value) {
		getJComponent().setVisible(value);
	}


}
