public class NestedLoopsFive {
    public static void main(String[] args) {
        /*
         * 4.5
         * Print this pattern:
         * 5 4 3 2 1
         * 5 4 3 2 1
         * 5 4 3 2 1
         */

        // rows 3
        // columns 5
        // rows executes 3 times
        // column executes 5 times
        // rows outer variable
        // columns inner variable
        // for each row ,we print column variable but in decreasing format
        // we use print so that column numbers are in same line and also use space
        // character for spacing
        // we use println after inner loops runs fully

        for (int i = 1; i <= 3; i++) {
            for (int j = 5; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
/*
 * 🔍 Step 1: Observe the Pattern Carefully
 * 
 * Total rows = 3
 * 
 * Each row has 5 numbers
 * 
 * Numbers are printed in decreasing order (5 to 1)
 * 
 * Every row is identical
 * 
 * This is a rectangle pattern (not triangle).
 * 
 * 🧠 Step 2: Identify Roles
 * Outer Loop → Controls Rows
 * 
 * Runs 3 times
 * 
 * Each time prints one full line
 * 
 * Inner Loop → Controls Columns
 * 
 * Runs 5 times
 * 
 * Prints numbers from 5 down to 1
 * 
 * 🔥 Core Logic
 * 
 * Since every row prints the SAME thing
 * → Inner loop does NOT depend on outer loop variable
 * 
 * Since numbers go backward
 * → Use a decreasing loop (j--)
 * 
 * 
 * 
 * 
 * 🧩 Mental Execution Flow
 * 
 * Outer loop runs once
 * → Inner prints: 5 4 3 2 1
 * → println
 * 
 * Outer loop runs second time
 * → Inner prints: 5 4 3 2 1
 * → println
 * 
 * Outer loop runs third time
 * → Inner prints: 5 4 3 2 1
 * 
 * Done.
 * 
 * 🏆 Golden Rules for Rectangle Patterns
 * 
 * Rows are constant.
 * 
 * Columns are constant.
 * 
 * Inner loop does NOT depend on outer loop variable.
 * 
 * Use decreasing loop if pattern goes backward.
 * 
 * print() inside inner loop.
 * 
 * println() after inner loop ends.
 * 
 * ⚠ Common Mistake (Your Previous One)
 * 
 * Writing:
 * 
 * j <= 1
 * 
 * 
 * That condition is wrong because:
 * 
 * If starting from 5 → 5 <= 1 is false immediately
 * So loop never runs.
 * 
 * Correct thinking:
 * 
 * If going downward → condition must be j >= 1
 */