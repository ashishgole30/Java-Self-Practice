
/*
 * 🔹 Practice Problem — Student Roll Number Search
 * 📝 Problem Statement
 * Create a program that:Creates an array of 5 student roll numbers (integers).
 * Ask the user to enter a roll number to search.
 * Use a boolean variable isFound.
 * Use a for loop to search the array.
 * If found:
 * Print:
 * "Student roll number found at index: ___"
 * Set isFound = true
 * Use break
 * After the loop:
 * If isFound is still false →
 * Print:
 * "Roll number not found."
 * 
 * 🔹 Example Setup (Concept Only)
 * int[] rollNumbers = {101, 105, 110, 115, 120};
 * If user enters:
 * 110
 * Output:
 * Student roll number found at index: 2
 */
import java.util.Arrays;
import java.util.Scanner;;

public class SearchArray3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] rollnumbers = { 12, 13, 24, 42, 16 };
        int target;
        boolean isFound = false;

        System.out.print("Enter The Roll Number You Want To Search:");
        target = scanner.nextInt();

        for (int i = 0; i < rollnumbers.length; i++) {
            if (rollnumbers[i] == target) {
                System.out.println("Student roll number found at index:" + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Roll number not found.");

        }
        scanner.close();
    }
}