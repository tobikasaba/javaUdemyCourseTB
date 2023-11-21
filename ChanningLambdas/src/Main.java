import java.util.function.Function;

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
    }
}