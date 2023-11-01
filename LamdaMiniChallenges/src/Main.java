import java.util.Arrays;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

        Consumer<String> printWordsLambda = sentence -> {
            String[] parts = sentence.split(" ");
            for (var part : parts) {
                System.out.println(part);
            }
        };

        printWords.accept("Hello how are you doing today");
        System.out.println("---------");
        printWordsLambda.accept("Hello how are you doing today");
        System.out.println("---------");

        Consumer<String> printWordsForEach = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };

        printWordsForEach.accept("Hello how are you doing today");

//        you dont need curly braces for a single line lambda
        Consumer<String> printWordsConcise = sentence -> Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        System.out.println("---------");
        printWordsConcise.accept("Hello how are you doing today");

        System.out.println("---------");
        System.out.println(everySecondChar("What is it"));


    }

    public static String everySecondChar(String source) {

        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();

    }
}


