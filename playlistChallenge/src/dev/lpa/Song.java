package dev.lpa;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }
/**
 * The point of overriding the toString methods means you want the object to print
 * a particular thing when you "sout" print out the object.
 * by overriding, what you put in is what is printed instead of the objects memory
 */
    @Override
    public String toString() {
        return "" + title + ": " + duration;
    }
}
