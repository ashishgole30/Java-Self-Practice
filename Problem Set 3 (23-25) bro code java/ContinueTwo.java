public class ContinueTwo {
    public static void main(String[] args) {
        /*
         * 3.2
         * Print numbers from 1 to 10, but skip even numbers.
         */

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
