package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("alpha", "bravo", "charlie", "delta"));

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("_________");
        list.forEach((var myString) -> System.out.println(myString));

        System.out.println("__________");

        String prefix = "nato";
        /*
        parameter list used in the lambda should not conflict with the enclosing scope's parameters and local variables.
        lambda parameters can't have the same name as an enclosing blocks variable if not an error is thrown.
        String myString = "enclosing Method's myString";
         */
        list.forEach((var myString) -> {
            char first = myString.charAt(0);
            System.out.println(prefix + " " + myString + " means " + first);
        });
    }
}
