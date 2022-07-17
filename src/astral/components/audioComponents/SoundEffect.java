package astral.components.audioComponents;

public class SoundEffect implements Runnable {

	private SoundEffectConverter soundEffectConverter;
	
	private String soundPath;
	
	public SoundEffect(String sfxURL) {
		soundEffectConverter = new SoundEffectConverter();
		soundPath = sfxURL;
	}

	@Override
	public void run() {
		soundEffectConverter.setFile(soundPath);
		soundEffectConverter.play();
	}
}
