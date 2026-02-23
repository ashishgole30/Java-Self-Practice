public class TwoDimensionalArray1 {
    public static void main(String[] args) {
        /*
         * /*
         * 🔹 Practice Problem — Classroom Subjects (2D Array)
         * 📝 Problem Statement:
         * 2D array = An array where each element is an array
         * Also known as multidimensional array
         * Useful for storing grouped data (like subjects for different classes)
         *
         * 1. Create three separate 1D arrays:
         * - Subjects for Class A
         * - Subjects for Class B
         * - Subjects for Class C
         * 2. Combine them into a 2D array.
         * 3. Also create another 2D array directly using nested braces.
         * 4. Use nested enhanced for-loops to print all subjects.
         * 5. Print a separator line.
         * 6. Print the second 2D array using nested enhanced for-loops.
         *
         * 🔹 Example Concept (Just Idea)
         * Class A → {"Math", "Science", "English"}
         * Class B → {"History", "Geography", "Civics"}
         * Class C → {"Physics", "Chemistry", "Biology", "Computer"}
         *
         * Output should print subjects group by group.
         */

        String[] classA = { "Maths", "Science", "English" };
        String[] classB = { "History", "Physics", "Chemistry" };
        String[] classC = { "Civics", "Social Science", "Economics" };

        String[][] classOne = { classA, classB, classC };
        String[][] classTwo = { { "Maths", "Science", "English" },
                { "History", "Physics", "Chemistry" },
                { "Civics", "Social Science", "Economics" } };

        for (String[] subject : classOne) {
            for (String string : subject) {
                System.out.println(string);
            }
        }
        System.out.println("----------------------------------");
        for (String[] subject : classTwo) {
            for (String string : subject) {
                System.out.println(string);
            }
        }
    }
}