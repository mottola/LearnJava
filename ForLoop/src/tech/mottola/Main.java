package tech.mottola;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        // incrementing loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + (i + 1) + " Hello!");
        }


        // decrementing loop
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Blastoff!!!");

        // CHALLENGE - using a for loop to check multiple interest rates
        for (int i = 2; i < 9; i++){
            System.out.println("10,000 at " + i + " % interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
            // String.format("%.2f") tells the output to truncate to 2 decimal places.
        }

        // CHALLENGE - modify the above loop to start from 8% and stop at 2%
        for (int i = 8; i > 1; i--){
            System.out.println("10,000 at " + i + " % interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
            // String.format("%.2f") tells the output to truncate to 2 decimal places.
        }

        // CHALLENGE - create for loop that uses the isPrime method with a range of numbers
        // keep a count of the prime numbers found
        // if the count gets to 10, break out of the loop


        // counter variable
        int count = 0;

        // loop that checks for primes between 10 and 50
        for(int i = 10; i <= 50; i++) {
            // conditional statement to run when isPrime returns true
            if(isPrime(i)) {
                // count increments for each prime found
                count++;
                // print the prime found
                System.out.println("Number " + i + " is a prime number.");
                // conditional for case of count being 3
                if(count == 10) {
                    System.out.println("Exiting for loop");
                    // break from for loop when count == 3
                    break;
                }
            }
        }
        System.out.println((long) Math.sqrt(50));
    }

    // method to determine if n number is prime

    // isPrime takes in any single int
    public static boolean isPrime(int n) {
        // primes must be integers greater than 1, so this handles all other conditions
        if(n <= 1) {
            return false;
        }

        // loop for all numbers
        for(int i = 2; i <= (long) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
