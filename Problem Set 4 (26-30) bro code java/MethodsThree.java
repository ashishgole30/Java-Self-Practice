import java.util.Scanner;

public class MethodsThree {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a method that:
        // Takes a number and returns its factorial.
        System.out.print("Enter A Number:");
        int number = scanner.nextInt();

        int result = factorial(number);

        System.out.println("The factorial of number " + number + " is " + result);

        scanner.close();

    }

    static int factorial(int number) {

        int result = 1;

        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
/*
 * Assume:
 * number = 5
 * Before Loop Starts
 * result = 1
 * 
 * 🔁 Iteration 1
 * i = 1
 * Check: 1 <= 5 → TRUE
 * Calculation:
 * result = result * i
 * result = 1 * 1
 * result = 1
 * After iteration:
 * result = 1
 * i becomes 2
 * 
 * 🔁 Iteration 2
 * i = 2
 * Check: 2 <= 5 → TRUE
 * Calculation:
 * result = 1 * 2
 * result = 2
 * After iteration:
 * result = 2
 * i becomes 3
 * 
 * 🔁 Iteration 3
 * i = 3
 * Check: 3 <= 5 → TRUE
 * Calculation:
 * result = 2 * 3
 * result = 6
 * After iteration:
 * result = 6
 * i becomes 4
 * 
 * 🔁 Iteration 4
 * i = 4
 * Check: 4 <= 5 → TRUE
 * Calculation:
 * result = 6 * 4
 * result = 24
 * After iteration:
 * result = 24
 * i becomes 5
 * 
 * 🔁 Iteration 5
 * i = 5
 * Check: 5 <= 5 → TRUE
 * Calculation:
 * result = 24 * 5
 * result = 120
 * After iteration:
 * result = 120
 * i becomes 6
 * 
 * Loop Ends
 * Check:
 * 6 <= 5 → FALSE
 * Loop stops.
 * 
 * Return Statement
 * return result;
 * 
 * Returned value:
 * 120
 * 
 * What Actually Happened Conceptually
 * Each time:
 * result = previous result × current i
 * So factorial builds step by step:
 * 
 * 1
 * 1 × 2
 * 2 × 3
 * 6 × 4
 * 24 × 5
 * = 120
 */
