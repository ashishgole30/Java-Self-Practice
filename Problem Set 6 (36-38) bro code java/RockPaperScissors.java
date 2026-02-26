// Rock Paper Scissors Game In Java

// Welcome Message
// Ask the user for rock/paper/scissors
// Generate Random Choice of rock/paper/scissors
// Check Win Cases
// If uSer wins display win message
// If user losses display lost message
// Ask If they want to play again?
// If yes play again
// If no
// Goodbye Message

// Imported Scanner Class
import java.util.Random;
import java.util.Scanner;

// Class RockPaperScissors
public class RockPaperScissors {
    // Main method
    public static void main(String[] args) {
        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // Playagain Variable
        int playagain = 1;

        // While Loop
        while (playagain == 1) {

            // Welcome Message
            System.out.println("---WELCOME TO ROCK PAPER SCISSORS GAME---");

            // Show Options
            System.out.println(" 1. Rock");
            System.out.println(" 2. Paper");
            System.out.println(" 3. Scissors");
            // User Chooses option
            System.out.print("Choose One Option:");
            int choice = scanner.nextInt();

            // Random Object
            Random random = new Random();
            // Random Choice Generated (1/2/3)
            int randomNumber = random.nextInt(1, 4);

            // Tie Cases
            if (choice == 1 && randomNumber == 1) {
                System.out.println("You Chose Rock");
                System.out.println("Computer Chose Rock");
                System.out.println("Its A Tie!");
            }
            if (choice == 2 && randomNumber == 2) {
                System.out.println("You Chose Paper");
                System.out.println("Computer Chose Paper");
                System.out.println("Its A Tie!");
            }
            if (choice == 3 && randomNumber == 3) {
                System.out.println("You Chose Scissors");
                System.out.println("Computer Chose Scissors");
                System.out.println("Its A Tie!");
            }

            // Win Cases
            if (choice == 1 && randomNumber == 3) {
                System.out.println("You Chose Rock");
                System.out.println("Computer Chose Scissors");
                System.out.println("You Win!");
            }
            if (choice == 2 && randomNumber == 1) {
                System.out.println("You Chose Paper");
                System.out.println("Computer Chose Rock");
                System.out.println("You Win!");
            }
            if (choice == 3 && randomNumber == 2) {
                System.out.println("You Chose Scissors");
                System.out.println("Computer Chose Paper");
                System.out.println("You Win!");
            }

            // Lose Cases
            if (choice == 1 && randomNumber == 2) {
                System.out.println("You Chose Rock");
                System.out.println("Computer Chose Paper");
                System.out.println("You Lose!");
            }
            if (choice == 2 && randomNumber == 3) {
                System.out.println("You Chose Paper");
                System.out.println("Computer Chose Scissors");
                System.out.println("You Lose!");
            }
            if (choice == 3 && randomNumber == 1) {
                System.out.println("You Chose Scissors");
                System.out.println("Computer Chose Rock");
                System.out.println("You Lose!");
            }
            // Text Decoration
            System.out.println("----------");
            // Asking if User Wants to Play Again
            System.out.print("You Want To Play Again? (Type 1 for Yes/Type 2 for No):");
            playagain = scanner.nextInt();
        }
        // Goodbye Message
        System.out.println("Thank You For Playing!");
        // Scanner Closed
        scanner.close();
    }
}