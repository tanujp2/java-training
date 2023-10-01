package live.tanujdevops;

public class Challenge1 {
	public static void main(String[] args) {
		int number = 5;
		int countEven = 0;
		int countOdd = 0;

		while (number <= 20) {
			if (isEvenNumber(number)) {
				countEven++;
				System.out.println(number + " is even");
				if (countEven == 5) {
					break;
				}
			} else {
				countOdd++;
			}
			number++;
		}

		System.out.println("Total even = " + countEven);
		System.out.println("Total odd = " + countOdd);
	}

	public static boolean isEvenNumber(int number) {
		if (number % 2 != 0) {
			return false;
		}
		return true;
	}
}
