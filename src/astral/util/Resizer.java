package astral.util;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Resizer {

	public static ImageIcon resize(String url, int x, int y) {
		ImageIcon originalIcon = new ImageIcon(Resizer.class.getClassLoader().getResource(url));
		Image originalImage = originalIcon.getImage();
		Image resizedImage = originalImage.getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH);
		ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
		return resizedImageIcon;
	}

	public static ImageIcon resize(ImageIcon imgIcon, int x, int y) {
		Image originalImage = imgIcon.getImage();
		Image resizedImage = originalImage.getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH);
		ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
		return resizedImageIcon;
	}
}
