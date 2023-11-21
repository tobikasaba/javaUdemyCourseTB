import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        String name = "Tobi";
        Function<String, String> uCase = String::toUpperCase;
        System.out.println(uCase.apply(name));

        Function<String, String> lastName = s -> s.concat(" Kasaba");
        System.out.println(lastName.apply(name));

//        this executes the uCase variable first and Then (andThen) executes lastName using the result of uCase as the input
        Function<String, String> uCaseLastName = uCase.andThen(lastName);
        System.out.println(uCaseLastName.apply(name));
/*
        here compose executes lastName first then it executes uCase. Therefore, the last name is concatenated to the name string and then capitalised
        compose method is only available to lambda expressions or a unirary operator interface. Other functions category interfaces that take a primitive don't support the compose method
 */
        uCaseLastName = uCase.compose(lastName);
        System.out.println(uCaseLastName.apply(name));

        /*
        when channing lambda methods, it doesnt matter if the type used in the channing matches the expected return type.
        what matters is that the type returned in a method matches the expected type in a following method
        e.g if a method returns type string, the next method accepts a type string
         */
        Function<String, String[]> f0 = uCase
                .andThen(s -> s.concat(" Kasaba"))
                .andThen(s -> s.split(" "));
        System.out.println(Arrays.toString(f0.apply(name)));

        Function<String, String> f1 = uCase
                .andThen(s -> s.concat(" Kasaba"))
                .andThen(s -> s.split(" "))
                .andThen(s -> s[1].toUpperCase() + ", " + s[0]);

        System.out.println(f1.apply(name));
        Function<String, Integer> f2 = uCase
                .andThen(s -> s.concat(" Kasaba"))
                .andThen(s -> s.split(" "))
                .andThen(s -> String.join(", ", s))
                .andThen(String::length);
        System.out.println((f2.apply(name)));

        System.out.println("----------");
        String[] names = {"Anna", "Bob", "Carol"};
        Consumer<String> s0 = s -> System.out.println(s.charAt(0));
        Consumer<String> s1 = System.out::println;
        Arrays.asList(names).forEach(s0
                .andThen(s -> System.out.println(" - "))
                .andThen(s1));

        Predicate<String> p1 = s -> s.equals("TOBI");
        Predicate<String> p2 = s -> s.equalsIgnoreCase("TOBI");
        Predicate<String> p3 = s -> s.startsWith("T");
        Predicate<String> p4 = s -> s.endsWith("i");

        Predicate<String> combined1 = p1.or(p2);
        System.out.println("combined1 = " + combined1.test(name));

        Predicate<String> combined2 = p3.and(p4);
        System.out.println("combined2 = " + combined2.test(name));

//        negate returns the opposite result from the result of the previous functions
        Predicate<String> combined3 = p3.and(p4).negate();
        System.out.println("combined3 = " + combined3.test(name));

        record Person(String firstName, String lastName) {
        }
        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("Peter", "Pan"),
                new Person("Peter", "PumpkinEater"),
                new Person("Minnie", "Mouse"),
                new Person("Mickey", "Mouse")
        ));

        list.sort(((o1, o2) -> o1.lastName.compareTo(o2.lastName)));
        list.forEach(System.out::println);

        System.out.println("---------------------");
        list.sort(Comparator.comparing(Person::lastName));
        list.forEach(System.out::println);


        System.out.println("---------------------");
        list.sort(Comparator.comparing(Person::lastName)
                .thenComparing(Person::firstName).reversed());
        list.forEach(System.out::println);


    }
}
