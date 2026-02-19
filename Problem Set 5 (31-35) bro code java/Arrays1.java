public class Arrays1 {
    public static void main(String[] args) {
        /*
         * 🔹 1.1 — Array Definition
         * 📝 Problem:
         * Create an array of 5 city names.
         * Print a sentence explaining what an array is (in your own words).
         * Then declare the array.
         * 
         * 🔹 1.2 — Syntax for Creating an Array
         * 📝 Problem:
         * Create an integer array called marks with 4 values:
         * 85, 90, 78, 92
         * Then print the array variable directly (like you did before).
         * Observe what gets printed.
         * 
         * 🔹 1.3 — Printing Array Gives Memory Address
         * 📝 Problem:
         * Create a double array called prices with 3 values.
         * Print
         * The entire array
         * Then print only the first element
         * Notice the difference.
         * 
         * 🔹 1.4 — Accessing Elements Using Index
         * 📝 Problem:
         * Create a String array called colors with 4 colors.
         * Print:
         * First color
         * Third color
         * (Using index numbers only.)
         * 
         * 🔹 1.5 — Accessing Invalid Index (Error Concept)
         * 📝 Problem:
         * Create an int array with 3 numbers.
         * Try accessing index 4 (comment it out after testing).
         * Then print a message explaining why the error happens.
         * 
         * 🔹 1.6 — Changing Value at an Index
         * 📝 Problem:
         * Create a String array called animals with 3 animals.
         * Change the second animal to something else.
         * Print:
         * The updated value
         * Then print the entire array using index access (not memory address)
         */

        System.out.println("1.1");
        System.out.println("Array is collection of elements of same data type");
        String[] cities = { "Mumbai", "Pune", "Jaipur", "Bihar", "Surat" };

        System.out.println("1.2");
        int[] marks = { 85, 90, 78, 92 };
        System.out.println(marks);
        System.out.println("Memory address gets printed");

        System.out.println("1.3");
        double[] prices = { 10.23, 13.23, 12.12 };
        System.out.println(prices);
        System.out.println(prices[0]);
        System.out.println("Difference is it gives memory address and it gives first element");

        System.out.println("1.4");
        String[] colors = { "Red", "Blue", "Black", "White" };
        System.out.println(colors[0]);
        System.out.println(colors[2]);

        System.out.println("1.5");
        int[] numbers = { 1, 2, 3 };
        // System.out.println(numbers[4]);
        System.out.println("Error occurs because index 4 does not exist. Array size is 3.");

        System.out.println("1.6");
        String[] animals = { "Ant", "Bat", "Cat" };
        animals[1] = "owl";
        System.out.println(animals[0]);
        System.out.println(animals[1]);
        System.out.println(animals[2]);
    }
}
