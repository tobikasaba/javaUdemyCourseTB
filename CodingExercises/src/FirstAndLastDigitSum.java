public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(99));
    }

    public static int sumFirstAndLastDigit (int number) {

        int firstDigit = 0;
        int lastDigit = 0;
        if (number < 0) {
            return -1;
        }

        if (number <= 9) {
            firstDigit = number;
            lastDigit = number;
            return firstDigit + lastDigit;
        }

        firstDigit = number % 10;

        while (number > 0) {

            if (number <=  9) {
                lastDigit = number;
            }
            number = number / 10;
        }

        return firstDigit + lastDigit;
    }
}
