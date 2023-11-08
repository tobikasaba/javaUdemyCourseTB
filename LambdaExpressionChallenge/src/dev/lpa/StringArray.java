package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StringArray {

    private static Random random = new Random();

    public static void main(String[] args) {
        String[] firstNames = {"AnNA", "BoB", "ToBI", "BrAVo"};

        Arrays.setAll(firstNames, i -> firstNames[i].toUpperCase());
        System.out.println("---> Transform to Uppercase");
        System.out.println(Arrays.toString(firstNames));

        List<String> backedByArray = Arrays.asList(firstNames);

        backedByArray.replaceAll(name -> name + " " + getRandomChar('A', 'D') + ".");
        System.out.println("---> Add random middle initial");
        System.out.println(Arrays.toString(firstNames));

        backedByArray.replaceAll(name -> name + " " + getReverseName(name.split(" ")[0]));
        System.out.println("---> Add reversed name as last name");
        /*
        because the list is backed by an array when created in line 18,
        whenever changes are made calling the list it affects the array itself
        hence the line bellow shows how to call said array using for each method
         */
        Arrays.asList(firstNames).forEach(names -> System.out.println(names));

//        List not baked by the array
        List<String> newList = new ArrayList<>(List.of(firstNames));
        newList.removeIf(name -> name.substring(0, name.indexOf(" ")).equals(
                name.substring(name.lastIndexOf(" ") + 1)
        ));
        System.out.println("---> Remove names where first = last");
        newList.forEach(names -> System.out.println(names));
    }

    public static char getRandomChar(char startChar, char endChar) {
        return (char) random.nextInt((int) startChar, (int) endChar + 1);
    }

    public static String getReverseName(String firstname) {
        return new StringBuilder(firstname).reverse().toString();
    }
}
