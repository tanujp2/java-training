package live.tanujdevops;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int currentYear = 2023;
//		String usersDateOfBirth = "1999";
//
//		int dateOfBirth = Integer.parseInt(usersDateOfBirth);
//
//		System.out.println("Age = " + (currentYear - dateOfBirth));
//
//		String usersAgeWithPartialYear = "22.5";
//		double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
//
//		System.out.println("user say he's " + ageWithPartialYear);

		try {
			System.out.println(getInputFromConsole(currentYear));
		} catch (NullPointerException e) {
			System.out.println(getInputFromScanner(currentYear));
		}

	}

	public static String getInputFromConsole(int currentYear) {
		String name = System.console().readLine("Hi, What's your name? ");
		System.out.println("Hi " + name + ", Thanks for tanking the course!");

		String dateOfBirth = System.console().readLine("What year were you born? ");

		int age = currentYear - Integer.parseInt(dateOfBirth);

		return "So you are " + age + " years old";
	}

	public static String getInputFromScanner(int currentYear) {
		Scanner scanner = new Scanner(System.in);

//		String name = System.console().readLine("Hi, What's your name? ");
		System.out.println("Hi, What's your name?");
		String name = scanner.nextLine();

		System.out.println("Hi " + name + ", Thanks for tanking the course!");

//		String dateOfBirth = System.console().readLine("What year were you born? ");
		System.out.println("What year were you born?");

		boolean validDOB = false;
		int age = 0;
		do {
			System.out.println("Enter a year of bith >= " + (currentYear - 125) + " and <= " + currentYear);

			try {
				age = checkData(currentYear, scanner.nextLine());

				validDOB = age < 0 ? false : true;
			} catch (NumberFormatException ex) {
				System.out.println("Characters not allowed!!! Try again.");
			}
		} while (!validDOB);

		return "So you are " + age + " years old";

	}

	public static int checkData(int currentYear, String dateOfBirth) {
		int dob = Integer.parseInt(dateOfBirth);
		int minimumYear = currentYear - 125;

		if (dob < minimumYear || dob > currentYear) {
			return -1;
		}

		return (currentYear - dob);
	}
}
