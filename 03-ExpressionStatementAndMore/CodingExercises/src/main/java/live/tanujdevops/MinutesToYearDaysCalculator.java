package live.tanujdevops;

// XX min = YY y and ZZ d

public class MinutesToYearDaysCalculator {
	public static void main(String[] args) {
		printYearsAndDays(525600);
		printYearsAndDays(1051200);
		printYearsAndDays(561600);
		printYearsAndDays(-525600);
	}

	public static void printYearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("Invalid Value");
			return;
		}

		int minutesInADay = 24 * 60;
		int minutesInAYear = 365 * minutesInADay;

		long years = minutes / minutesInAYear;
		long remainingMinutes = minutes % minutesInAYear;
		long days = remainingMinutes / minutesInADay;

		System.out.printf("%d min = %d y and %d d\n", minutes, years, days);
	}
}
