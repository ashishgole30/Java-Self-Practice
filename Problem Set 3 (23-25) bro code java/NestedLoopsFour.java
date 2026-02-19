public class NestedLoopsFour {
    public static void main(String[] args) {
        /*
         * 4.4
         * Print this pattern:
         * 
         * 
         * /*
         * 
         **
         ***
         ****
         *****
         */

        // 5 rows
        // in each row , row number changes and stars also change
        // like first row so 1st row number
        // second row so 2nd row number and stars also change
        // row 1 -> 1 star
        // row 2 -> 2 stars
        // ...row 5 -> 5 stars
        // outer loop rows
        // inner loop stars
        // j<=1

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
