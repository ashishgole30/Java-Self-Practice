import java.util.Scanner;

public class ContinueFour {
    public static void main(String[] args) {
        /*
         * 3.4
         * Take numbers from user in a loop.
         * If user enters a negative number, skip it and continue.
         */
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter A Number (Try -7 or 7):");
            int userInput = scanner.nextInt();
            if (userInput < 0) {
                continue;
            } else if (userInput == 7) {
                break;
            }
        }
        scanner.close();
    }
}
