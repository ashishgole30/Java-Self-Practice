public class NestedLoopSix {
    public static void main(String[] args) {
        /*
         * 4.6
         * Print this pattern:
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         */

        int number = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}

// rows 4
// column depends on rows
// row 1 , column has 1 element
// row 2 , column has 2 elements
// row 3 , column has 3 elements
// row 4 , column has 4 elements
// row outer loop
// column inner loop
// in each row , we print column variable
// use " " for spacing
// println after inner loops runs once fully
// increment column variable
// but condition for coloumn variable depends on row variable
// j <= i

// MOST IMPORTANT TWIST
/*
 * 🔍 Look Carefully At The Pattern
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * Ask yourself:
 * 👉 Does each row restart from 1?
 * NO.
 * 👉 Are we printing j?
 * NO.
 * 👉 Numbers are continuing globally.
 * This is NOT a simple print(j) triangle.
 * 🧠 Important Realization
 * This pattern needs:
 * ✅ Rows = 4
 * ✅ Columns depend on row → j <= i
 * ❗ BUT numbers must continue increasing across rows
 * That means:
 * We need an extra variable outside loops to store the number.
 * Something like:
 * int number = 1;
 * Then inside inner loop:
 * Print number
 * Then increment number
 * 🔥 What Would Happen If You Printed j?
 * You’d get:
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * That is WRONG for this question.
 * 🏗 Correct Thinking Structure
 * Outer loop → rows
 * Inner loop → columns (j <= i)
 * Extra variable → controls continuous numbers
 * 💎 Golden Rule For This Pattern Type
 * If:
 * Numbers do NOT restart each row
 * Pattern continues increasing
 * Then:
 * 👉 Use a separate counter variable outside the loops
 */

/* FINAL NOTES NESTED LOOPS */
/*
 * 🔹 Topic: Nested Loops – Pattern Basics (Notes)
 * 1️⃣ Core Idea of Nested Loops
 * Outer loop → controls rows
 * Inner loop → controls columns / elements inside each row
 * Inner loop runs completely for every single outer loop iteration
 * After inner loop finishes → use println() to move to next row
 * 
 * 🔹 Rectangle Pattern Rule
 * Example:
 *****
 *****
 *****
 * 
 * 
 * Logic:
 * Fixed number of rows
 * Fixed number of columns
 * Inner loop limit is constant
 * Golden Rule:
 * 👉 If pattern is a rectangle →
 * Inner loop condition does NOT depend on outer loop.
 * Example thinking:
 * Rows = 3
 * Columns = 5
 * Print * 5 times for each row
 * So:
 * outer loop → rows
 * inner loop → fixed number (columns)
 * 
 * 🔹 Number Rectangle Rule
 * Example:
 * 1 1 1
 * 2 2 2
 * 3 3 3
 * Logic:
 * Rows = 3
 * Columns = 3
 * Print outer loop variable (i)
 * Golden Rule:
 * 👉 If numbers change row-wise → print outer loop variable inside inner loop.
 * 
 * 🔹 Column-Based Pattern Rule
 * Example:
 * 1 2 3
 * 1 2 3
 * 1 2 3
 * Logic:
 * Rows = 3
 * Columns = 3
 * Print inner loop variable (j)
 * Golden Rule:
 * 👉 If numbers change column-wise → print inner loop variable.
 * 
 * 🔹 Triangle Pattern Rule (Very Important)
 * Example:
 *
 **
 ***
 ****
 *****
 * 
 * 
 * Logic:
 * Rows = 5
 * Stars increase every row
 * Row number = number of stars
 * Golden Rule:
 * 👉 If stars increase row by row →
 * Inner loop limit depends on outer loop.
 * So:
 * j <= i
 * This means:
 * Row 1 → 1 star
 * Row 2 → 2 stars
 * Row 3 → 3 stars
 * etc.
 * 
 * 🔥 Ultimate Pattern Formula
 * Whenever you see a pattern problem, ask:
 * How many rows?
 * How many columns?
 * Is column count fixed or changing?
 * What should be printed? * / i / j / something else?
 * 
 * 🔥 Core Rules Summary (Write This in Notebook)
 * 
 * ✔ Outer loop → rows
 * ✔ Inner loop → columns
 * ✔ Fixed rectangle → inner loop constant
 * ✔ Increasing triangle → inner loop depends on i
 * ✔ Row-wise change → print i
 * ✔ Column-wise change → print j
 * ✔ Always use println() after inner loop
 */