package astral.test.Main;

import astral.components.visualComponents.Frame;
import astral.test.panels.TestPage3;

public class Main {

	public static void main(String[] args) {
		
		Frame.setConfig(2, false);
		TestPage3 initialPanel = new TestPage3();
		Frame frame = new Frame("Window Title", "galo.png", initialPanel);
		
	}

}
