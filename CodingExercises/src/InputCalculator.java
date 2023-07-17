import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        long average = 0;

        while (true) {
            System.out.print("Enter a number: ");
            try {
                int number = Integer.parseInt(scanner.nextLine());
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                try {
                    average = (Math.round((double) sum / count));
                    System.out.println("SUM = " + sum + " AVG = " + average);
                    break;
                } catch (ArithmeticException ae) {
                    System.out.println("SUM = " + sum + " AVG = " + average);
                    break;
                }
            }
        }
    }
}

