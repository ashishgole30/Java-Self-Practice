public class ContinueThree {
    public static void main(String[] args) {
        /*
         * 3.3
         * Print numbers from 1 to 50, but skip numbers divisible by 5 or 7.
         */

        for (int i = 1; i <= 50; i++) {

            if (i % 5 == 0 || i % 7 == 0) {
                continue;
            }
            System.out.print(i + " ");

        }
    }
}
