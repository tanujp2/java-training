package live.tanujdevops;

import java.util.Scanner;

public class Challenge2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double min = -1;
		double max = -1;
		boolean flag = false;

		while (true) {
			try {
				System.out.print("Enter a number to continue or any other character to quit: ");
				double nextNumber = Double.parseDouble(scanner.nextLine());

				if (!flag) {
					flag = true;
					min = max = nextNumber;
					continue;
				}

				if (min < nextNumber) {
					min = nextNumber;
				} else if (max > nextNumber) {
					max = nextNumber;
				}

			} catch (NumberFormatException ex) {
				break;
			}
		}

		System.out.println("Min = " + min);
		System.out.println("Max = " + max);

		scanner.close();
	}
}
