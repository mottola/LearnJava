package com.rickmottola;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;

        result = result + 1;
        System.out.println("Result is now " + result);

        result++;
        System.out.println("Result is now " + result + " after incrementing.");

        result--;
        System.out.println("Result is now " + result + " after decrementing.");

        result += 2;
        System.out.println("Result is now " + result);

        result *= 10;
        System.out.println("Result is now " + result);

        result /= 20;
        System.out.println("Result is now " + result);

        // BOOLEAN OPERATORS

        boolean isAlien = false;

        if (isAlien == false)
            System.out.println("No alien here!");

        int topScore = 100;
        int myScore = 90;

        if (topScore == 100)
            System.out.println("You got the high score!");

        if (topScore >= 100)
            System.out.println("You got the high score or higher!");

        if (topScore != 100)
            System.out.println("Not the high score.");

        // THE && (AND) OPERATOR - ALL CONDITIONS MUST BE TRUE
        if ((topScore > myScore) && (topScore <= 100))
            System.out.println("Your score: " + myScore + " - You did not beat the top score, but the top score does not exceed 100!");

        // THE || (OR) OPERATOR - ONE CONDITION MUST BE TRUE
        if ((topScore > 90) || (myScore <= 90))
            System.out.println("One of the conditions is true.");

        // TERNARY OPERATOR - SET A VALUE BASED ON 2 CONDITIONS
        boolean isCar = true;

        boolean wasCar = isCar ? true : false;
        if (isCar)
            System.out.println("wasCar is true!");

        // CHALLENGE

        // create a double variable with the value 20
        double doubleTwenty = 20d;

        // create a second variable of type double with the value of 80
        double doubleEighty = 80d;

        // add both numbers up and multiply by 25
        double doMath = 25d * (doubleTwenty + doubleEighty);
        System.out.println("doMath = " + doMath);

        // use the modulo operator to find remainder of doMath divided by 40
        double findRemainder = doMath % 40d;
        System.out.println("findRemainder = " + findRemainder);

        // write an "if" statement that displays a message "Total was over the limit"
        // if the remaining total (#4) is equal to 20 or less.

        if (findRemainder <= 20d)
            System.out.println("Total was over the limit!");
    }
}
