public class Main {
    public static void main(String[] args) {
//        int newScore = calculateScore("Tim", 500);
//        System.out.println("New score is " + newScore);
//
////        calculateScore(75);
//        calculateScore();

        System.out.println("New score is " + calculateScore("Tim", 500));
        System.out.println("New score is " + calculateScore(10));


        System.out.println("The height 5'10 in cm is " + convertToCentimeters(5, 10) + "cm");
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + " scored " + score + " points");
        return calculateScore("Anonymous", score);
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double convertToCentimeters (int heightInches){

        return heightInches * 2.54;
    }

    public static double convertToCentimeters (int heightFeet, int heightInches){
        int feetToInch = heightFeet * 12;
        heightInches += feetToInch;

        return convertToCentimeters(heightInches);
    }
}