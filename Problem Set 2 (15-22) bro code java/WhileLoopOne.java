public class WhileLoopOne {
    public static void main(String[] args) {
        /*
         * #21 While Loops ♾
         * Problem 21.1
         * Print numbers 1 to 10 using while.
         * 
         * What is a while loop? (basic idea)
         * A while loop is used when
         * You don’t know in advance how many times the loop will run
         * You want to repeat something as long as a condition is true
         * Think:
         * “WHILE this condition is true, keep doing this.”
         * 
         * Syntax ->
         * while (condition) {
         * // code to repeat
         * }
         * 
         * 1. Big picture: how a while loop actually runs
         * A while loop has 3 logical parts (this is the mental model you must lock in):
         * Start value (initialization)
         * Condition (when to continue)
         * Change (so the condition eventually becomes false)
         * If any one of these is wrong → output wrong / infinite loop / nothing prints.
         * 
         * 2. What the problem is asking (logic, not code)
         * Print numbers 1 to 10
         * That means:
         * First number printed → 1
         * Last number printed → 10
         * Each loop → number changes by +1
         * So your brain should ask:
         * Where do I start?
         * When do I stop?
         * How do I move forward?
         * 
         * print i
         * then i++
         * ➡ prints current value, then increases
         * 
         * i++
         * then print i
         * ➡ increases first, then prints next value
         * 
         * 3. How to build loop logic (use this every time)
         * Before coding, answer these on paper or in head:
         * What is the first value printed?
         * What is the last value printed?
         * What change happens after each print?
         * Then map them to:
         * Initialization
         * Condition
         * Update
         */

        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;

        }
    }
}

/*
 * Yes — after i++, control goes back to the while condition, and if it’s true,
 * the loop body runs again from the top, including System.out.println(i).
 * There is no “next println” — the same println runs again in the next
 * iteration.
 * 
 * 🔁 Iteration 1
 * i = 1
 * Check condition → 1 < 11 ✅ true
 * Enter loop
 * println(i) → prints 1
 * i++ → now i = 2
 * Loop ends → goes back to while condition
 * 
 * 🔁 Iteration 2
 * Check condition → 2 < 11 ✅ true
 * Enter loop
 * println(i) → prints 2
 * i++ → now i = 3
 * Go back again
 * 
 * 🔁 Iteration 3
 * Prints 3
 * i becomes 4
 * ...
 * This keeps happening until:
 * 
 * 🔁 Iteration 10
 * i = 10
 * 10 < 11 ✅ true
 * Prints 10
 * i++ → i = 11
 * 
 * ❌ Iteration 11 (loop stops)
 * Check condition → 11 < 11 ❌ false
 * Exit loop
 * Program ends
 */
