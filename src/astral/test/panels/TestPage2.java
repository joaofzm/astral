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

public class TestPage2 extends Page {

	private TextButton exitButton;
	private TextButton page1Button;

	private TextButton anotherButton;

	private Label imageLabel;
	private Label textLabel;

	private ImageButton monkeButton;
	
	private TextField textField;
	
	private TextField centralizedTextField;
	
	private PasswordField passwordField;
	
	private PasswordField centralizedPasswordField;
	
	private CheckBox checkBox;
	
	private ComboBox comboBox;

	public TestPage2() {
		super("revolver.png");
//		super("astralPinkBackground.png");

		imageLabel = new Label(1250, 200, 500, 200, "galo.png");
		getPanel().add(imageLabel);

		textLabel = new Label(1000, 800, 500, 200, "GALO", 72, 255, 255, 200, false);
		getPanel().add(textLabel);

		exitButton = new TextButton(850, 100, 62, "Exit", 62, 50, 50, 255, 0, 0, 0, true);
		getPanel().add(exitButton, this);

		page1Button = new TextButton(450, 180, 62, "PAGE 1", 62, 255, 255, 255, 255, 0, 0, false);
		getPanel().add(page1Button, this);

		anotherButton = new TextButton(1000, 250, 180, 62, "ABC", 62, 255, 0, 0, 0, 0, 0, true);
		getPanel().add(anotherButton, this);

		monkeButton = new ImageButton(100, 100, 300, 300, true, "mrv.png", "monke.png");
		getPanel().add(monkeButton, this);

		textField = new TextField(20, 20, 200, 50, "batata", 22);
		getPanel().add(textField);
		
		passwordField = new PasswordField(20, 120, 200, 50, "senha123", 22);
		getPanel().add(passwordField);
		
		centralizedPasswordField = new PasswordField(120, 200, 50, "senha12345", 22);
		getPanel().add(centralizedPasswordField);

		centralizedTextField = new TextField(20, 200, 50, "jisadjisda", 22);
		getPanel().add(centralizedTextField);
		
		checkBox = new CheckBox(1000, 180, 150, 50, "CHECK", 200, 0, 0,
				50, 50, 50, 33);
		getPanel().add(checkBox);
		
		comboBox = new ComboBox(1300, 180, 150, 80, "COMBO", 200, 50, 50,
				50, 50, 200, 33);
		comboBox.getJComponent().addItem("Item 1");
		comboBox.getJComponent().addItem("Item 2");
		comboBox.getJComponent().addItem("Item 3");
		comboBox.getJComponent().addItem("Item 4");
		getPanel().add(comboBox);
		

		addBackground();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == page1Button.getJComponent()) {
			TestPage1 page1 = new TestPage1();
			getFrame().switchPage(page1);
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