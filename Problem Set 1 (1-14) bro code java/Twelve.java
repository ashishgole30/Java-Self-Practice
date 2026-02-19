import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {

        // USING == to compare strings is a mistake
        // == compares memory references, not values
        // Always use .equals() to compare string values
        // Use .equalsIgnoreCase() to compare strings ignoring case

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Age:");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("you have to pay Rs 50 for a ticket");
        }

        if (age >= 18) {
            scanner.nextLine();
            System.out.print("Are you a student (yes/no)?: ");
            String isStudent = scanner.nextLine();

            if (isStudent.equalsIgnoreCase("yes")) {
                System.out.println("you have to pay Rs 80 for a ticket");
            } else {
                System.out.println("you have to pay Rs 100 for a ticket");

            }
        }
        scanner.close();
    }
}