package astral.components.visualComponents;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;

import astral.components.visualComponents.interfaces.VisualComponent;

public class CheckBox implements VisualComponent{

	private JCheckBox checkBox;
	@Override
	public JCheckBox getJComponent() {
		return checkBox;
	}
	
	public CheckBox(double x, double y, double xSize, double ySize, String text,
			int foreGroundRed, int foreGroundGreen, int foreGroundBlue,
			int backGroundRed, int backGroundGreen, int backGroundBlue, int fontSize) {
		
		checkBox = new JCheckBox();
		checkBox.setBounds((int) (x * Frame.multiplier), (int) (y * Frame.multiplier),
				(int) (xSize * Frame.multiplier), (int) (ySize * Frame.multiplier));
		checkBox.setText(text);
		checkBox.setForeground(new Color(foreGroundRed, foreGroundGreen, foreGroundBlue));
		checkBox.setBackground(new Color(backGroundRed, backGroundGreen, backGroundBlue));
		checkBox.setFont(new Font("Impact", Font.PLAIN, (int) (fontSize * Frame.multiplier)));
		checkBox.setFocusable(false);
	
		checkBox.setBorder(BorderFactory.createLineBorder(new Color(foreGroundRed,foreGroundGreen,foreGroundBlue)));
		checkBox.setBorderPainted(true);
		checkBox.setVisible(true);
	}

	public void setVisible(boolean value) {
		getJComponent().setVisible(value);
	}


}
