package academy.learnprogramming;

public class IfKeywordsAndCodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;


//        if (score < 5000 && score > 1000 ){
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        }
//        else if (score < 1000) {
//            System.out.println("your score was less than 1000");
//
//        } else {
//            System.out.println("Got here");
//        }

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        if (gameOver) {
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }



}
