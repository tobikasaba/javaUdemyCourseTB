import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        reverse(array);
    }

    public static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[maxIndex--];
        }
        System.out.println(Arrays.toString(reversedArray));
        return array;
    }
}