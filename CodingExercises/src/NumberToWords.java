public class NumberToWords {

    public static void main(String[] args) {

        numberToWords(1000);
    }

    public static int reverse(int numberValue) {
        int reverseNumber = 0;
        while (numberValue > 0) {
            int remainder = numberValue % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            numberValue = numberValue / 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int numberCount) {
        int count = 0;
        if (numberCount == 0) {
            count = 1;
        } else if (numberCount < 0) {
            return -1;
        }

        while (numberCount != 0) {
            count++;
            numberCount = numberCount / 10;
        }

        return count;
    }

    public static void numberToWords(int number) {
//        System.out.println(number + " before");

        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {

            int reversed = reverse(number);
            int numberDigitCount = getDigitCount(number);
            int reversedNumberDigitCount = getDigitCount(reversed);
            int remainder = 0;
            StringBuilder numberWordsString = new StringBuilder();
            while (reversed > 0) {
                remainder = reversed % 10;
                switch (remainder) {
                    case 0 -> numberWordsString.append("Zero ");
                    case 1 -> numberWordsString.append("One ");
                    case 2 -> numberWordsString.append("Two ");
                    case 3 -> numberWordsString.append("Three ");
                    case 4 -> numberWordsString.append("Four ");
                    case 5 -> numberWordsString.append("Five ");
                    case 6 -> numberWordsString.append("Six ");
                    case 7 -> numberWordsString.append("Seven ");
                    case 8 -> numberWordsString.append("Eight ");
                    case 9 -> numberWordsString.append("Nine ");
                    default -> {
                    }
                }
                reversed /= 10;
            }
            if (numberDigitCount > reversedNumberDigitCount) {
                for (int i = 0; i < (numberDigitCount - reversedNumberDigitCount); i++) {
                    numberWordsString.append("Zero ");
                }
            }

            System.out.println(numberWordsString);
        }
    }
}
