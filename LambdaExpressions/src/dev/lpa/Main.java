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

//        using forEach Method to iterate over the coords List and then using Arrays.toString to print each value of the array out
        coords.forEach(s -> System.out.println(Arrays.toString(s)));

        /*
        lambda expression can be assigned to a local variable. As you can see below.
        Declaring a variable with a lambda expression doesn't execute it. To do so, execute the functional method on the variable or pass the variable to a method that does the same thing
        In this, the lambda expression defines what should happen to the arguments passed into the accept method of the BiConsumer interface.
         */
        BiConsumer<Double, Double> p1 = (lat, lng) -> System.out.printf("[lat:%.3f lon:%3f]%n", lat, lng);

        var firstPoint = coords.get(0);

//        execute the functional method on the variable
        p1.accept(firstPoint[0], firstPoint[1]);

//        pass the variable to a method that does the same thing
        processPoint(firstPoint[0], firstPoint[1], p1);

        System.out.println("_____");
        coords.forEach(s -> processPoint(s[0], s[1], p1));
        coords.forEach(s -> processPoint(s[0], s[1],
                (lat, lng) -> System.out.printf("[lat:%.3f lon:%3f]%n", lat, lng)));

        list.removeIf(s -> s.equalsIgnoreCase("bravo"));
        list.forEach(s -> System.out.println(s));

        System.out.println("---------");
        list.addAll(List.of("echo", "easy", "earnest"));
        list.forEach(s -> System.out.println(s));

        System.out.println("---------");
        list.removeIf((s -> s.startsWith("ea")));
        list.forEach(s -> System.out.println(s));
    }


    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2) {

        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }

    /**
     * This method allows reference calls to the BiConsumer functional interface.
     *
     * @param t1       first argument of the method of generic type
     * @param t2       second argument of the method generic type
     * @param consumer variable
     * @param <T>      generic parameter which allows access to the method in the BiConsumer interface
     */
    public static <T> void processPoint(T t1, T t2, BiConsumer<T, T> consumer) {
        consumer.accept(t1, t2);
    }
}
