package live.tanujdevops;

public class Challenge1 {
	public static void main(String[] args) {
		for (int number = 5; number <= 20; number++) {
			if (isEvenNumber(number)) {
				System.out.println(number + " is even");
			}
		}
	}

	public static boolean isEvenNumber(int number) {
		if (number % 2 != 0) {
			return false;
		}
		return true;
	}
}
