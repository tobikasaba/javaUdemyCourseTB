public class SharedDigit {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if ((firstNumber >= 10 && firstNumber <= 99) && (secondNumber >= 10 && secondNumber <= 99)) {

            int firsNumberValue = 0;
            int secondNumberValue = 0;

            while (firstNumber > 0) {
                firsNumberValue = firstNumber % 10;


                int subSecondNumber = secondNumber;

                while (subSecondNumber != 0) {
                    secondNumberValue = subSecondNumber % 10;
                    if (firsNumberValue == secondNumberValue) {
                        return true;
                    }
                    subSecondNumber = subSecondNumber / 10;
                }

                firstNumber = firstNumber / 10;
            }

        }
        return false;
    }
}
