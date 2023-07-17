package academy.learnprogramming;

public class OperatorChallenge {
    public static void main(String[] args) {
        double firstDoubleValue = 20.00d;
        double secondDoubleValue = 80.00d;

        double totalDouble = (firstDoubleValue + secondDoubleValue) * 100.00d;
        System.out.println("totalDouble = " + totalDouble);

        double remainder = totalDouble % 40.00d;
        System.out.println("remainder = " + remainder);

        boolean remainderCheck  = (remainder == 0) ? true : false;
        System.out.println("remainderCheck = " + remainderCheck);


        if (!remainderCheck) {
            System.out.println("Got some remainder");
        }
    }
}
