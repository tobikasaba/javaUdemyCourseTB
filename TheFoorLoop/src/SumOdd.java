public class SumOdd {

    public static void main(String[] args) {

        System.out.println(sumOdd(10, 5));
    }

    public static boolean isOdd( int number) {
        if (number <= 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        }else {
            return false;
        }
    }

    public static int sumOdd (int start, int end) {

        int totalOddNumbers = 0;

        if ((start <= 0 || end <= 0 ) || (end < start)) {
            return -1;
        }
        for (int startNumber = start; startNumber <= end; startNumber ++) {
            if (isOdd(startNumber)) {
                totalOddNumbers += startNumber;
            }
        }

        return totalOddNumbers;

    }
}
