package astral.test.panels;

import java.awt.event.ActionEvent;

import astral.components.visualComponents.CenteredTextButton;
import astral.components.visualComponents.ImageButton;
import astral.components.visualComponents.Page;
import astral.components.visualComponents.TextButton;


public class TestPage2 extends Page {

	private CenteredTextButton exitButton;
	private CenteredTextButton page1Button;
	
	private TextButton anotherButton;
	
	private ImageButton monkeButton;
	
	public TestPage2() {
		super("revolver.png");
		
		exitButton = new CenteredTextButton(850, 100, 62,"Exit",62, 255,255,255,0,0,0, true);
		getPanel().add(exitButton,this);
		
		page1Button = new CenteredTextButton(450, 180, 62,"PAGE 1",62, 255,255,255,0,0,0, false);
		getPanel().add(page1Button,this);
		
		anotherButton = new TextButton(1000,250, 180, 62,"ABC",62, 255,255,255,0,0,0, true);
		getPanel().add(anotherButton,this);
		
		monkeButton = new ImageButton(100, 100, 300, 300,true, "mrv.png","monke.png");
		getPanel().add(monkeButton,this);
		
		addBackground();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource() == page1Button.getJComponent()) {
			TestPage1 page1 = new TestPage1();
			getFrame().switchPage(page1);
		}
		
		if (e.getSource() == monkeButton.getJComponent()) {
			try {
				Thread.sleep(900);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.exit(0);
		}
		
		if (e.getSource() == anotherButton.getJComponent()) {
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