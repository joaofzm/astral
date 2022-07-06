package astral.components.visualComponents;

import javax.swing.JComponent;
import javax.swing.JPanel;

import astral.component.Component;
import astral.config.Config;
import astral.test.panels.MenuPanel;


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
	
	public void add(TextButton c, MenuPanel p) {
		panel.add(c.getJComponent());
		c.getJComponent().addActionListener(p);
	}
	
	public void add(CenteredTextButton c, MenuPanel p) {
		panel.add(c.getJComponent());
		c.getJComponent().addActionListener(p);
	}

}
