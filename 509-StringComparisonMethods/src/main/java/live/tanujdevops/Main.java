package live.tanujdevops;

public class Main {
	public static void main(String[] args) {
		String birthDate = "25/11/1982";
		int startingIndex = birthDate.indexOf("1982");
		System.out.println("startingIndex = " + startingIndex);
		System.out.println("Birth year = " + birthDate.substring(startingIndex));
		System.out.println("Month = " + birthDate.substring(3, 5));

//		join series of strings with some delimiter
		String newBirthDate = String.join("/", "25", "11", "1982");
		System.out.println("newBirthDate = " + newBirthDate);

//		using concat
		newBirthDate = "25";
		newBirthDate = newBirthDate.concat("/");
		newBirthDate = newBirthDate.concat("11");
		newBirthDate = newBirthDate.concat("/");
		newBirthDate = newBirthDate.concat("1982");
//		this practice is strongly discouraged, because it creates a whole new objects
//		it is similar to using + operator on string literals but does the process more
//		inefficiently
		System.out.println("newBirthDate = " + newBirthDate);
	}
}