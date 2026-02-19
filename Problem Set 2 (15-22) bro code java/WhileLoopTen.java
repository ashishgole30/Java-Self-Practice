import java.util.Scanner;

public class WhileLoopTen {
    public static void main(String[] args) {
        /*
         * Problem 21.10
         * Reverse a number using while loop.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int number = scanner.nextInt();

        int reversed = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number = number / 10;
        }
        System.out.println("Reversed number:" + reversed);
        scanner.close();
    }
}
/*
 * 1️⃣ int reversed = 0; — WHY start with 0?
 * Think of reversed as an empty box where we will build a new number digit by
 * digit.
 * Before building anything → box must be empty
 * In programming, “empty number” = 0
 * So:
 * int reversed = 0;
 * means:
 * “I have not built any reversed number yet.”
 * 
 * 2️⃣ The MAGIC LINE (heart of the logic ❤️)
 * reversed = reversed * 10 + lastDigit;
 * This line does two things at once:
 * Step A — reversed * 10
 * * 👉 Shifts digits to the left
 * 👉 Makes space for a new digit at the end
 * Example:
 * reversed = 12
 * reversed * 10 = 120
 * (Think: adding a zero at the end)
 * Step B — + lastDigit
 * 👉 Adds the new digit in the empty space
 * 
 * EXAMPLE
 * number = 123
 * reversed = 0
 * 
 * iteration 1
 * lastdigit = number % 10
 * = 123 % 10 = 0
 * reversed = reversed * 10 + lastdigit
 * = 0 * 10 + 3 = 3
 * number = 123 / 10 = 12
 * 
 * now
 * reversed = 3
 * number = 12
 * 
 * iteration 2
 * lastDigit = 12 % 10 = 2
 * reversed = 3 * 10 + 2 = 32
 * number = 12 / 10 = 1
 * 
 * now
 * reversed = 32
 * number = 1
 * 
 * iteration 3
 * lastDigit = 1 % 10 = 1
 * reversed = 32 * 10 + 1 = 321
 * number = 1 / 10 = 0
 * Loop ends
 * 
 * Finally
 * original :123
 * reversed :321
 */
