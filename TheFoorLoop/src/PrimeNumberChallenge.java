public class PrimeNumberChallenge {

    public static void main(String[] args) {

//        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
//        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
//        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
//        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");
//
//        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
//        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number");

//        System.out.println(primeNumberCounter(10 ));

        System.out.println(threeAndFiveChallenge(10));
    }

    public static boolean isPrime( int wholeNumber) {


        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor  = 2; divisor < wholeNumber/2; divisor ++) {
            if (wholeNumber % divisor == 0 ) {
                return false;
                }
            }
        return true;
    }

    public static String primeNumberCounter (int value) {

        int primeNumberCount = 0;

//        int number;

        for (int number = value; number <= 1000; number++) {
//            or

//        for (int number = value; primeNumberCount < 3 && number <= 1000; number++) {

            if (isPrime(number) && primeNumberCount < 3) {
                primeNumberCount++;
                System.out.println(number + " is a prime number, and we have counted " + primeNumberCount + " prime numbers");
            } else if (primeNumberCount >= 3) {
                break;
            }
        }

        return "3 prime numbers have been found. Loop Terminated";
    }

    public static String threeAndFiveChallenge( int value) {

        int divisibleCount = 0;
        int numberSum = 0;

//        (int number = value; number <= 1000; number++)

        if ((value < 1 || value > 1000)) {
            return "Invalid number please enter a number from 1 to 1000";
        }

        for (int i = value; i <= 1000; i ++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {

                divisibleCount ++;
                numberSum += i;
                System.out.println( i + " is divisible by both 3 and 5 ");

            } else if (divisibleCount == 5) {
                System.out.println("5 divisible numbers have been found. Closing loop");
                break;

            }
        }
        return "The sum of the numbers that met the conditions is " + numberSum;
    }
}
