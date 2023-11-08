package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StringArrayList {
    public static void main(String[] args) {

        //        List not baked by the array
        List<String> firstName = new ArrayList<>(Arrays.asList("AnNA", "BoB", "ToBI", "BrAVo"));

        firstName.replaceAll(name -> name.toUpperCase());
        System.out.println("The list of first names is " + firstName);
        firstName.forEach(name -> System.out.println(name));

        System.out.println("----------");
        firstName.replaceAll(name -> name + " " + (char) (new Random().nextInt(26) + 'A') + ".");
        System.out.println("The list of first names with initials is " + firstName);
        firstName.forEach(name -> System.out.println(name));

        System.out.println("----------");
        firstName.replaceAll(name -> {
                    StringBuilder reversedName = new StringBuilder();
                    String splitName = (name.split(" ")[0]);
                    return name + " " + reversedName.append(splitName).reverse();
                    /*
                    String[] splitName = (name.split(" ", 2));
                    return name + " " + reversedName.append(splitName[0]).reverse();
                     */
                }
        );
        System.out.println("The list of full names is " + firstName);
        firstName.forEach(name -> System.out.println(name));

        System.out.println("----------");
        ArrayList<String> modifiedNames = new ArrayList<>(firstName);
        modifiedNames.removeIf(name -> {
            String first = name.substring(0, name.indexOf(" "));
            String last = name.substring(name.lastIndexOf(" ") + 1);
            return first.equals(last);
        });
        System.out.println("Removing the list name(s) with the same first and last " + modifiedNames);
        modifiedNames.forEach(names -> System.out.println(names));

    }
}