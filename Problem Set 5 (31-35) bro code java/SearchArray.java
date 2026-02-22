import java.util.Arrays;

public class SearchArray {
    public static void main(String[] args) {

        /*
         * 🔹 Practice Problem — Linear Search (Strings Version)
         * 📝 Problem Statement:
         * Create a program that:
         * Creates an array of 6 car brand names.
         * Store a brand name you want to search for in a variable called target.
         * Use a boolean variable called isFound.
         * Use a for loop to search through the array.
         * If the brand is found:
         * Print:
         * Brand found at index: __
         * Set isFound = true
         * Use break
         * After the loop, if isFound is still false:
         * Print:
         * Brand not found in the array.
         * 🔹 Example Setup (Just Concept, Not Code)
         * Array example:
         * {"Toyota", "BMW", "Honda", "Audi", "Ford", "Kia"}
         * Target example:
         * "Honda"
         */

        String[] carNames = { "BMW", "Fiat", "MarutiSuzuki", "Porsche", "Lamborghini", "Ford"
        };

        String target = "Lamborghini";
        boolean isFound = false;

        for (int i = 0; i < carNames.length; i++) {
            if (target.equals(carNames[i])) {
                System.out.println("Element " + target + " found at index " + i);
                isFound = true;
                break;

            }

        }
        if (!isFound) {
            System.out.println("Element not Found");
        }
    }
}
// NOTE
// i <= carNames.length causes ArrayIndexOutOfBoundsException
/*
 * target.equals("Lamborghini") → ❌
 * You're not checking the array element.
 * You're comparing target with a fixed string every time.
 */

// NOTE
/*
 * 🧠 What You Learned Today
 * Linear search compares target with array[i]
 * Loop condition must be < length
 * Use boolean flag properly
 * Use break when found
 */