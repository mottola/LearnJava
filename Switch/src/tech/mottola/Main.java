package tech.mottola;

public class Main {

    public static void main(String[] args) {
        int value = 3;

        // Using if/else for control flow
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        // Using switch for control flow
        int switchValue = 6;
        switch(switchValue) {
            case 4:
                System.out.println("Value was 4");
                break; // breaks out if condition true
            case 5:
                System.out.println("Value was 5");
                break; // must have break statement when using switch
            default:
                System.out.println("Was not 4 or 5");
                break; // always adding break, even here at last statement is a best practice
        }

        // if/else is good for multi-variable testing
        // switch is good for single variable testing


        // CHALLENGE

        // create a new switch statement using char instead of int
        // create a new char variable
        char myVariable = 'G';

        // create a switch statement testing for A, B, C, D, or E
        // display a message if any of these are found and then break
        switch(myVariable) {
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("A, B, C, D, or E has been found!");
                break;
            default:
                System.out.println("No instances of A, B, C, D, or E were found.");
                break;
        }

        String month = "JaNuAry";

        // use toLowerCase() String method for test validation
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("January found!");
                break;
            case "february":
                System.out.println("February found!");
                break;
            case "march":
                System.out.println("March found!");
                break;
            default:
                System.out.println("We must not be in the first quarter of the year!");
                break;
        }
    }

}
