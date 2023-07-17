package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] descendingArray = getRandomArray(10);

        System.out.println(Arrays.toString(descendingArray));
        System.out.println(Arrays.toString(reverseArray(descendingArray)));
        System.out.println();
        System.out.println(Arrays.toString(sortIntegers(descendingArray)));
    }


    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];

        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

    private static int[] reverseArray(int[] array) {
        Arrays.sort(array);
        int[] sortedArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[(array.length - 1) - i];
        }
        return sortedArray;
    }

    private static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}