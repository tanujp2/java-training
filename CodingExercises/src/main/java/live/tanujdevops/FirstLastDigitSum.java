package live.tanujdevops;

public class FirstLastDigitSum {
	public static void main(String[] args) {
		System.out.println("Sum of first and last digits of 252 = " + sumFirstAndLastDigit(252));
		System.out.println("Sum of first and last digits of 257 = " + sumFirstAndLastDigit(257));
		System.out.println("Sum of first and last digits of 0 = " + sumFirstAndLastDigit(0));
		System.out.println("Sum of first and last digits of 5 = " + sumFirstAndLastDigit(5));
		System.out.println("Sum of first and last digits of -10 = " + sumFirstAndLastDigit(-10));
	}

	public static int sumFirstAndLastDigit(int number) {
		if (number < 0) {
			return -1;
		}

		int lastDigit = number % 10;
		int firstDigit = 0;

		while (number != 0) {
			firstDigit = number % 10;
			number /= 10;
		}

		return firstDigit + lastDigit;
	}
}
