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

//		using + operator
		newBirthDate = "25" + "/" + "11" + "/" + "1982";
//		this is more efficient because the java compiler recognizes the above concatenation as single string
//		because of the use of string literal, which are compile time constants
		System.out.println("newBirthDate = " + newBirthDate);

//		using concat() method-chaining
		newBirthDate = "25".concat("/").concat("11").concat("/").concat("1982");
//		this is still not that efficient, because it also create many string objects
		System.out.println("newBirthDate = " + newBirthDate);

//		replacing characters
		System.out.println(newBirthDate.replace("/", "-")); // replaces all occurrences of / with -
		System.out.println(newBirthDate.replace("2", "00"));

		System.out.println(newBirthDate.replaceFirst("/", "-"));
		System.out.println(newBirthDate.replaceAll("/", "---"));

		System.out.println("ABC\n".repeat(3));
		System.out.println("ABC\n".repeat(3).indent(4));
		System.out.println("    ABC\n".repeat(3).indent(-2));
	}
}
