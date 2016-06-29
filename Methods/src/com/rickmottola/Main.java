package com.rickmottola;

public class Main {

    public static void main(String[] args) {
        int highScore = 0;

        // method calls
        highScore = calculateScore(true, 800, 5, 100);
        System.out.println(highScore);

        highScore = calculateScore(true, 10_000, 8, 200);
        System.out.println(highScore);

        highScore = calculateScore(true, 15_000, 13, 500);
        System.out.println(highScore);

        int playerPosition = 0;

        playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Rick", playerPosition);

        playerPosition = calculateHighScorePosition(900);
        displayHighScorePosition("Anna", playerPosition);

        playerPosition = calculateHighScorePosition(400);
        displayHighScorePosition("Sephie", playerPosition);

        playerPosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Test", playerPosition);

        playerPosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Carol", playerPosition);
    }

    // METHODS HELP US WRITE DRY CODE (DON'T REPEAT YOURSELF)
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    // A method returning type void (nothing) is called a PROCEDURE
    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table.");
    }

    // A method returning something is called a METHOD or FUNCTION
    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if ((playerScore >= 500) && (playerScore < 1000)) {
            return 2;
        } else if ((playerScore >= 100) && (playerScore < 500)) {
            return 3;
        }
        return 4;
    }
}
