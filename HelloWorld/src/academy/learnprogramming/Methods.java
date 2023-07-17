package academy.learnprogramming;

public class Methods {

    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore =  calculateScore(true,10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int rachelHighScore = calculateHighScorePosition(1500);
        int sallyHighScore = calculateHighScorePosition(900);
        int timHighScore = calculateHighScorePosition(400);
        int johnHighScore = calculateHighScorePosition(50);

        displayHighScorePosition("Rachel Sim", rachelHighScore);
        displayHighScorePosition("Sally Weed", sallyHighScore);
        displayHighScorePosition("Tim Cook", timHighScore);
        displayHighScorePosition("John Perry", johnHighScore);
//        calculateHighScorePosition()
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }

    }



    public static void displayHighScorePosition(String playerName, int position){
            System.out.println(playerName + " managed to get into position " + position + " on the high score table");
        }

    public static int calculateHighScorePosition(int playerScore) {
//            if (playerScore >= 1000){
//                return 1;
//            } else if (playerScore >= 500) {
//                return 2;
//            } else if (playerScore >= 100) {
//                return 3;
//            }
//
//            return 4;
        int position = 4; //assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;


    }
}