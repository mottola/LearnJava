package com.rickmottola;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a string";

        System.out.println(myString);

        // appending to string
        myString = myString + ", this is appending to my original string.";

        System.out.println(myString);

        myString = myString + " \u00A9 2016";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";

        System.out.println("The result is: " + numberString); // DOES NOT DO ARITHMETIC!

        String lastString = "10";
        int myInt = 50;

        lastString = lastString + myInt; // myInt gets COERCED to a String and concatenated!

        System.out.println(lastString);

        double doubleNumber = 120.47;
        lastString =lastString + doubleNumber; // again, coercion and concatenation

        System.out.println(lastString);
    }
}
