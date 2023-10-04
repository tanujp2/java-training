package live.tanujdevops;

import java.util.Scanner;

public class InputCalculator {
	public static void main(String[] args) {
		inputThenPrintSumAndAverage();
	}

	public static void inputThenPrintSumAndAverage() {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		long avg = 0;
		int counter = 0;
		while (true) {

			try {
				int nextNumber = Integer.parseInt(scanner.nextLine());
				counter++;
				sum += nextNumber;
			} catch (NumberFormatException ex) {
				avg = Math.round(1.0 * sum / counter);
				break;
			}
		}

		System.out.printf("SUM = %d AVG = %d", sum, avg);
		System.out.println();
		scanner.close();
	}
}
