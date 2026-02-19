import java.util.Scanner;

public class WhileLoopThree {
    public static void main(String[] args) {
        /*
         * Problem 21.3
         * Take a number and print its multiplication table using while.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter An Integer Number:");
        int number = scanner.nextInt();
        int i = 1;
        while (i <= 10) {
            int multiplication = number * i;
            System.out.println(number + " * " + i + " = " + multiplication);
            i++;
        }
        scanner.close();
    }
}
/*
 * The golden while-loop rule 🔑
 * Any value that depends on the loop variable must be calculated INSIDE the
 * loop
 * 
 * Think like this:
 * “If i changes, anything using i must be updated again”
 * 
 * 1️⃣ Initialize the loop variable before the while loop.
 * 2️⃣ Condition must be boolean and ensures the loop eventually stops.
 * 3️⃣ Update the variable inside the loop, otherwise it becomes an infinite
 * loop.
 */