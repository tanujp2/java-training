package live.tanujdevops;

public class SecondMinutesChallenge {
	public static void main(String[] args) {
		System.out.println(getDurationString(3945)); // this is the first test case
		System.out.println(getDurationString(3601, 48)); // this is the second test
		System.out.println(getDurationString(65, 45)); // this is the third test
	}

	public static String getDurationString(int seconds) {
		if (seconds < 0) {
			return "Invalid seconds";
		}

		int minutes = seconds / 60;
		seconds %= 60;

		return getDurationString(minutes, seconds);
	}

	public static String getDurationString(int minutes, int seconds) {
		if (minutes < 0 || seconds < 0 || seconds > 59) {
			return "Invalid minutes and seconds";
		}

		int hours = minutes / 60;
		minutes %= 60;

		return String.format("%02dh %02dm %02ds", hours, minutes, seconds);
	}
}
