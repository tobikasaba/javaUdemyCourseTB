public class Main {
    public static void main(String[] args) {
        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");
/*
        you cant assign a string literal to a string builder variable
        StringBuilder helloWorldBuilder = "Hello" + " Word";
*/
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorld.concat(" and Goodbye"));
        printInformation(helloWorldBuilder);
//        by default an empty string builder starts with a capacity of 16 meaning it can fill 16 characters
//        before it request more memory
        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(57));

//        created a string builder with a capacity of 32
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16, "g");
        System.out.println(builderPlus);

        builderPlus.replace(16,17,"G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInformation(String string) {

        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {

        System.out.println("StringBuilder = " + builder);
        System.out.println("Length = " + builder.length());
//        by default an empty string builder starts with a capacity of 16 meaning it can fill 16 characters
//        before it request more memory
        System.out.println("capacity = " + builder.capacity());
    }
}