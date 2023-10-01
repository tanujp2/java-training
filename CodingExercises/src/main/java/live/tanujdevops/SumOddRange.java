package live.tanujdevops;

public class SumOddRange {
	public static void main(String[] args) {
		System.out.println(sumOdd(1, 100));
		System.out.println(sumOdd(-1, 100));
		System.out.println(sumOdd(100, 100));
		System.out.println(sumOdd(13, 13));
		System.out.println(sumOdd(100, -100));
		System.out.println(sumOdd(100, 1000));
	}

	public static boolean isOdd(int number) {
		if (number <= 0) {
			return false;
		}

		if (number % 2 != 0) {
			return true;
		}

		return false;
	}

	public static int sumOdd(int start, int end) {
		if (start <= 0 || end <= 0 || start > end) {
			return -1;
		}

		int sum = 0;
		for (int number = start; number <= end; number++) {
			if (isOdd(number)) {
				sum += number;
			}
		}

		return sum;
	}
}
