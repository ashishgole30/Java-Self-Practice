import java.util.Random;
import java.util.Scanner;

public class NumberGuessingTwo {
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
        int counter = 1;

        while (guess != randomNumber) {
            System.out.print("Enter Your Guess:");
            guess = scanner.nextInt();
            counter++;

        }

        System.out.println("You have successfully guessed that the random number between 1-10 was " + guess + " in "
                + counter + " attempts");
        scanner.close();
    }
}
