package live.tanujdevops;

public class Challenge2PrimeNumberCounter {
	public static void main(String[] args) {
		int primeNumberCount = 0;

		for (int number = 0; number <= 1000; number++) {
			if (isPrime(number)) {
				System.out.println(number);
				primeNumberCount++;

				if (primeNumberCount == 3) {
					break;
				}
			}
		}
	}

	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}

		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}

		return true;
	}
}
