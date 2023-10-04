package live.tanujdevops;

import java.util.Scanner;

public class Challenge1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 1;

		do {
			System.out.print("Enter number #" + count + ": ");
			int number = 0;

			try {
				number = Integer.parseInt(scanner.nextLine());
				sum += number;
				count++;
			} catch (NumberFormatException ex) {
				System.out.println("Invalid number");
			}

		} while (count <= 5);

		System.out.println("The sum is " + sum);

		scanner.close();
	}
}
