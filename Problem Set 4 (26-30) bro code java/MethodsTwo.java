import java.util.Scanner;

public class MethodsTwo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a method that:
        // Takes two numbers and returns the larger number.

        System.out.print("Enter First Number:");
        int number1 = scanner.nextInt();
        System.out.print("Enter Second Number:");
        int number2 = scanner.nextInt();

        int result = largerNumber(number1, number2);

        if (result == -1) {
            System.out.println("The numbers are equal");
        } else {
            System.out.println("The larger number is: " + result);
        }
        scanner.close();
    }

    static int largerNumber(int firstnumber, int secondnumber) {

        if (firstnumber > secondnumber) {
            return firstnumber;
        } else if (firstnumber < secondnumber) {
            return secondnumber;
        } else {
            return -1;
        }
    }
}
