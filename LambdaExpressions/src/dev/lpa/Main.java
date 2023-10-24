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

        int result = calculator((Integer a, Integer b) -> {
            return a + b;
        }, 5, 2);
        var result2 = calculator((var a, var b) -> {
            double c = a / b;
            return c;
        }, 10.0, 2.5);
        var result3 = calculator((var a, var b) -> a / b, 10.0, 2.5);
        var result4 = calculator((a, b) -> a.toUpperCase() + " " + b.toUpperCase(), "Ralph", "Kramden");

    }

    /**
     * This calculator method is used to perform different operations on different types of data.
     *
     * @param function
     * @param value1
     * @param value2
     * @param <T>
     * @return
     */
    public static <T> T calculator(Operation<T> function, T value1, T value2) {

        T result = function.operate(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }
}