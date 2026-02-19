/*
 * public class ForLoopFour {
 * public static void main(String[] args) {
 * /*
 * 1.4
 * Print the square of numbers from 1 to 10.
 * Example: 1 → 1, 2 → 4, 3 → 9
 * 
 * for (int i = 1; i <= 10; Math.pow(i, i)) {
 * System.out.println(i);
 * }
 * }
 * }
 */

/*
 * public class ForLoopFour {
 * public static void main(String[] args) {
 * for (int i = 1; i <= 10; i = i * i {
 * System.out.println(i);
 * }
 * }
 * }
 */

/*
 * The key rule:
 * 
 * ❌ The update part is NOT for doing calculations
 * ✅ It is only for moving to the next value
 */

public class ForLoopFour {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            int j = i * i;
            System.out.println(i + " * " + i + " = " + j);
        }
    }
}