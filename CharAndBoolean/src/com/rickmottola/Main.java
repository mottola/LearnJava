package com.rickmottola;

public class Main {

    public static void main(String[] args) {

        // char is for a single character
        char myFirstChar = 'D';
        char mySecondChar = '3';
        char myThirdChar = '\u00A9'; // unicode character

        System.out.println(myFirstChar);
        System.out.println(mySecondChar);
        System.out.println(myThirdChar);

        boolean myBoolean = false;
        boolean isMale = true;

        System.out.println(myBoolean);
        System.out.println(isMale);


        // CHALLENGE

        // find the code for the registered unicode symbol
        // create a variable of the type char and assign it the unicode value
        // display it on the screen

        char registeredSymbol = '\u00AE';

        System.out.println(registeredSymbol);

    }
}
