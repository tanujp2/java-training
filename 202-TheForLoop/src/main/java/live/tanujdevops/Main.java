package live.tanujdevops;

public class Main {
	public static void main(String[] args) {
		for (int counter = 1; counter <= 5; counter++) {
			System.out.println(counter);
		}

		for (double rate = 2.0; rate <= 5.0; rate++) {
			System.out.println("10,000 at " + rate + "% interest = " + calculateInterest(10000, rate));
		}

		for (double rate = 7.5; rate <= 10; rate += 0.25) {
			double interest = calculateInterest(100, rate);
			if (interest > 8.5) {
				break;
			}
			System.out.println("100 at " + rate + "% interest = " + interest);
		}

	}

	public static double calculateInterest(double amount, double interestRate) {
		return amount * (interestRate / 100);
	}
}
