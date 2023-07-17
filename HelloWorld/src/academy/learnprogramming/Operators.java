package academy.learnprogramming;

public class Operators {

    public static void main (String[] args){
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result -1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        result = result * 10; // 2 * 10 = 20

        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);
        result = result % 3; // remainder of 1
        System.out.println("4 % 3 = "+ result);

//        result = result + 1;
        result++;
        System.out.println(("1 + 1 = " + result));

        result --;
        System.out.println("2 - 1 = " + result);

        boolean isAlien = false; // assignment operator
        if (isAlien == false) {
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared of Aliens");
        }

        int topScore = 80;

        if (topScore < 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 81;

        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not supposed to happen");
        }

        // or

        if (isCar) {
            System.out.println("This is not supposed to happen");
            //            isCar equals to true
        }

        //or

        if (!isCar) {
            System.out.println("This is not supposed to happen");
//            isCar not equals to true
        }


        boolean wasCar = (isCar) ? true : false;

        if (!wasCar) {
            System.out.println("wasCar is true");
        }
//        first condition is what we are evaluating to true or false
//        second the value to assign to car if the first condition was true.
//        third the value to assign to car if the first condition was false.

    }
}
