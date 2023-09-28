package live.tanujdevops;

public class SecondMinutesChallenge {
	public static void main(String[] args) {
		System.out.println(getDurationString(3945));
		System.out.println(getDurationString(3601, 48));
		System.out.println(getDurationString(65, 45));
		System.out.println(getDurationString(-45));
		System.out.println(getDurationString(-45, 40));
		System.out.println(getDurationString(75, 60));
	}

	public static String getDurationString(int seconds) {
		if (seconds < 0) {
			return getInvalidValueMessage(seconds, "seconds");
		}

		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;

		return getDurationString(minutes, remainingSeconds);
	}

	public static String getDurationString(int minutes, int seconds) {
		if (minutes < 0) {
			return getInvalidValueMessage(minutes, "minutes");
		}

		if (seconds < 0 || seconds > 59) {
			return getInvalidValueMessage(seconds, "seconds");
		}

		int hours = minutes / 60;
		minutes %= 60;

		return String.format("%02dh %02dm %02ds", hours, minutes, seconds);
	}

	private static String getInvalidValueMessage(int value, String name) {
		if (name.equals("minutes")) {
			return "Invalid value minutes(" + value + "). Must be greater than or equal to 0.";
		} else if (name.equals("seconds")) {
			return "Invalid value seconds(" + value + "). Must be between 0 and 59.";
		}
		return "Invalid value";
	}
}
