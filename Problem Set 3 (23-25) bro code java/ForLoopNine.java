import java.util.Scanner;

public class ForLoopNine {
    public static void main(String[] args) {
        // * 1.9
        // Take a number and count how many digits it has using a for loop.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A number:");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Number of digits:1");
        } else {
            int count = 0;
            for (; number != 0; number = number / 10) {
                count++;
            }
            System.out.println("Number of digits:" + count);
        }
        scanner.close();
    }
}
/*
 * Problem in simple words
 * You are given one number.
 * You need to find how many digits are inside it.
 * 
 * Example:
 * 1234 → 4 digits
 * 0 → 1 digit
 * 508 → 3 digits
 * 
 * STEP 1
 * Take a number from the user.
 * (This is the number whose digits you want to count.)
 * 
 * STEP 2
 * if the number from the user is 0
 * directly print number of digits:1
 * 
 * STEP 3
 * Else
 * count variable set to 0 so that we can increment it
 * 
 * FOR LOOP
 * 
 * INITIALIZATION:If the variable is already initialized, you should leave the
 * initialization
 * part empty
 * CONDITION: WE CONTINUE AS LONG AS THE NUMBER IS NOT 0
 * SINCE IF IT WAS 0 WE ALREADY PRINTED NUMBER OF DIGITS AS 1
 * UPDATE:How do we move toward stopping?
 * Ask: “What action removes exactly ONE digit each time?”
 * Answer:
 * Divide the number by 10
 * Why?
 * Integer division drops the last digit
 * 789 / 10 → 78
 * 78 / 10 → 7
 * 7 / 10 → 0
 * So every iteration:
 * number gets smaller
 * eventually reaches 0
 * loop ends automatically
 * 
 * STEP 5 & 6
 * Increment count by 1 for each iteration
 * and print final count after the loop ends
 * 
 * 
 */