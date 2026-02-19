public class NestedLoopsThree {
    public static void main(String[] args) {
        /*
         * 4.3
         * Print this pattern:
         * 
         * 1 2 3
         * 1 2 3
         * 1 2 3
         */

        // 3 rows
        // 3 coloumns
        // outer loop rows
        // inner loop coloumns
        // outer loop executes 3 times
        // during which inner loop increases from 1 to 3
        // so outer loop runs once , inner loop fully runs once and prints its own
        // variable with space " "
        // println so that after inner loops runs once fully , next time its on new line

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
