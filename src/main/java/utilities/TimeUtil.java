package utilities;

public class TimeUtil {

	private static final int SHORT_TIME =5000;
	private static final int MEDIUM_TIME =10000;
	private static final int LONG_TIME =15000;
	private static final int LONGEST_TIME =20000;
	
	
	public static void waitForShortTime() {
		try {
			Thread.sleep(SHORT_TIME);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void waitForMediumTime() {
		try {
			Thread.sleep(MEDIUM_TIME);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void waitForLongTime() {
		try {
			Thread.sleep(LONG_TIME);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void waitForLONGESTTime() {
		try {
			Thread.sleep(LONGEST_TIME);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
