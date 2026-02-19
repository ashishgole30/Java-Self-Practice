public class NestedLoopsOne {
    public static void main(String[] args) {
        /*
         * 4.1
         * Print this pattern:
         * //*****
         * //*****
         * //*****
         *
         */
        // what first came in my mind
        // row 3
        // coloumn 5
        // outer loop row
        // inner loop coloumn
        // outer loop 3 times
        // inner loop 5 times prints *
        // since we want * on same line we use print not print ln
        // outer loop runs once , inner loops runs completely once right?
        // so 1 time = *****
        // but after running inner loop complelety once we need println
        // so that 2nd time = ***** will be on next line
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
