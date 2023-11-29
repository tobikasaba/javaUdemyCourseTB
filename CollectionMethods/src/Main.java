import java.util.List;

public class Main {
    public static void main(String[] args) {
        char ch = 9827;
        int ascii = ch;
        System.out.println("The ASCII value of " + ch);

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);


//        System.out.println(test);

//        System.out.println(Card.getFaceCard((char) 9830, "Q"));
//        System.out.println(Card.getNumericCard((char) 9827, 3));
;    }
}