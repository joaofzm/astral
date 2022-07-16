package astral.test.panels;

import java.awt.event.ActionEvent;

import astral.components.visualComponents.CenteredTextButton;
import astral.components.visualComponents.Frame;
import astral.components.visualComponents.Page;

public class TestPage1 extends Page {

	private CenteredTextButton res1Button;
	
	private CenteredTextButton res2Button;

	private CenteredTextButton page2Button;
	
	private CenteredTextButton exitButton;

	public TestPage1() {

		super("astralBg1920x1080.png");

		exitButton = new CenteredTextButton(850, 100, 62, "Exit", 62, 255, 255, 255, 0, 0, 0, true);
		getPanel().add(exitButton, this);

		res1Button = new CenteredTextButton(250, 140, 62, "RES 1", 62, 255, 255, 255, 0, 0, 0, true);
		getPanel().add(res1Button, this);

		res2Button = new CenteredTextButton(350, 140, 62, "RES 2", 62, 255, 255, 255, 0, 0, 0, false);
		getPanel().add(res2Button, this);

		page2Button = new CenteredTextButton(450, 180, 62, "PAGE 2", 62, 255, 255, 255, 0, 0, 0, true);
		getPanel().add(page2Button, this);

		addBackground();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == res1Button.getJComponent()) {
			Frame.setConfig(1, Frame.borderless);
			getFrame().getJFrame().dispose();
			TestPage1 initialPanel = new TestPage1();
			Frame frame = new Frame("Window Title", "windowIcon.jpg", initialPanel);
		}

		if (e.getSource() == res2Button.getJComponent()) {
			Frame.setConfig(2, Frame.borderless);
			getFrame().getJFrame().dispose();
			TestPage1 initialPanel = new TestPage1();
			Frame frame = new Frame("Window Title", "windowIcon.jpg", initialPanel);
		}

		if (e.getSource() == page2Button.getJComponent()) {
			TestPage2 page2 = new TestPage2();
			getFrame().switchPage(page2);
		}

		if (e.getSource() == exitButton.getJComponent()) {
			try {
				Thread.sleep(900);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.exit(0);
		}
	}
}