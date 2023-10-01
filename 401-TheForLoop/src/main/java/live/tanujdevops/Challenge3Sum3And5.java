package live.tanujdevops;

public class Challenge3Sum3And5 {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		for (int number = 1; number <= 1000; number++) {
			if (number % 3 == 0 && number % 5 == 0) {
				sum += number;
				System.out.println(number + " is divisible by both 3 and 5");
				count++;

				if (count == 5) {
					System.out.println("Found 5 numbers divisible by 3 and 5. Exiting...");
					break;
				}
			}
		}

		System.out.println("Sum = " + sum);
	}
}
