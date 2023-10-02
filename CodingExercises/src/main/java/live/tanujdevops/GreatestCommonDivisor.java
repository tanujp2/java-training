package live.tanujdevops;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		System.out.println("GreatestCommonDivisor(12, 30) = " + getGreatestCommonDivisor(12, 30));
		System.out.println("GreatestCommonDivisor(12, 24) = " + getGreatestCommonDivisor(12, 24));
		System.out.println("GreatestCommonDivisor(25, 15) = " + getGreatestCommonDivisor(25, 15));
		System.out.println("GreatestCommonDivisor(12, 30) = " + getGreatestCommonDivisor(12, 30));
		System.out.println("GreatestCommonDivisor(9, 18) = " + getGreatestCommonDivisor(9, 18));
		System.out.println("GreatestCommonDivisor(81, 153) = " + getGreatestCommonDivisor(81, 153));
	}

	public static int getGreatestCommonDivisor(int first, int second) {
		if (first < 10 || second < 10) {
			return -1;
		}

		if (first > second) {
			int temp = first;
			first = second;
			second = temp;
		}

		int gcd = 1;

		if (second % first == 0) {
			return gcd = first;
		}

		for (int i = 1; i <= first / 2; i++) {
			if (first % i == 0 && second % i == 0) {
				if (i > gcd) {
					gcd = i;
				}
			}
		}

		return gcd;
	}
}