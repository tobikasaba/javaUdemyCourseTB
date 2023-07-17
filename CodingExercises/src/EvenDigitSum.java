public class EvenDigitSum {
    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(252));
    }

    public static int getEvenDigitSum (int number) {

        if (number < 0 ) {
            return -1;
        }
        int total = 0;
        while (number > 0) {

            int value = number % 10;
            number = number / 10;

            if (value % 2 != 0) {
                continue;
            }

            total += value;
        }

        return total;
    }
}
