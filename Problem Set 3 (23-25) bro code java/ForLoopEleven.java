/*
1.10 
Check if a number is prime
Example:
Input: 7 → Prime
Input: 9 → Not Prime
*/

import java.util.Scanner;

public class ForLoopEleven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int number = scanner.nextInt();
        int numberOfDivisors = 0;

        if (number == 1 || number == 0) {
            System.out.println("It is not a prime number");
        } else if (number == 2) {
            System.out.println("It is a prime number");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    numberOfDivisors++;
                }
            }
            if (numberOfDivisors >= 1) {
                System.out.println(number + " Is not a prime number");
            } else {
                System.out.println(number + " Is a prime number");
            }
        }
        scanner.close();
    }
}
/*
 * 🔹 What is a Prime Number? (in plain English)
 * A number is prime if:
 * It is greater than 1
 * It has only TWO factors:1 , the number itself
 * Examples:
 * 2 → prime (1, 2)
 * 3 → prime (1, 3)
 * 5 → prime (1, 5)
 * 7 → prime (1, 7)
 * Not prime:
 * 1 → ❌ (only one factor)
 * 4 → ❌ (1, 2, 4)
 * 6 → ❌ (1, 2, 3, 6)
 * 9 → ❌ (1, 3, 9)
 * 
 * 🔹 Core idea to check if a number is prime
 * Ask yourself ONE question repeatedly:
 * “Does this number divide evenly by any number other than 1 and itself?”
 * 
 * If the answer is YES even once → ❌ Not Prime
 * If the answer is NO every time → ✅ Prime
 * 
 * 🔹 How the for loop fits in (conceptually)
 * Pick small numbers
 * Try dividing the given number by them
 * One by one
 * So the loop:
 * Starts from 2 (because 1 always divides)
 * Goes upwards
 * Stops before the number itself
 * Why?
 * Dividing by the number itself is useless (always divides)
 * We’re only checking for extra divisors
 * 
 * 🔹 What you’re checking inside the loop
 * Inside the loop, mentally:
 * “Does this number divide perfectly?”
 * Meaning → remainder = 0
 * If you find even one perfect division:
 * Boom 💥 → number is NOT prime
 * You can stop checking further
 * 
 * 🔹 Do you need a counter variable?
 * Two mental approaches (you can pick either):
 * 🅰️ Flag idea (simpler thinking)
 * Assume the number is prime
 * If you find a divisor → mark it not prime
 * 🅱️ Counter idea
 * Count how many times it divides evenly
 * If count > 0 → not prime
 * For beginners:
 * 👉 Flag idea is cleaner
 * 👉 Counter works too but is slightly more thinking
 * 
 * 🔹 Special cases you must remember
 * 0 → ❌ Not prime
 * 1 → ❌ Not prime
 * 2 → ✅ Prime (smallest prime)
 * These are not loop problems — they’re definition problems
 * 
 * 🔹 Mental dry run (example: 9)
 * Try dividing by 2 → no
 * Try dividing by 3 → YES ❌
 * Stop → Not Prime
 * Example: 7
 * Try 2 → no
 * Try 4 → no
 * Try 5 → no
 * Try 6 → no
 * No divisors → Prime ✅
 * 
 * 🔹 Summary mindset (THIS is the key)
 * Prime = no extra divisors
 * Loop = try possible divisors
 * One hit = not prime
 * Zero hits = prime
 * Don’t overthink it — it’s just repeated division
 */