package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

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

        list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());
        System.out.println("---------");
        list.forEach(s -> System.out.println(s));

        System.out.println("---------");
        String[] emptyStrings = new String[10];
        System.out.println(Arrays.toString(emptyStrings));

        Arrays.fill(emptyStrings, " ");
        System.out.println(Arrays.toString(emptyStrings));

        Arrays.setAll(emptyStrings, (i) -> "" + (i + 1) + ". ");
        System.out.println(Arrays.toString(emptyStrings));

//        using switch expressions in lambda
        Arrays.setAll(emptyStrings, (i) -> "" + (i + 1) + ". "
                        + switch (i) {
                    case 0 -> "one";
                    case 1 -> "two";
                    case 2 -> "three";
                    default -> "";
                }
        );
        System.out.println(Arrays.toString(emptyStrings));

        String[] names = {"Ann", "Bob", "Carol", "David", "Ed", "Fred"};
//        in a lambda expression you can have empty parenthesis on the left hand side of the expression which means no argument
        String[] randomList = randomlySelectedValues(15, names, () -> new Random().nextInt(0, names.length));
        System.out.println(Arrays.toString(randomList));
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

    /**
     * This method returns an Array of String with the same number of elements that are passed as the first element.
     * In this case int
     *
     * @param count  number of elements to return
     * @param values This is used to get a value randomly picked form that Array
     * @param s      Used to get an integer, to use as the index to pick the name.
     * @return
     */
    public static String[] randomlySelectedValues(int count, String[] values, Supplier<Integer> s) {

        String[] selectedValues = new String[count];
        for (int i = 0; i < count; i++) {
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;
    }
}
