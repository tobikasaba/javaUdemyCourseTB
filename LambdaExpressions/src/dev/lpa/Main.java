package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

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

        var coords = Arrays.asList(
                new double[]{47.2160, -95.2348},
                new double[]{29.1566, -89.2495},
                new double[]{35.1556, -90.0659});

        coords.forEach(s -> System.out.println(Arrays.toString(s)));

        BiConsumer<Double, Double> p1 = (lat, lng) -> System.out.printf("[lat:%.3f lon:%3f]%n", lat, lng);
    }


    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2) {

        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T, T> consumer) {
        consumer.accept(t1, t2);
    }
}
