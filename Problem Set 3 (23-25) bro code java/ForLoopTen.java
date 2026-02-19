import java.util.Scanner;

public class ForLoopTen {
    public static void main(String[] args) {
        // 1.10
        // Reverse a number using for loop

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int reversed = 0;

        for (int number = scanner.nextInt(); number != 0; number = number / 10) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
        }

        System.out.println("Reversed Number is: " + reversed);
        scanner.close();
    }
}
/*
 * 1️⃣ Why is int reversed = 0; first set to 0?
 * Because:
 * We are building the reversed number step by step
 * At the start, we have nothing built yet
 * If you want to add digits to a number, the safest starting point is 0.
 * Example:
 * Start: reversed = 0
 * After first digit → becomes 4
 * Then 43
 * Then 432
 * Then 4321
 * If you started with anything else (like 1 or garbage), the result would be
 * wrong.
 * Rule:
 * When you’re building a number, start from 0.
 * 
 * The condition is:
 * number != 0
 * This means:Keep looping as long as digits are still left
 * When number becomes 0, there are no digits left
 * Example with 1234:
 * number condition
 * 1234 != 0 ✅
 * 123 != 0 ✅
 * 12 != 0 ✅
 * 1 != 0 ✅
 * 0 ❌ STOP
 * Condition = “Do I still have digits?”
 * 
 * 3️⃣ number = number / 10 → explain update part
 * This line:number = number / 10;
 * removes the last digit.
 * Example:
 * number number / 10
 * 1234 123
 * 123 12
 * 12 1
 * 1 0
 * 
 * 
 * 4️⃣ Explain int lastDigit = number % 10;
 * % 10 means:
 * * “Give me the last digit”
 * Example:
 * number number % 10
 * 1234 4
 * 123 3
 * 12 2
 * 1 1
 * 
 * 5 Why do we do reversed = reversed * 10 ??
 * Because numbers don’t have space automatically.
 * Example:
 * Current reversed = 43
 * New digit = 2
 * If you do:
 * 43 + 2 = 45 ❌ WRONG
 * But:
 * 43 * 10 = 430
 * 430 + 2 = 432 ✅
 * * 10 = shift left
 * + digit = append digit
 * This is the core logic of reversing.
 * 
 * 7 Difference between % and /
 * / → quotient (cuts number)
 * Removes digits
 * Moves forward in loop
 * 123 / 10 = 12
 * 
 * % → remainder (extracts digit)
 * Gets last digit
 * 123 % 10 = 3
 * Think of it like this:
 * Operator Purpose
 * / 10 Remove last digit
 * % 10 Get last digit
 * 
 */