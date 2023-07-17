import java.util.Scanner;

public class ReadingUserInputChallenge {


    public static void main(String[] args) {
        summingNumbers();
    }
    public static void summingNumbers() {
        int numberCount = 1;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (numberCount < 6) {
            System.out.println("Enter number #" + numberCount + ":");
            try {
                double number = Double.parseDouble(scanner.nextLine());
                sum += number;
                numberCount++;
            }catch(NumberFormatException e) {
                System.out.println("Letters not allowed, Please enter a valid number");
            }
        }

        System.out.println("The total sum of the numbers entered is " + sum);

    }
}
