package astral.components.visualComponents;

import javax.swing.JComponent;
import javax.swing.JPanel;

import astral.component.interfaces.Component;


public class Panel implements Component {
	private JPanel panel;
	@Override
	public JComponent getJComponent() {
		return panel;
	}

	public Panel(int x, int y) {
		panel = new JPanel();
		panel.setSize((int)(x*Frame.multiplier),(int)(y*Frame.multiplier));
		panel.setLayout(null);
	}
	
	public void add(Component c) {
		panel.add(c.getJComponent());
	}
	
	public void add(TextButton c, Page p) {
		panel.add(c.getJComponent());
		c.getJComponent().addActionListener(p);
	}
	
//	public void add(ImageButton c, Page p) {
//		panel.add(c.getJComponent());
//		c.getJComponent().addActionListener(p);
//	}
	
	public void add(CenteredTextButton c, Page p) {
		panel.add(c.getJComponent());
		c.getJComponent().addActionListener(p);
	}

}
