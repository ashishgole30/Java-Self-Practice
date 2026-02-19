import java.util.Scanner;

public class BreakTwo {
    public static void main(String[] args) {
        /*
         * 2.2
         * Take numbers from user in a loop.
         * Stop the loop when user enters -1.
         */

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter A Guess(hint try -1):");
            int userInput = scanner.nextInt();
            if (userInput == -1) {
                break;

            }
        }
        System.out.println(" -1 was the correct guess");
        scanner.close();
    }
}
