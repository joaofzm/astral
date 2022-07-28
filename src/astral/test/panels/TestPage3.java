package astral.test.panels;

import java.awt.event.ActionEvent;

import astral.components.audioComponents.LoopingSoundEffect;
import astral.components.audioComponents.SoundEffect;
import astral.components.visualComponents.CheckBox;
import astral.components.visualComponents.ComboBox;
import astral.components.visualComponents.ImageButton;
import astral.components.visualComponents.Label;
import astral.components.visualComponents.Page;
import astral.components.visualComponents.PasswordField;
import astral.components.visualComponents.TextButton;
import astral.components.visualComponents.TextField;
import astral.components.visualComponents.ToggleButton;

public class TestPage3 extends Page {

	private TextButton exitButton;
	
	private TextButton page1Button;

	private TextButton anotherButton;

	private ImageButton monkeButton;
	
	private ComboBox comboBox;
	
	private ToggleButton toggleButton;

	public TestPage3() {
		super("yusaku.png");
		
		getPanel().add(new Label(1250, 200, 500, 200, "galo.png"));

		getPanel().add(new Label(1000, 800, 500, 200, "GALO", 72, 255, 255, 200, false));

		getPanel().add(exitButton = new TextButton(850, 100, 62, "Exit", 62, 50, 50, 255, 0, 0, 0, true), this);

		getPanel().add(page1Button = new TextButton(450, 180, 62, "PAGE 1", 62, 255, 255, 255, 255, 0, 0, false), this);

		getPanel().add(anotherButton = new TextButton(1000, 250, 180, 62, "ABC", 62, 255, 0, 0, 0, 0, 0, true), this);

		getPanel().add(monkeButton = new ImageButton(100, 100, 300, 300, true, "mrv.png", "monke.png"), this);

		getPanel().add(new TextField(20, 20, 200, 50, "batata", 22));
		
		getPanel().add(new PasswordField(20, 120, 200, 50, "senha123", 22));
		
		getPanel().add(new PasswordField(120, 200, 50, "senha12345", 22));

		getPanel().add(new TextField(20, 200, 50, "jisadjisda", 22));
		
		getPanel().add(new CheckBox(1000, 180, 150, 50, "CHECK", 200, 0, 0,50, 50, 50, 33));
		
		getPanel().add(toggleButton = new ToggleButton(1600, 180, 150, 50, "BUTT", 200, 0, 0,50, 200, 50, 33),this);
		
		getPanel().add(comboBox = new ComboBox(1300, 180, 150, 80, "COMBO", 200, 50, 50,50, 255, 200, 33));
		comboBox.getJComponent().addItem("Item 1");
		comboBox.getJComponent().addItem("Item 2");
		comboBox.getJComponent().addItem("Item 3");
		comboBox.getJComponent().addItem("Item 4");
		
		addBackground();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == page1Button.getJComponent()) {
			TestPage1 page1 = new TestPage1();
			getFrame().switchPage(page1);
		}
		
		else if (e.getSource() == toggleButton.getJComponent()) {
			if (toggleButton.getJComponent().isSelected()) {
				new Thread(new SoundEffect("/impact.wav",-20)).start();
			} else {
				new Thread(new LoopingSoundEffect("/impact.wav", 5,500,-15)).start();
			}
		}

		else if (e.getSource() == monkeButton.getJComponent()) {
			new Thread(new SoundEffect("/impact.wav",-20)).start();
		}

		else if (e.getSource() == anotherButton.getJComponent()) {
			new Thread(new LoopingSoundEffect("/menu bgmusic.wav", 0, 192000,-15)).start();
		}

		else if (e.getSource() == exitButton.getJComponent()) {
			new Thread(new SoundEffect("/impact.wav",-20)).start();
			try {
				Thread.sleep(900);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.exit(0);
		}
	}
}