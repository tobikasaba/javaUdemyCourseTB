package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[10] represents the size of an array and the size of an array cant be changed after instantiation
//        you also cant add or delete elements just assign values to the index of the array
        int[] myIntArray = new int[10];


//        this assigns to position 6 because index starts from 0
        myIntArray[5] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

//        array initializer
        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);

        int[] newArray;
//        newArray = {5,4,3,2,1};
//        newArray = new int[]{5, 4, 3, 2, 1};
        newArray = new int[5];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
//      enhanced for loop
        for (int element : newArray) {
//            element is a declared variable like "i" in basic for loop
//            newArray what we are looping over
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(newArray));
        Object objectVariable = newArray;
        if (objectVariable instanceof int[]) {
            System.out.println("objectVariable is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
    }
}