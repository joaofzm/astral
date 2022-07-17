package astral.components.audioComponents;

public class SoundEffect implements Runnable {

	private SoundEffectConverter soundEffectConverter;
	
	private String soundPath;
	
	private int volume;
	
	public SoundEffect(String sfxURL, int volume) {
		soundEffectConverter = new SoundEffectConverter();
		soundPath = sfxURL;
		this.volume = volume;

	}

	@Override
	public void run() {
		soundEffectConverter.setFile(soundPath,volume);
		soundEffectConverter.play();
	}
}
