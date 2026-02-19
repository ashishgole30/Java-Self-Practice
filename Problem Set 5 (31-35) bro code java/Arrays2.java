import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        /*
         * 2.1 — .length
         * 📝 Problem:
         * Create an integer array called numbers with 6 values.
         * Store the length of the array in a variable called size.
         * Print:
         * The length
         * A sentence like:
         * "This array contains ___ elements."
         */
        int[] numbers = { 1, 2, 3, 4, 5, 6 };
        int size = numbers.length;
        System.out.println("length = " + size);
        System.out.println("This array contains " + size + " elements.");

        /*
         * 🔹 2.2 — Printing All Elements (Normal for loop)
         * 📝 Problem:
         * Create a double array called temperatures with 5 values.
         * Use a normal for loop (with index i) to print:
         * Temperature at index 0 is ___
         * Temperature at index 1 is ___
         * Continue for all elements.
         */
        double[] temperatures = { 12.12, 12.13, 12.14, 12.15, 12.16 };
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Temperaure at index " + i + " is " + temperatures[i]);
        }
        /*
         * 🔹 2.3 — Enhanced For Loop (For-Each)
         * 📝 Problem:
         * Create a String array called countries with 4 country names.
         * Use a for-each loop to print:
         * Country: India
         * Country: Japan
         * ...
         * (No index — just values.)
         */
        String[] countries = { "India", "Japan", "USA", "China" };
        for (String country : countries) {
            System.out.println("Country: " + country);

        }
        /*
         * 🔹 2.4 — Sorting an Array
         * 📝 Problem:
         * Create a String array called names with 5 names in random order.
         * Print:
         * The array before sorting
         * Sort it using Arrays.sort()
         * Print it again after sorting
         */
        String[] names = { "Shravani", "Ashish", "Jay", "Adwyte", "Bobade" };
        for (String name : names) {
            System.out.print(name + " ");
        }
        Arrays.sort(names);
        System.out.println();
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

        /*
         * 🔹 2.5 — Arrays.fill()
         * 📝 Problem:
         * Create an int array called scores with size 5 (but don’t initialize values
         * manually).
         * Use Arrays.fill() to fill every element with 100.
         * Print all elements using a loop.
         */
        int[] scores = new int[5];
        Arrays.fill(scores, 100);
        for (int score : scores) {
            System.out.print(score + " ");

        }
    }
}
