package astral.test.Main;

import astral.components.visualComponents.Frame;
import astral.test.panels.TestPage2;

public class Main {

	public static void main(String[] args) {
		
		Frame.setConfig(2, false);
		
		TestPage2 initialPanel = new TestPage2();
		Frame frame = new Frame("Window Title", "whatever.jpg", initialPanel);
		
	}

}
