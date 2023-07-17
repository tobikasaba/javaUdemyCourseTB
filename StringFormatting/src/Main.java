public class Main {
    public static void main(String[] args) {
//        pre JDK 15
//        \u2022 is unicode for a bullet point
        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                        \u2022 First Point
                            \u2022 Sub Point""";
        System.out.println(textBlock);


        int age = 35;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age);


        for (int i = 1; i <= 10000; i *= 10) {
//            6 here specifies the number of spaces that the variable "i" should fill.
//            in this case the firs =t digit starts from 6th position
            System.out.printf("Printing %6d %n", i);

        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);


        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}