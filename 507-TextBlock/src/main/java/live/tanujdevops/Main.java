package live.tanujdevops;

public class Main {
	public static void main(String[] args) {
		String bulletIt = "Print a bulleted list: " + "\n\t\u2022 First point" + "\n\t\u2022 Second point";
		System.out.println(bulletIt);

		String textBlock = """
				Print a bulleted list
					\u2022 First point
						\u2022 Sub point
				""";
		System.out.println(textBlock);

		int age = 35;
		System.out.printf("Your age is %d", age);
	}
}
