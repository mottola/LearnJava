package com.rickmottola;

public class Main {

    public static void main(String[] args) {

        // PRIMITIVE DATA TYPES
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // int has a width of 32
        int minIntValue = -2_147_483_648;
        int maxIntValue = 2_147_483_647;
        int myTotal = (minIntValue/2);


        // byte has a width of 8
        byte minByteValue = -128;
        byte maxByteValue = 127;
        byte newByteValue = (byte) (minByteValue/2);
        System.out.println("newByteValue = " + newByteValue);

        // short has a width of 16
        short minShortValue = -32768;
        short maxShortValue = 32767;
        short newShortValue = (short) (maxShortValue/2);
        System.out.println("newShortValue = " + newShortValue);

        // long has a width of 64
        // must append value with l or L when using long
        long maxLongValue = 9_223_372_036_854_775_807L;



        // CHALLENGE

        // create a byte variable and set it to any valid byte number.
        byte myByte = 120;

        // create a short variable and set it to any valid short number.
        short myShort = 32000;

        // create an int variable and set it to any valid int number.
        int myInt = 60000;

        // create a variable of type long and make it equal to:
        // 50000 + 10 times the sum of the byte, plus the short plus the int

        long myLong = 50_000L + 10L * (myByte + myShort + myInt);

        System.out.println("myLong = " + myLong);
    }
}
