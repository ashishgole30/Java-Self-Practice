/*
 * 🔹 Practice Problem — Favorite Movies Array
 *
 * 📝 Problem Statement:
 *
 * 1. Create an array with a specific size and manually assign movie names.
 * 2. Create another array with the same size and use user input
 * to store movie names.
 *
 * 1.
 * Create an array of size 3.
 * Manually assign 3 movie names.
 * Print them using an enhanced for loop.
 *
 * 2.
 * Create another array of size 3.
 * Use Scanner to take user input for each movie.
 * Print them using an enhanced for loop.
 */

import java.util.Scanner;

public class UserInputArray1 {
    public static void main(String[] args) {

        String[] movienameone = new String[3];

        movienameone[0] = "harry potter";
        movienameone[1] = "jungle book";
        movienameone[2] = "life of pie";

        for (String movie : movienameone) {
            System.out.println(movie);
        }
        System.out.println("---------------------------");

        Scanner scanner = new Scanner(System.in);
        String[] movienametwo = new String[3];

        for (int i = 0; i < movienametwo.length; i++) {
            System.out.print("Enter Movie name:");
            movienametwo[i] = scanner.nextLine();
        }

        for (String string : movienametwo) {
            System.out.println(string);
        }
        scanner.close();
    }
}
