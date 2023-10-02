package live.tanujdevops;

public class NumberToWords {
	public static void main(String[] args) {
		numberToWords(123);
		numberToWords(1010);
		numberToWords(1000);
		numberToWords(-12);
		numberToWords(0);
		numberToWords(1);
		numberToWords(1234567890);
	}

	public static void numberToWords(int number) {
		if (number < 0) {
			System.out.println("Invalid Value");
			return;
		} else if (number == 0) {
			System.out.println("Zero");
			return;
		}

		int reversedNumber = reverse(number);
		int numberDigitCount = getDigitCount(number);
		int reversedNumberDigitCount = getDigitCount(reversedNumber);

		while (reversedNumber > 0) {
			switch (reversedNumber % 10) {
			case 0:
				System.out.print("Zero ");
				break;
			case 1:
				System.out.print("One ");
				break;
			case 2:
				System.out.print("Two ");
				break;
			case 3:
				System.out.print("Three ");
				break;
			case 4:
				System.out.print("Four ");
				break;
			case 5:
				System.out.print("Five ");
				break;
			case 6:
				System.out.print("Six ");
				break;
			case 7:
				System.out.print("Seven ");
				break;
			case 8:
				System.out.print("Eight ");
				break;
			case 9:
				System.out.print("Nine ");
				break;
			}

			reversedNumber /= 10;
		}

		if (numberDigitCount != reversedNumberDigitCount) {
			for (int i = 0; i < numberDigitCount - reversedNumberDigitCount; i++) {
				System.out.print("Zero ");
			}
		}

		System.out.println();
	}

	public static int reverse(int number) {
		int reversedNumber = 0;
		while (number != 0) {
			reversedNumber = reversedNumber * 10 + (number % 10);
			number /= 10;
		}

		return reversedNumber;
	}

	public static int getDigitCount(int number) {
		if (number < 0) {
			return -1;
		} else if (number <= 9) {
			return 1;
		}

		int digitCount = 0;

		while (number > 0) {
			digitCount++;
			number /= 10;
		}

		return digitCount;
	}
}
