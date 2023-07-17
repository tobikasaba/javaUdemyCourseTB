public class NumberPalindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(707));
    }

    public static boolean isPalindrome (int number) {
        int reverseNumber = 0;
        int startNumber = number;
        while (number != 0) {
            int remainder = number % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            System.out.println("This is " + reverseNumber);
            number = number/ 10;
        }
        return startNumber== reverseNumber;
    }
}
