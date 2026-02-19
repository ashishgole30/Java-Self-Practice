import java.util.Scanner;

public class NotOperatorTwo {
    public static void main(String[] args) {
        /*
         * Problem 20.6
         * Input boolean isLoggedIn.
         * Print "Please login" if user is NOT logged in.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are You Logged In?(true/false):");
        boolean isLoggedIn = scanner.nextBoolean();
        if (!isLoggedIn) {
            System.out.println("Please Login!");
        } else {
            System.out.println("YAY! You are Already Logged In");
        }
        scanner.close();
    }
}
