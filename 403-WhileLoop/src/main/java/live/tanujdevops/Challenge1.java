package live.tanujdevops;

public class Challenge1 {
	public static void main(String[] args) {
		int number = 5;
		while (number <= 20) {
			if (isEvenNumber(number)) {
				System.out.println(number + " is even");
			}
			number++;
		}
	}

	public static boolean isEvenNumber(int number) {
		if (number % 2 != 0) {
			return false;
		}
		return true;
	}
}
