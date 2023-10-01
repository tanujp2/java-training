package live.tanujdevops;

public class Challenge1 {
	public static void main(String[] args) {
		int number = 5;
		int totalEven = 0;
		int totalOdd = 0;

		while (number <= 20) {
			if (isEvenNumber(number)) {
				totalEven++;
				System.out.println(number + " is even");
				if (totalEven == 5) {
					break;
				}
			} else {
				totalOdd++;
			}
			number++;
		}

		System.out.println("Total even = " + totalEven);
		System.out.println("Total odd = " + totalOdd);
	}

	public static boolean isEvenNumber(int number) {
		if (number % 2 != 0) {
			return false;
		}
		return true;
	}
}
