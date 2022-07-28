package astral.components.visualComponents;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;

import astral.components.visualComponents.interfaces.VisualComponent;

public class ToggleButton implements VisualComponent{

	private JToggleButton toggleButton;
	@Override
	public JToggleButton getJComponent() {
		return toggleButton;
	}
	
	public ToggleButton(double x, double y, double xSize, double ySize, String text,
			int foreGroundRed, int foreGroundGreen, int foreGroundBlue,
			int backGroundRed, int backGroundGreen, int backGroundBlue, int fontSize) {
		
		toggleButton = new JToggleButton();
		toggleButton.setBounds((int) (x * Frame.multiplier), (int) (y * Frame.multiplier),
				(int) (xSize * Frame.multiplier), (int) (ySize * Frame.multiplier));
		toggleButton.setText(text);
		toggleButton.setForeground(new Color(foreGroundRed, foreGroundGreen, foreGroundBlue));
		toggleButton.setBackground(new Color(backGroundRed, backGroundGreen, backGroundBlue));
		toggleButton.setFont(new Font("Impact", Font.PLAIN, (int) (fontSize * Frame.multiplier)));
		toggleButton.setFocusable(false);
	
		toggleButton.setBorder(BorderFactory.createLineBorder(new Color(foreGroundRed,foreGroundGreen,foreGroundBlue)));
		toggleButton.setBorderPainted(true);
		toggleButton.setVisible(true);
	}

	public void setVisible(boolean value) {
		getJComponent().setVisible(value);
	}


}
