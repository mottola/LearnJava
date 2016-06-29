package com.rickmottola;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;


//        if (score == 5000)
//            System.out.println("Your score is 5000!");
//
//        if ((score < 5000) && (score > 1000)) {
//            System.out.println("Your score is less than 5000 but greater than 1000.");
//        } else if (score < 1000) {
//            System.out.println("Your score is less than 1000.");
//        } else {
//            System.out.println("Your score must be 5000 or higher!");
//        }

        if (gameOver) {

            // FINAL SCORE ONLY EXISTS WITHIN OUR CODE BLOCK
            // THE CODE BLOCK CAN ACCESS VARIABLES OUTSIDE OF IT
            // THIS IS KNOWN AS SCOPE

            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is: " + finalScore);
        }

        // CHALLENGE

        // print our a second score on the screen with the following

        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // make sure the first printout still displays correctly

        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if (gameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score is: " + finalScore);
        }

        // USING METHODS WILL BE MUCH MORE EFFICIENT WHEN WE GET TO THAT!!
    }

}
