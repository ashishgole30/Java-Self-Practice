import java.util.Scanner;

public class WhileLoopFour {
    public static void main(String[] args) {
        /*
         * Problem 21.4
         * Keep asking user to enter a number until they enter 0.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A Number:");
        int number = scanner.nextInt();

        while (number != 0) {
            System.out.print("Enter A Number:");
            number = scanner.nextInt();

        }
        System.out.println("The LOOP Ends!");
        scanner.close();
    }
}
/*
 * we ask to enter number
 * if enter number is not 0
 * we ask again
 * if enter number is 0
 * we escape loop
 *
 *
 * ==========================================
 * Notes for Problem 21.4 – While Loops
 * ==========================================
 * 
 * Problem Statement:
 * Keep asking the user to enter a number until they enter 0.
 * 
 * ------------------------------------------
 * 1. While Loop Basics:
 * ------------------------------------------
 * - while(condition) { ... } repeats the block
 * as long as the condition is true.
 * - Condition must evaluate to a boolean.
 * - The variable used in the condition MUST be
 * declared **before the loop**.
 * - Inside the loop, the variable must be **updated**
 * so that the condition can eventually become false.
 * - If the variable is not updated, the loop becomes
 * infinite.
 * 
 * ------------------------------------------
 * 2. Declaration vs Assignment:
 * ------------------------------------------
 * - Declaration: create a new variable and optionally assign a value.
 * int number = 5; // declaration + assignment
 * - Assignment: update an existing variable with a new value.
 * number = 10; // assignment only, no type
 * 
 * ⚠️ Key mistake: redeclaring the variable inside the loop
 * like this:
 * int number = scanner.nextInt();
 * This causes:
 * - Compiler error: "duplicate local variable number"
 * - The while-loop condition continues to use the old variable
 * 
 * ✅ Correct approach:
 * - Declare once **before the loop**
 * - Update **inside the loop** without data type
 * 
 * ------------------------------------------
 * 3. How to update variable inside while loop:
 * ------------------------------------------
 * - Take new input from user and assign it to the same variable
 * controlling the loop condition:
 * number = scanner.nextInt();
 * 
 * - Do NOT use a new variable unless you also change
 * the while condition to check the new variable.
 * 
 * ------------------------------------------
 * 4. Flow for Problem 21.4 (step-by-step)
 * ------------------------------------------
 * 1. Declare and initialize the variable:
 * int number = scanner.nextInt();
 * 2. Start while loop:
 * while (number != 0)
 * 3. Inside loop:
 * - Ask for input
 * - Assign input to the **same variable**
 * controlling the condition:
 * number = scanner.nextInt();
 * 4. When the user enters 0:
 * - Condition becomes false
 * - Loop ends
 * - Print exit message
 * 
 * ------------------------------------------
 * 5. Common Mistakes Seen in Attempts:
 * ------------------------------------------
 * - Infinite loop: forgetting to update the variable
 * - Duplicate variable error: declaring the same variable inside loop
 * - Using a new variable inside loop without changing condition
 * - Misunderstanding assignment vs comparison:
 * number != 0 // comparison, does NOT update
 * number = 0 // assignment, updates variable
 * 
 * ------------------------------------------
 * 6. Golden Rules / Quick Reminder:
 * ------------------------------------------
 * 1️⃣ Declare the loop variable **before** the loop
 * 2️⃣ Update the loop variable **inside** the loop
 * 3️⃣ Assignment inside the loop: no type, just variable = value
 * 4️⃣ Comparison inside while: variable != 0, variable < 10, etc.
 * 5️⃣ Avoid duplicate declarations — declare once per scope
 * 6️⃣ Infinite loops happen if you forget step 2
 * 7️⃣ Think in flow: declare → check → update → repeat → exit
 */