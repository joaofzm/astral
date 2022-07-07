package astral.test.panels;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import astral.components.visualComponents.CenteredTextButton;
import astral.components.visualComponents.Frame;
import astral.components.visualComponents.Page;
import astral.components.visualComponents.Panel;
import astral.config.Config;
import astral.util.Resizer;


public class TestPage2 extends Page {

	private CenteredTextButton exitButton;
	private CenteredTextButton res1Button;
	private CenteredTextButton res2Button;
	
	private CenteredTextButton page1Button;
	
	public TestPage2() {
		super("Backgrounds/bg1920x1080.png");
		
		exitButton = new CenteredTextButton(850, 100, 62,"Exit",62, 255,255,255,0,0,0);
		getPanel().add(exitButton,this);
		
		res1Button = new CenteredTextButton(250, 140, 62,"RES 1",62, 255,255,255,0,0,0);
		getPanel().add(res1Button,this);
		
		res2Button = new CenteredTextButton(350, 140, 62,"RES 2",62, 255,255,255,0,0,0);
		getPanel().add(res2Button,this);
		
		page1Button = new CenteredTextButton(450, 180, 62,"PAGE 1",62, 255,255,255,0,0,0);
		getPanel().add(page1Button,this);
		
		
		getBg().setIcon(Resizer.resize(getBgUrl(), Config.x, Config.y));
		getBg().setSize(Config.x,Config.y);
		getPanel().getJComponent().add(getBg());
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == res1Button.getJComponent()) {
			Config.res=1;
			Config.setMultiplier();
			getFrame().getJFrame().dispose();
			TestPage2 initialPanel = new TestPage2();
			Frame frame = new Frame("Window Title", "windowIcon.jpg", initialPanel);
		}
		
		if (e.getSource() == res2Button.getJComponent()) {
			Config.res=2;
			Config.setMultiplier();
			getFrame().getJFrame().dispose();
			TestPage2 initialPanel = new TestPage2();
			Frame frame = new Frame("Window Title", "windowIcon.jpg", initialPanel);
		}
		
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