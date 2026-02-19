import java.util.Scanner;

public class WhileLoopEight {
    public static void main(String[] args) {
        /*
         * Problem 21.8 – Factorial of a Number
         * Take an integer N from the user and print its factorial using a while loop.
         * Example: 5 → 5*4*3*2*1 = 120
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter An Integer Number:");
        int n = scanner.nextInt();
        int i = n;
        int result = 1;
        while (i > 1) {
            result = result * i;
            i--;

        }
        System.out.println(result);

        scanner.close();
    }
}
/*
 * LOGIC
 * 1. Take an integer input from the user store it in variable 'n'.
 * 2. Initialize another variable 'i' to the input number n
 * 3. Initialize a variable 'result' to 1 to store the factorial result.
 * 4. While i > 1, multiply result by i and decrement i.
 * 5. Print the final result.
 * 
 * example: n = 4 (user input)
 * i also = 4
 * result = 1
 * 
 * now continue till i > 1
 * first iteration: result = result * i = 1 * 4 = 4, i now decremented to 3
 * second iteration: result = result * i = 4 * 3 = 12, i now decremented to 2
 * third iteration: result = result * i = 12 * 2 = 24, i now decremented to 1
 * 
 */