import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int currentYear = 2022;

        try {
//            statement that might get errors
            System.out.println(getInputFromConsole(currentYear));
//            "NullPointerException" represents the error thats likely to be produced
//            "e" represents the variable name. common practice to use "e"
//            the variable "e" is made because if you wanted to access info about the exception you can use "e"
        } catch (NullPointerException e) {
//            reaction to the error that is likely to be produced
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {

//        System.console() cant be used in intelliJ because IDEs disable the console
//        to use it, you'll have to run it from a command line terminal session
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
//        System.in allows you to type a variable into the console and then it returns it back
//        new is used to create an instance of scanner that is creating a new object of type scanner
        Scanner scanner = new Scanner(System.in);

//        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi what's your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!");


//        String dateOfBirth = System.console().readLine( "What year were you born? ");
        System.out.println("What year were you born");
//        String dateOfBirth = scanner.nextLine();

//        parseInt used to convert the string to an integer
//        int age = currentYear - Integer.parseInt(dateOfBirth);


        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " AND <= " + (currentYear));
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age >= 0;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!!! Try again");
            }
        } while (!validDOB);

        return "So you are " + age + " years old";
    }


    public static int checkData(int currentYear, String dateOfBirth) {


        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;


        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);
    }
}