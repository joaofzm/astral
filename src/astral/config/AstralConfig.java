package astral.config;

public class AstralConfig {
	
	/*
	 RESOLUTIONS LIST:
	 1 = 1920x1080
	 2 = 1792x1008
	 3 = 1280x720
	 */
	
	public static int res = 1;
	public static boolean borderless = true;
	
	public static int x = 1920;
	public static int y = 1080;
	public static double multiplier = 1;
	
	public static void setConfig(int res, boolean border) {
		borderless = border;
		
		if (res==1) {
			multiplier=1;
			x=1920;
			y=1080;
		} else if (res==2) {
			multiplier=0.933333335;
			x=1792;
			y=1008;
		} else if (res==3) {
			multiplier=0.666666666666666666666666;
			x=1280;
			y=720;
		}
	}

	
}
