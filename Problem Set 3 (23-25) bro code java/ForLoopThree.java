public class ForLoopThree {
    public static void main(String[] args) {
        // 1.3 Print all even numbers between 1 and 50.
        for (int i = 0; i <= 50; i = i + 2) {
            if (i == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}

// or simply start from int i = 2
