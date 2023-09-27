package live.tanujdevops;

public class TeenNumberChecker {
	public static void main(String[] args) {
		System.out.println(hasTeen(9, 99, 19));
		System.out.println(hasTeen(23, 15, 42));
		System.out.println(hasTeen(22, 23, 34));
	}

	public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
		return isTeen(firstNumber) ? true : isTeen(secondNumber) ? true : isTeen(thirdNumber) ? true : false;
	}

	public static boolean isTeen(int number) {
		return number >= 13 && number <= 19;
	}
}
