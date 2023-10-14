package live.tanujdevops;

public class App {
    public static void main(String[] args) {
        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");

//       StringBuilder helloWorldBuilder = "Hello" + " World";

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder(); //default capacity is 16, next capacity is determined by the JVM
        StringBuilder emptyStart32 = new StringBuilder(32);

        printInformation(emptyStart);
        printInformation(emptyStart32);
    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}
