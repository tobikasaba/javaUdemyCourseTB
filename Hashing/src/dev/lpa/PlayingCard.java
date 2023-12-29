package dev.lpa;

import java.util.Objects;

public class PlayingCard {

    private String suit;
    private String face;
    private int internalHash;

    public PlayingCard(String suit, String face) {
        this.suit = suit;
        this.face = face;
        this.internalHash = (suit.equals("Hearts")) ? 11 : 12;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayingCard that = (PlayingCard) o;

        if (!suit.equals(that.suit)) return false;
        return face.equals(that.face);
    }

    @Override
    public int hashCode() {
        int result = suit.hashCode();
        result = 31 * result + face.hashCode();
        return result;
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        PlayingCard that = (PlayingCard) o;
//
//        if (!Objects.equals(suit, that.suit)) return false;
//        return Objects.equals(face, that.face);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = suit != null ? suit.hashCode() : 0;
//        result = 31 * result + (face != null ? face.hashCode() : 0);
//        return result;
//    }

//    @Override
//    public int hashCode() {
//        return internalHash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        System.out.println("----> Checking Playing Card equality");
//        return true;
//    }
//    @Override
//    public boolean equals(Object obj) {
//        System.out.println("this is: " + this + " obj is: " + obj);
//        if (this == obj) {
//            System.out.println("----> Checking Playing Card equality");
//            System.out.println("this is: " + this);
//            return true;
//        }
//        return false;
//    }


}
