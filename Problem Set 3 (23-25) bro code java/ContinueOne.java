public class ContinueOne {
    public static void main(String[] args) {
        /*
         * 3.1
         * Print numbers from 1 to 20, but skip numbers divisible by 3.
         */

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
