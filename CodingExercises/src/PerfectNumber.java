public class PerfectNumber {


    public static void main(String[] args) {
        System.out.println(isPerfectNumber(5));
    }


    public static boolean isPerfectNumber (int number) {

        if (number < 1) {
            return false;
        }
        int divisorSum = 0;

        int divisor = 1;
        while (divisor < number) {
            if (number % divisor == 0) {
                divisorSum += divisor;
            }
            divisor ++;
        }

        return divisorSum == number;
    }
}
