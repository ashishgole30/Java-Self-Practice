public class BreakThree {
    public static void main(String[] args) {
        /*
         * 2.3
         * Print numbers from 1 to 50.
         * If number is divisible by 7, print "Found it!" and stop the loop.
         */

        for (int i = 1; i <= 50; i++) {

            if (i % 7 == 0) {
                System.out.println("Found it!");
                break;
            }
            System.out.println(i);
        }
    }
}
