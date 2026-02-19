import java.util.Scanner;

public class WhileLoopNine {
    public static void main(String[] args) {
        /*
         * Problem 21.9 – Digits of a Number
         * Take a number from the user and print each digit on a new line using a while
         * loop
         * Example: 123 →
         * 1
         * 2
         * 3
         * Hint: Use division and modulo operations.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int number = scanner.nextInt();

        int reversed = 0;

        // STEP 1: Reverse the number
        while (number != 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number = number / 10;
        }

        // STEP 2 : Print digits of reversed number
        while (reversed != 0) {
            int digit = reversed % 10;
            System.out.println(digit);
            reversed = reversed / 10;
        }
        scanner.close();

    }
}
/*
 * NOTES
 * / -> gives quotient
 * % -> gives remainder
 * 
 * logic of each line
 * first we accepeted number from user
 * then we started while loop which will run until number is not equal to 0
 * why? because when we divide number by 10 until it becomes 0
 * inside while loop we are getting last digit by %10 and printing it
 * then we are updating number by dividing it by 10 so that last digit is
 * removed
 * then loop continues until all digits are printed
 * thus each digit is printed in new line in reverse order
 * 
 * 
 * now to print in original order we first reverse the number
 * 
 * codition: while rebersed !=0 which is true thus we enter loop
 * then we get last digit of reversed number by %10 and print it
 * then we update reversed number by dividing it by 10
 * loop continues until all digits are printed
 * thus each digit is printed in new line in original order
 * 
 */
