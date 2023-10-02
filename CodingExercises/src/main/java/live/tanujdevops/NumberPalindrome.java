package live.tanujdevops;

public class NumberPalindrome {
	public static void main(String[] args) {
		System.out.println("-1221 is " + (isPalindrome(-1221) ? "a" : "NOT a") + " palindrome");
		System.out.println("707 is " + (isPalindrome(707) ? "a" : "NOT a") + " palindrome");
		System.out.println("11212 is " + (isPalindrome(11212) ? "a" : "NOT a") + " palindrome");
	}

	public static boolean isPalindrome(int number) {
		int originalNumber = number;
		int reversedNumber = 0;

		while (number != 0) {
			reversedNumber = reversedNumber * 10 + (number % 10);
			number /= 10;
		}

		if (reversedNumber == originalNumber) {
			return true;
		}

		return false;
	}
}
