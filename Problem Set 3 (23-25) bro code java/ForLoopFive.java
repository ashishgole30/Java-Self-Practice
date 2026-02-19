public class ForLoopFive {
    public static void main(String[] args) {
        /*
         * 1.5
         * Print the sum of numbers from 1 to 100
         * 
         */

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
/*
 * What a for loop really does (mentally)
 * Think of the loop as:
 * Repeat the same small action again and again, step by step
 * Each time the loop runs:
 * i increases by 1
 * sum gets updated
 * Anything inside the loop happens every single time
 * 
 * Case 1️⃣: print(sum) inside the loop
 * What’s happening conceptually:
 * First loop run → sum becomes 1 → print 1
 * Second loop run → sum becomes 3 → print 3
 * Third loop run → sum becomes 6 → print 6
 * Last loop run → sum becomes 5050 → print 5050
 * So you’re not printing the final answer
 * You’re printing the running total after every step
 * That’s why you see many lines:
 * 1
 * 3
 * 6
 * 10
 * ...
 * 5050
 * 
 * 👉 This is called a cumulative / intermediate result
 * Useful for:
 * Debugging
 * Understanding how values grow
 * Learning loops (like now)
 * 
 * Case 2️⃣: print(sum) outside the loop (your correct version)
 * What happens here:
 * Loop runs 100 times
 * sum keeps updating quietly in memory
 * Nothing is printed yet
 * After the loop finishes, Java reaches:
 * “Okay, loop is DONE. Now print.”
 * At that moment:
 * sum already contains the final total
 * So Java prints only once
 * And that value is the final answer
 * 👉 Printing outside = “Show result after all work is done”
 * 
 * Simple real-life analogy 🧠
 * Imagine you’re putting money into a piggy bank:
 * Print inside loop =
 * “Tell me how much money I have after every deposit”
 * Print outside loop =
 * “Tell me how much money I have after all deposits are done”
 * Both are correct — just different intentions.
 * 
 * Key rule to remember (exam + real life)
 * 
 * 🔹 Inside loop → happens every iteration
 * 🔹 Outside loop → happens once, after loop ends
 * 
 * You understood this faster than most beginners — that’s a good sign
 */