public class CardClass {

    private Suit suit;
    private String face;
    private int rank;

    public CardClass(Suit suit, int rank) {
        this.suit = suit;
    }

    public CardClass(Suit suit, String face) {
        this.suit = suit;
        this.face = face;
    }

    public CardClass(Suit suit, String face, int rank) {
        this.suit = suit;
        this.face = face;
        this.rank = rank;
    }


    @Override
    public String toString() {
        return String.valueOf(face.charAt(0)) + suit + "(" + rank + ")" ;
    }

    public static CardClass getNumericCard(Suit suit, int rank){
        return new CardClass(suit, rank);
    }

    public static CardClass getFaceCard(Suit suit, String face){
        return new CardClass(suit, face);
    }


}
