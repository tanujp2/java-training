package live.tanujdevops;

public class Challenge2 {
	public static void main(String[] args) {
		System.out.println(sumDigits(125));
		System.out.println(sumDigits(100));
		System.out.println(-1);
	}

	public static int sumDigits(int number) {
		if (number < 0) {
			return -1;
		}

		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}

		return sum;
	}
}
