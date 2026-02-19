public class BreakOne {
    public static void main(String[] args) {
        /*
         * 2.1
         * Print numbers from 1 to 10, but stop when number becomes 5.
         */
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
