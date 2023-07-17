public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
    }

    public static int getGreatestCommonDivisor (int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int maxValue = 0;
        int divisor = 1;
        while (divisor <= first || divisor <= second) {
            if (first % divisor == 0 && second % divisor == 0 ) {
                maxValue = divisor ;
            }
            divisor ++;
        }
        return maxValue;
    }
}
