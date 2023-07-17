public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (23, 32, 42));
    }

    public static boolean hasSameLastDigit (int firstNumber, int secondNumber,
                                    int thirdNumber) {

        if ((firstNumber >= 10 && firstNumber <= 1000) && (secondNumber >= 10 && secondNumber <= 1000)
                && (thirdNumber >= 10 && thirdNumber <= 1000)) {
            int firstNumberValue = 0;
            int secondNumberValue = 0;
            int thirdNumberValue = 0;

            while (true) {
                firstNumberValue = firstNumber % 10;
                secondNumberValue = secondNumber % 10;
                thirdNumberValue = thirdNumber % 10;

                return (firstNumberValue == secondNumberValue) || (firstNumberValue == thirdNumberValue) ||
                        (secondNumberValue == thirdNumberValue);

            }
        }
        return false;
    }

    public static boolean isValid (int number){
        if (number >= 10 && number <= 1000) {
            return true;
        }else {
            return false;
        }
    }
}
