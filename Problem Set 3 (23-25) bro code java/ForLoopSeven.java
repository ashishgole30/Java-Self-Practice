public class ForLoopSeven {
    public static void main(String[] args) {
        // * 1.7
        // * Count how many numbers exist between 1 and 100 that are divisible by 5.

        int j = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 5 == 0) {
                j++;
            }
        }
        System.out.println(j);

    }
}
