import java.util.Scanner;

public class ForLoopEight {
    public static void main(String[] args) {
        // 1.8
        // Take a number N from user and print the factorial using for loop.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int number = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= number; i++) {

            result = result * i;

        }
        System.out.println("The Factorial of " + number + " is " + result);
        scanner.close();
    }
}