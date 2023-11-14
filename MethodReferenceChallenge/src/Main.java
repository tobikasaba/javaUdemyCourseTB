import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class Main {
    private record Person(String first) {
        public String last(String s) {
            return first + " " + s.substring(0, s.indexOf(" "));
        }
    }

    public static void main(String[] args) {


        String[] names = {"AnNA", "BoB", "ToBI", "BrAVo"};

        Person tim = new Person("Tim");

        List<Function<String, String>> interfaceList = new ArrayList<>(List.of(
                String::toUpperCase,
                name -> name + " " + getRandomChar('A', 'M') + ".",
                Main::lastName,
                String::new,
//                s -> new String ("Howdy " + s),
                String::valueOf,
                tim::last,
                new Person("Mary")::last
        ));

        transformArray(names, interfaceList);
    }

    private static char getRandomChar(char startChar, char endChar) {
        Random random = new Random();
        return (char) random.nextInt((int) startChar, (int) endChar + 1);
    }

    private static String lastName(String name) {
        String firstName = name.split(" ")[0];
        return name + " " + new StringBuilder(firstName).reverse().toString();
    }

    private static String reverse(String s) {
        return lastName(s);
    }

    private static void transformArray(String[] names, List<Function<String, String>> stringFunctions) {

        List<String> backedByArray = Arrays.asList(names);

        for (var function : stringFunctions) {
            backedByArray.replaceAll(s -> s.transform(function));
            System.out.println(Arrays.toString(names));
        }
    }
}