import java.util.Scanner;

public class AndOperatorOne {
    public static void main(String[] args) {
        /*
         * AND (&&)
         * Problem 20.1
         * Input age and citizenship (true/false).
         * Print "Eligible to vote" only if:
         * age ≥ 18 AND
         * citizen = true
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Do You have Citizenship (true/false):");
        String citizenship = scanner.nextLine().toLowerCase();

        if (age >= 18 && citizenship.equals("true")) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("You Cannot Vote");
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
