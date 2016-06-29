package com.rickmottola;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Rick", 500);
        System.out.println("New score is " + newScore);

        calculateScore(75);

        calculateScore();

        double totalCentimeters = calcFeetAndInchesToCentimeters(7, 5);
        System.out.println(totalCentimeters);

        calcFeetAndInchesToCentimeters(157);



    }

    // METHOD OVERLOADING BY USING SAME METHOD WITH DIFFERENT NUMBER OF ARGUMENTS

    public static int calculateScore (String playername, int score) {
        System.out.println("Player " + playername + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore (int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore () {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double numFeet, double numInches) {
        if ((numFeet < 0) || ((numInches < 0) || (numInches > 12))) {
            System.out.println("Invalid values for feet and/or inches.");
            return -1;
        }
        double totalInches = (numFeet * 12) + numInches;
        double totalCentimeters = totalInches * 2.54;
        return totalCentimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double numInches) {
        if (numInches < 0  ) {
            System.out.println("Must have positive number of inches.");
            return -1;
        }
        double totalFeet = (int) numInches / 12;
        double remainingInches = (int) numInches % 12;
        System.out.println(numInches + " inches is equal to " + totalFeet + " feet and " + remainingInches + " inches.");
        return calcFeetAndInchesToCentimeters(totalFeet, remainingInches);
    }
}

