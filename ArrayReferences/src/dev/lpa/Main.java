package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//      reference = myIntArray; access to object in memory but not the object itself
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        modifyArray(myIntArray);

        System.out.println("after change myIntArray " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {

        array[1] = 2;

    }
}