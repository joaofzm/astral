package astral.components.audioComponents;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class SoundEffectConverter {

	private Clip clip;

	public void setFile(String soundFileName, int volumeAdjust) {
		try {
			AudioInputStream sound = AudioSystem.getAudioInputStream(getClass().getResource(soundFileName));
			clip = AudioSystem.getClip();
			clip.open(sound);
			FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			//Volume minimum value: -80 | maximum value 6.0206
			volume.setValue(volumeAdjust);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void play() {
		clip.start();
	}

	public void stop() {
		clip.stop();
	}

}
