package academy.learnprogramming;

public class Hello {
    //    public here is an access modifier allows us to define how parts of the code
//    or someone else's can be accessed
//    public gives full access
    public static void main(String[] args){
//        void means that the method wont return any information
//        "String[] args" parameters of the method
        System.out.println("Hello Tobi"); // print an output "Hello World"

        int myFirstNumber = (5 + 10) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = myTotal - 1000;
        System.out.println(myLastOne);

    }
}