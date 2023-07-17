public class WhileLoopChallenge {

    public static void main(String[] args) {
        int startNumber = 4;
        int endNumber = 20;
        int evenNumberCount = 0;
        int oddNumberCount = 0;
        while ((startNumber <= endNumber) && (evenNumberCount < 5)) {
            startNumber++;
//            if (isEvenNumber(startNumber)) {
//                System.out.println(startNumber + " is an even number");
//            }
            if (!isEvenNumber(startNumber)) {
                oddNumberCount ++;
                continue;
//                continue will bypass any code below it and will start again from the beginning
            }
            evenNumberCount ++;
            System.out.println(startNumber + " is an even number");

//            startNumber++;
        }
        System.out.println("There are " + evenNumberCount + " even numbers and " + oddNumberCount + " odd numbers");
    }

    public static boolean isEvenNumber (int number) {

        if (number%2 == 0) {
            return true;
        }else {
            return false;
        }
    }


}
