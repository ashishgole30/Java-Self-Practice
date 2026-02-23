public class VarArgs1 {
    public static void main(String[] args) {
        /*
         * 🔹 Practice Problem — Find Maximum Number Using VarArgs
         * 📝 Problem Statement
         * Create a program that:Creates a method named findMax.
         * The method should accept a varying number of integer arguments using varargs.
         * Inside the method:
         * Use a loop to compare all numbers.
         * Find the largest number.
         * Return the largest number.
         * In main, call the method with multiple integer values.
         * Print the maximum value.
         * 🔹 Example Concept
         * If method is called like:
         * findMax(4, 8, 2, 15, 6)
         * Output should be:
         * Maximum number is: 15
         */
        System.out.println("Maximum number is: " + findMax(1, 214, 141, 413, 14112, 1241, 131));
    }

    static int findMax(int... numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}