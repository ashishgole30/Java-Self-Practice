public class WhileLoopSeven {
    public static void main(String[] args) {
        /*
         * Problem 21.7 – Multiples of 3
         * Print all numbers from 1 to 50 that are multiples of 3 using a while loop.
         * 
         * 
         * i first value = 3
         * i last value = 48 ( i < 50)
         * increment i by 3 in every step
         * 
         */

        int i = 3;
        while (i < 50) {
            System.out.println(i);
            i += 3;
        }
    }
}
