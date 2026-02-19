import java.util.Random;
import java.util.Scanner;

public class DiceRollingProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int randomNumber;
        char playAgain = 'y';

        System.out.println("------------------------------------");
        System.out.println("Welcome To Dice Rolling Program!");
        System.out.println("------------------------------------");

        while (playAgain == 'y' || playAgain == 'Y') {

            // Input validation
            System.out.print("Enter Your Guess (1/2/3/4/5/6): ");
            guess = scanner.nextInt();

            while (guess < 1 || guess > 6) {
                System.out.println("Invalid input! Please enter a number between 1 and 6.");
                System.out.print("Enter Your Guess (1/2/3/4/5/6): ");
                guess = scanner.nextInt();
            }

            randomNumber = random.nextInt(1, 7);

            if (guess == randomNumber) {
                System.out.println("You Successfully Guessed that the Number Rolled is " + randomNumber);

                switch (randomNumber) {

                    case 1 -> System.out.println("""
                             -------
                            |       |
                            |   *   |
                            |       |
                             -------
                            """);

                    case 2 -> System.out.println("""
                             -------
                            | *     |
                            |       |
                            |     * |
                             -------
                            """);

                    case 3 -> System.out.println("""
                             -------
                            | *     |
                            |   *   |
                            |     * |
                             -------
                            """);

                    case 4 -> System.out.println("""
                             -------
                            | *   * |
                            |       |
                            | *   * |
                             -------
                            """);

                    case 5 -> System.out.println("""
                             -------
                            | *   * |
                            |   *   |
                            | *   * |
                             -------
                            """);

                    case 6 -> System.out.println("""
                             -------
                            | *   * |
                            | *   * |
                            | *   * |
                             -------
                            """);
                }

            } else {
                System.out.println("Wrong Guess! The Dice Rolled the Number " + randomNumber);
            }

            // Ask to play again
            System.out.print("\nDo you want to play again? (y/n): ");
            playAgain = scanner.next().charAt(0);

            System.out.println();
        }
        // End
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
