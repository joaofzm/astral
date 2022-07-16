package astral.test.Main;

import astral.components.visualComponents.Frame;
import astral.test.panels.TestPage1;

public class Main {

	public static void main(String[] args) {
		
		Frame.setConfig(2, false);
		
		TestPage1 initialPanel = new TestPage1();
		Frame frame = new Frame("Window Title", "whatever.jpg", initialPanel);
		
	}

}
