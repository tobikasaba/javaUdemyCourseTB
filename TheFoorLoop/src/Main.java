public class Main {
    public static void main(String[] args) {
//        counter is our variable
//        counter <=5 is our expression on here it says as long as counter is less than
//        or equals to 5. condition of our for loop
//        counter ++ is the increment simply saying increase by one each time
       for (int counter = 1; counter <= 5; counter++) {
           System.out.println(counter);
       }

       for (double rate = 2.0; rate <= 5.0; rate++){
           double interestAmount = calculateInterest(10000.0, rate);
//           System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
       }

        for (double rate = 7.5; rate <= 10.0; rate += (0.25) ) {
            double interestAmount = calculateInterest(100.0, rate);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("100 at " + rate + "% interest = " + interestAmount);
        }
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.00, 2.0));


    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate/100));
    }
}