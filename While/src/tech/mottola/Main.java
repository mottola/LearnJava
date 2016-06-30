package tech.mottola;

public class Main {

    public static void main(String[] args) {

        // while a condition is NOT TRUE
        int count = 0;
        while(count != 5) {
            System.out.println("While NOT TRUE count value is " + (count + 1));
            count++;
        }


        // while a condition is TRUE
        int newCount = 0;
        while(true) {
            if(newCount == 5) {
                break;
            }
            System.out.println("While TRUE count value is " + (newCount + 1));
            newCount++;
        }

        // do while will always execute at least once!
        int doCount = 0;
        do {
            System.out.println("Do while count value is " + (doCount + 1));
            doCount++;
        } while (doCount != 5);


        // incrementer
        int numRange = 0;
        // even numbers found variable
        int isEven = 0;

        // while loop
        while(true) {
            // account for 0
            if(numRange == 0) {
                numRange++;
                continue;
            }
            // break out once desired number is reached
            if(numRange == 25) {
                break;
            }
            // if odd number, increment and continue
            if(!isEvenNumber(numRange)) {
                numRange++;
                continue;
            }
            // print even number
            System.out.println(numRange + " is even");
            // increment
            numRange++;
            isEven++;
        }
        System.out.println("Number of even numbers found: " + isEven);

    }

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
