package astral.components.visualComponents;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JPasswordField;

import astral.components.visualComponents.interfaces.VisualComponent;

public class PasswordField implements VisualComponent {
	
	private JPasswordField textField;
	@Override
	public JPasswordField getJComponent() {
		return textField;
	}
	
	private String placeHolderText;

	public PasswordField(double x, double y, double xSize, double ySize, String placeHolderText, int fontSize) {
		this.placeHolderText = placeHolderText;
		
		textField = new JPasswordField();
		textField.setBounds((int) (x * Frame.multiplier), (int) (y * Frame.multiplier),
				(int) (xSize * Frame.multiplier), (int) (ySize * Frame.multiplier));
		textField.setText(placeHolderText);
		textField.setForeground(new Color(140, 140, 140));
		textField.setFont(new Font("Impact", Font.PLAIN, (int) (fontSize * Frame.multiplier)));
		textField.setFocusable(true);
		textField.setEchoChar((char)0);
//		textField.setBorder(BorderFactory.createLineBorder(new Color(100,100,100),3));

		
		textField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void focusGained(FocusEvent e) {
				textField.setForeground(Color.black);
				if (textField.getText().equals(placeHolderText)) {
					textField.setText("");
					textField.setEchoChar('*');
				}					
			}
		});
	}
	
	public PasswordField(double y, double xSize, double ySize, String placeHolderText, int fontSize) {
		this.placeHolderText = placeHolderText;
		
		textField = new JPasswordField();
		textField.setBounds((int) (((1920 - xSize) / 2) * Frame.multiplier), (int) (y * Frame.multiplier),
				(int) (xSize * Frame.multiplier), (int) (ySize * Frame.multiplier));
		textField.setText(placeHolderText);
		textField.setForeground(new Color(140, 140, 140));
		textField.setFont(new Font("Impact", Font.PLAIN, (int) (fontSize * Frame.multiplier)));
		textField.setFocusable(true);
		textField.setEchoChar((char)0);
//		textField.setBorder(BorderFactory.createLineBorder(new Color(100,100,100),3));

		
		textField.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void focusGained(FocusEvent e) {
				textField.setForeground(Color.black);
				if (textField.getText().equals(placeHolderText)) {
					textField.setText("");
					textField.setEchoChar('*');
				}					
			}
		});
	}
	
	public void resetToPlaceHolder() {
		textField.setText(placeHolderText);
		textField.setForeground(new Color(140, 140, 140));
	}
	
	public void setVisible(boolean value) {
		getJComponent().setVisible(value);
	}

}
