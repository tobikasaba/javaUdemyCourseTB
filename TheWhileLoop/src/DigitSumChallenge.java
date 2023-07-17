public class DigitSumChallenge {

    public static void main(String[] args) {

        System.out.println(sumDigits(1234));
    }

    public static int sumDigits (int number) {

        int total = 0;

        if (number < 1){
            return -1;
        } else if (number <= 9) {
            return number;
        }

        for (int value = number; value != 0; value = value / 10) {

            total += (value % 10);


        }

        return total;
    }
}
