public class NestedLoopsTwo {
    public static void main(String[] args) {
        /*
         * 4.2
         * Print this pattern:
         * 
         * 1 1 1
         * 2 2 2
         * 3 3 3
         */

        // rows 3
        // columns also 3
        // in each column we print row variable
        // outer row variable
        // inner column variable

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
