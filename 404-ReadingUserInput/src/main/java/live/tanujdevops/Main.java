package live.tanujdevops;

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

		System.out.println(getInputFromConsole(currentYear));
		System.out.println(getInputFromScanner(currentYear));

	}

	public static String getInputFromConsole(int currentYear) {
		String name = System.console().readLine("Hi, What's your name? ");
		System.out.println("Hi " + name + ", Thanks for tanking the course!");

		String dateOfBirth = System.console().readLine("What year were you born? ");

		int age = currentYear - Integer.parseInt(dateOfBirth);

		return "So you are " + age + " years old";
	}

	public static String getInputFromScanner(int currentYear) {

		return "";
	}
}
