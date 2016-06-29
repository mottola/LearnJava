package com.rickmottola;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5d; // or 5.25

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = "  + myDoubleValue);

        int divInt = myIntValue / 3;
        float divFloat = myFloatValue / 3f;
        double divDouble = myDoubleValue / 3d;
        double pi = 3.1415926d;

        System.out.println("divInt = " + divInt);
        System.out.println("divFloat = " + divFloat);
        System.out.println("divDouble = " + divDouble);
        System.out.println("pi = " + pi);
        // use double for the most precision


        // CHALLENGE

        // CONVERT A GIVEN NUMBER OF POUNDS TO KILOGRAMS

        // create a variable to store the number of pounds
        double numPounds = 155d;

        // calculate the number of kilograms for the number above and store
        double numKilograms = numPounds * 0.45359237d ;

        // print result
        System.out.println(numPounds + " pounds = " + numKilograms + " kilograms.");

    }
}
