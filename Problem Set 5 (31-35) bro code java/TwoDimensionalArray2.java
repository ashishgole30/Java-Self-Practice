public class TwoDimensionalArray2 {
    public static void main(String[] args) {
        /*
         * /*
         * 🔹 Practice Problem — Company Departments (2D Array Update)
         *
         * 📝 Problem Statement:
         *
         * 2D array = An array where each element is an array
         * Also known as multidimensional array
         * Useful for storing grouped data (like employees in departments)
         *
         * 1. Create a 2D array that stores employee names for 3 departments:
         * - HR Department
         * - IT Department
         * - Sales Department
         *
         * 2. Modify specific elements inside the 2D array
         * using two indices.
         *
         * 3. Use nested enhanced for-loops to print all employees
         * after making the changes.
         *
         * 🔹 Example Concept (Just Idea)
         *
         * {
         * {"Alice", "Bob", "Charlie"},
         * {"David", "Ethan", "Frank"},
         * {"Grace", "Hannah", "Ian", "Jack"}
         * }
         *
         * Example Changes:
         *
         * - Change "Alice" to "Alicia"
         * - Change "David" to "Daniel"
         * - Change "Hannah" to "Helen"
         *
         * Remember:
         * First index = row (department)
         * Second index = column (employee position)
         *
         * Output should print updated structure group by group.
         */

        String[][] twoDimensionalArray = {
                { "Alice", "Bob", "Charlie" },
                { "David", "Ethan", "Frank" },
                { "Grace", "Hannah", "Ian", "Jack" } };

        twoDimensionalArray[0][0] = "Alicia";
        twoDimensionalArray[1][0] = "Daniel";
        twoDimensionalArray[2][1] = "Helen";

        for (String[] strings1 : twoDimensionalArray) {
            for (String strings2 : strings1) {
                System.out.print(strings2 + " ");
            }
            System.out.println();
        }
    }
}