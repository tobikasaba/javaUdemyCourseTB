public class AllFactors {
    public static void main(String[] args) {

        printFactors(10);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");

        }else {
            for (int firstValue = 1; firstValue <= number; firstValue++) {
                if (number % firstValue == 0) {
                    System.out.println(firstValue);
                }
            }
        }
    }

}

