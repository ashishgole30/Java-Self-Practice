
import java.util.Scanner;

public class TernaryProblemThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Integer Number A: ");
        int a = scanner.nextInt();

        System.out.print("Enter Integer Number B: ");
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("A and B are equal");
        } else {
            int greater = (a > b) ? a : b;
            System.out.println(greater);

        }
        scanner.close();
    }
}

/*
 * What went wrong (and WHY)
 * You don’t need a while loop at all
 * 
 * This problem is:
 * “Compare two numbers once and print the greater one”
 * 
 * A while loop means:
 * “Repeat until condition becomes false”
 * 
 * A ternary operator can still handle this without loops.
 * 
 * 🧠 KEY LESSON (IMPORTANT)
 * ❌ When NOT to use loops
 * Comparisons
 * Single checks
 * One-time decisions
 * 
 * ✅ Use loops only when:
 * Values change
 * You want repetition
 */
