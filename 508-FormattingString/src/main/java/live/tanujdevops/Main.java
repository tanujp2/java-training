package live.tanujdevops;

public class Main {
	public static void main(String[] args) {
		String name = "John";
		int age = 0;
		System.out.println(name + " is " + age);

		System.out.printf("%s is %d%n", name, age);

		for (int i = 10; i <= 100000; i *= 10) {
			System.out.printf("%d %n", i); // by default, left align
		}

		for (int i = 10; i <= 10000000; i *= 10) {
			;
			System.out.printf("%6d %n", i); // right align till length 6
											// because the length of integer is specified as 6
											// after reaching the length 6 align left
		}

		double price = 6.0;
		System.out.printf("price = %f%n", price); // prints to 6 decimal places
		System.out.printf("price = %.2f%n", price); // prints to 2 decimal places

		double newPrice = 8.678;
		System.out.printf("new price = %.2f%n", newPrice); // prints to 2 decimal places with rounding

		String formattedString = String.format("%s is %02d", name, age);
		System.out.println(formattedString);

		System.out.println("%s is %d years old".formatted(name, age)); //java15, equivalent to String.format(this, args)
	}
}
