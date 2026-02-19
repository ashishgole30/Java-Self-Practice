import java.util.Scanner;

public class WhileLoopSix {
    public static void main(String[] args) {
        /*
         * Problem 21.6 – Sum of First N Numbers
         * Take an integer N from the user and print the sum of numbers from 1 to N.
         * Example: N = 5
         * → sum = 1+2+3+4+5 = 15
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter An Integer Number:");
        int n = scanner.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum = sum + i;
            i++;

        }
        System.out.println("The Sum of First " + n + " Natural Numbers is:" + sum);
        scanner.close();
    }
}

/*
 * Why sum starts with 0
 * Before adding anything, what is the total? Nothing so 0
 * 
 * sum = sum + i
 * Take the current value of sum
 * Add the current value of i
 * Store the result back into sum
 * Thus Old value of sum is replaced
 * 
 * Initial State
 * i = 1
 * sum = 0
 * 
 * i = 1 <= 5 true
 * sum = sum + i
 * sum = 0 + 1 = 1
 * i++ → 1++ = 2 (incremenet by 1)
 * 
 * Current State
 * sum = 1
 * i = 2
 * 
 * i = 2 <= 5 → true
 * sum = sum + i
 * sum = 1 + 2 = 3
 * i++ → 2++ = 3 (incremenet by 1)
 * 
 * Current state
 * sum = 3
 * i = 3
 * ..... continue till i = 5
 * 
 * // sum stores running total
 * // sum starts at 0 because no numbers are added initially
 * // each loop adds current i to sum
 * // old sum is replaced by new sum
 * // loop stops when condition becomes false
 * // final sum is printed after loop
 */
