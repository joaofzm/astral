package astral.test.Main;

import astral.components.visualComponents.Frame;
import astral.config.Config;
import astral.test.panels.TestPage1;

public class Main {

	public static void main(String[] args) {
		
		Config.res=2;
		Config.borderless=false;
		Config.setMultiplier();
		
		TestPage1 initialPanel = new TestPage1();
		Frame frame = new Frame("Window Title", "windowIcon.jpg", initialPanel);
		
	}

}
