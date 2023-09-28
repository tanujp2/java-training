package live.tanujdevops;

public class PositiveNegativeOrZero {
	public static void main(String[] args) {
		checkNumber(0);
		checkNumber(-0);
		checkNumber(1);
		checkNumber(-1);
	}

	public static void checkNumber(int number) {
		if (number > 0) {
			System.out.println("positive");
		} else if (number < 0) {
			System.out.println("negative");
		} else {
			System.out.println("zero");
		}
	}
}
