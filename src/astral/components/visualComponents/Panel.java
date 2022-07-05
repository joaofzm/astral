package astral.components.visualComponents;

import javax.swing.JComponent;
import javax.swing.JPanel;

import astral.component.Component;
import astral.config.Config;


public class Panel implements Component {
	private JPanel panel;
	@Override
	public JComponent getJComponent() {
		return panel;
	}

	public Panel(int x, int y) {
		panel = new JPanel();
		panel.setSize((int)(x*Config.multiplier),(int)(y*Config.multiplier));
		panel.setLayout(null);
	}
	
	public void add(Component c) {
		panel.add(c.getJComponent());
	}

}
