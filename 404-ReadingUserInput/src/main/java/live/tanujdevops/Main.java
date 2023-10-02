package live.tanujdevops;

public class Main {
	public static void main(String[] args) {
		int currentYear = 2023;
		String usersDateOfBirth = "1999";

		int dateOfBirth = Integer.parseInt(usersDateOfBirth);

		System.out.println("Age = " + (currentYear - dateOfBirth));
	}
}
