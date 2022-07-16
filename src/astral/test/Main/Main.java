package astral.test.Main;

import astral.components.visualComponents.Frame;
import astral.config.AstralConfig;
import astral.test.panels.TestPage1;

public class Main {

	public static void main(String[] args) {
		
		AstralConfig.setConfig(2, false);
		
		TestPage1 initialPanel = new TestPage1();
		Frame frame = new Frame("Window Title", "windowIcon.jpg", initialPanel);
		
	}

}
