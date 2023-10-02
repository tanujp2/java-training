package live.tanujdevops;

public class LastDigitChecker {
	public static void main(String[] args) {
		System.out.println("hasSameLastDigit (41, 22, 71) " + hasSameLastDigit(41, 22, 71));
		System.out.println("hasSameLastDigit (23, 32, 42) " + hasSameLastDigit(23, 32, 42));
		System.out.println("hasSameLastDigit (9, 99, 999) " + hasSameLastDigit(9, 99, 999));
		System.out.println("isValid(10) " + isValid(10));
		System.out.println("isValid(468) " + isValid(468));
		System.out.println("isValid(1051) " + isValid(1051));
	}

	public static boolean hasSameLastDigit(int n1, int n2, int n3) {
		if (!isValid(n1) || !isValid(n2) || !isValid(n3)) {
			return false;
		}

		int lastDigitOfN1 = n1 % 10;
		int lastDigitOfN2 = n2 % 10;
		int lastDigitOfN3 = n3 % 10;

		if (lastDigitOfN1 == lastDigitOfN2 || lastDigitOfN1 == lastDigitOfN3 || lastDigitOfN2 == lastDigitOfN3) {
			return true;
		}

		return false;
	}

	public static boolean isValid(int number) {
		return number >= 10 && number <= 1000 ? true : false;
	}
}
