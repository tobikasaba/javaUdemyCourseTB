package academy.learnprogramming;

public class FloatAndDouble  {
    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue =  5.25f;
        double myDoubleValue = 5d;


        double myPounds = 200d;
        double myPoundsToKilogram = myPounds * 0.45359237;

        System.out.println(myPoundsToKilogram);

    }
}
