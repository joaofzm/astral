package astral.components.audioComponents;

import java.util.Iterator;

public class LoopingSoundEffect implements Runnable {

	private SoundEffectConverter soundEffectConverter;

	private String soundPath;

	private int loops;

	private int interval;

	public LoopingSoundEffect(String sfxURL, int loops, int interval) {
		soundEffectConverter = new SoundEffectConverter();
		soundPath = sfxURL;
		this.interval = interval;
		this.loops = loops;
	}

	@Override
	public void run() {

		// 0 equals to infinity loops
		if (loops == 0) {
			while (true) {
				soundEffectConverter.setFile(soundPath);
				soundEffectConverter.play();
				try {
					Thread.sleep(interval);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} else {
			for (int i = 0; i < loops; i++) {
				soundEffectConverter.setFile(soundPath);
				soundEffectConverter.play();
				try {
					Thread.sleep(interval);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
