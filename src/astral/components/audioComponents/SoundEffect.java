package astral.components.audioComponents;

public class SoundEffect implements Runnable {

	private SoundEffectConverter soundEffectConverter;
	
	private String soundPath;
	
	public SoundEffect(String sfxUrl) {
		soundEffectConverter = new SoundEffectConverter();
		soundPath = sfxUrl;
	}

	@Override
	public void run() {
		soundEffectConverter.setFile(soundPath);
		soundEffectConverter.play();
	}
}
