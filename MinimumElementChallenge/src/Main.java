import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("The minimum number is " + findMin(readIntegers()));
    }


    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list of integers separated by commas: ");
        String input = scanner.nextLine();
        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++)
            values[i] = Integer.parseInt(splits[i].trim());
        System.out.println(Arrays.toString(values));
        return values;
    }

    public static int findMin(int[] array) {
        Arrays.sort(array);
        return array[0];
    }
}