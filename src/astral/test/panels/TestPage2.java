package astral.test.panels;

import java.awt.event.ActionEvent;

import astral.components.visualComponents.CenteredTextButton;
import astral.components.visualComponents.Frame;
import astral.components.visualComponents.Page;
import astral.config.AstralConfig;


public class TestPage2 extends Page {

	private CenteredTextButton exitButton;
	
	private CenteredTextButton page1Button;
	
	public TestPage2() {
		super("astralBg1920x1080.png");
		
		exitButton = new CenteredTextButton(850, 100, 62,"Exit",62, 255,255,255,0,0,0);
		getPanel().add(exitButton,this);
		
		page1Button = new CenteredTextButton(450, 180, 62,"PAGE 1",62, 255,255,255,0,0,0);
		getPanel().add(page1Button,this);
		
		addBackground();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource() == page1Button.getJComponent()) {
			TestPage1 page1 = new TestPage1();
			getFrame().switchPage(page1);
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