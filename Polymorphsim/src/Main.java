import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie theMovie = new Movie("Star Wars");
//        Movie theMovie = new Adventure("Star Wars");
//        Movie theMovie = Movie.getMovie("Adventure", "Starwars");

//        when run, this prints out the watchMovie method in both
//        the Movie and Adventure class.
//        we get Adventure film not movie film because at runtime the class is Adventure
//        theMovie.watchMovie();


        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to quit): ");

            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
//            reading the line of the input
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
//        range(1,100).forEach(System.out::println);

    }
}