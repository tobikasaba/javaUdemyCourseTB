import java.util.Scanner;


public class MinAndMaxChallenge {

    public static void main(String[] args) {
        numberCheck();
    }

    public static void numberCheck() {

        Scanner scanner = new Scanner(System.in);
        double minValue = 0;
        double maxValue = 0;
        while (true) {
            System.out.println("Enter a number: ");
            try {
                double number = Double.parseDouble(scanner.nextLine());

                if (minValue == 0.0 & maxValue == 0.0) {
                    minValue = number;
                    maxValue = number;
                } else if (number < minValue) {
                    minValue = number;
                } else if (number > maxValue) {
                    maxValue = number;
                }
            } catch (NumberFormatException e) {
                break;
            }

        }

        if (minValue > 0 || maxValue > 0) {
            System.out.println("The minimum value entered is " + minValue + " while the maximum value is " + maxValue);
        }else{
            System.out.println("No valid number entered");
        }
    }
}
