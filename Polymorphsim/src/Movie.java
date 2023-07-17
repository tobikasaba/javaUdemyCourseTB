public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public static Movie getMovie(String type, String title) {
//     making the fits character the movie type and making it capital letter
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }

    public void watchMovie() {
//        getclass() is used to return class type information about the run time
//        getSimpleName() gets the class name of an object
//        instance on which this method is executing
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    public void watchAdventure() {
        System.out.println("Watching an Adventure");
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }
}

class Comedy extends Movie {

    public Comedy(String title) {
        super(title);
    }

    public void watchComedy() {
        System.out.println("Watching a Comedy");
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy Ending");
    }
}

class ScienceFiction extends Movie {

    public ScienceFiction(String title) {
        super(title);
    }

    public void watchScienceFiction() {
        System.out.println("Watching a Science Fiction");
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys Chase Aliens ",
                "Planet Blows up");
    }
}