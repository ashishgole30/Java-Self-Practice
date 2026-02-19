import java.util.Random;
import java.util.Scanner;

public class NumberGuessingOne {
    public static void main(String[] args) {
        /*
         * #22 Number Guessing Game
         * Problem 22.1 Generate a random
         * number (1–10). User keeps guessing until correct number is entered.
         */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(1, 11);
        System.out.print("Enter Your Guess:");
        int guess = scanner.nextInt();

        while (guess != randomNumber) {
            System.out.print("Enter Your Guess:");
            guess = scanner.nextInt(); // DONT FORGET THIS
            /*
             * Golden rule of loops
             * If a loop depends on a variable, that variable MUST change inside the loop
             * Your loop condition depends on guess
             * So guess needs to be reassigned inside the loop.
             */

        }

        System.out.println("You have successfully guessed that the random number between 1-10 was " + guess);
        scanner.close();
    }
}
