package live.tanujdevops;

public class LargestPrime {
	public static void main(String[] args) {
		System.out.println(getLargestPrime(21));
		System.out.println(getLargestPrime(217));
		System.out.println(getLargestPrime(0));
		System.out.println(getLargestPrime(45));
		System.out.println(getLargestPrime(-1));
		System.out.println(getLargestPrime(1));
		System.out.println(getLargestPrime(17));
		System.out.println(getLargestPrime(2147483646));
	}

	public static int getLargestPrime(int number) {
		if (number <= 1) {
			return -1;
		}

		int largestPrime = 2;

		for (int i = largestPrime; i <= number; i++) {
			if (number % i == 0) {
				boolean isPrime = true;
				for (int j = 2; j <= (int) Math.sqrt(i); j++) {
					if (i % j == 0) {
						isPrime = false;
					}
				}
				if (isPrime && i > largestPrime) {
					largestPrime = i;
				}
			}
		}

		return largestPrime;
	}

//	public static boolean isPrime(int number) {
//		for (int j = 2; j <= (int) Math.sqrt(number); j++) {
//			if (number % j == 0) {
//				return false;
//			}
//		}
//		return true;
//	}
}
