import java.util.Scanner;

public class BreakFour {
    public static void main(String[] args) {
        /*
         * 2.4
         * Guessing game:
         * User keeps entering numbers.
         * If user enters correct number (hardcode it) → print "Correct!" and stop.
         */

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter A Number (hint: Try Square Of 7):");
            int number = scanner.nextInt();
            if (number == 49) {
                System.out.println(number + " IS CORRECT SQUARE OF 7");
                break;
            }
        }
        scanner.close();
    }
}
