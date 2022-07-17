package astral.components.visualComponents;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

import astral.components.visualComponents.interfaces.VisualComponent;

public class TextField implements VisualComponent {
	
	private JTextField textField;
	@Override
	public JTextField getJComponent() {
		return textField;
	}
	
	private String placeHolderText;

	public TextField(double x, double y, double xSize, double ySize, String placeHolderText, int fontSize) {
		this.placeHolderText = placeHolderText;
		
		textField = new JTextField();
		textField.setBounds((int) (x * Frame.multiplier), (int) (y * Frame.multiplier),
				(int) (xSize * Frame.multiplier), (int) (ySize * Frame.multiplier));
		textField.setText(placeHolderText);
		textField.setForeground(new Color(140, 140, 140));
		textField.setFont(new Font("Impact", Font.PLAIN, (int) (fontSize * Frame.multiplier)));
		textField.setFocusable(true);
	
		
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
				}					
			}
		});
	}
	
	public TextField(double y, double xSize, double ySize, String placeHolderText, int fontSize) {
		this.placeHolderText = placeHolderText;
		
		textField = new JTextField();
		textField.setBounds((int) (((1920 - xSize) / 2) * Frame.multiplier), (int) (y * Frame.multiplier),
				(int) (xSize * Frame.multiplier), (int) (ySize * Frame.multiplier));
		textField.setText(placeHolderText);
		textField.setForeground(new Color(140, 140, 140));
		textField.setFont(new Font("Impact", Font.PLAIN, (int) (fontSize * Frame.multiplier)));
		textField.setFocusable(true);
	
		
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
				}					
			}
		});
	}



}
