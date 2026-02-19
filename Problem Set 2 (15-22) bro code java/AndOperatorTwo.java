import java.util.Scanner;

public class AndOperatorTwo {
    public static void main(String[] args) {
        /*
         * Problem 20.2
         * Input username and password.
         * Print "Login Successful" only if both match predefined values.
         */

        Scanner scanner = new Scanner(System.in);
        String user = "Ashish";
        String pass = "Ashish123";
        System.out.print("Enter Username:");
        String username = scanner.nextLine();
        System.out.print("Enter Password:");
        String password = scanner.nextLine();

        if (user.equalsIgnoreCase(username) && pass.equalsIgnoreCase(password)) {
            System.out.println("LOGIN SUCCESSFULL");
        } else {
            System.out.println("LOGIN UNSUCCESSFUL");
        }
        scanner.close();
    }
}

/*
 * // USING == to compare strings is a mistake
 * // == compares memory references, not values
 * // Always use .equals() to compare string values
 * // Use .equalsIgnoreCase() to compare strings ignoring case
 */
