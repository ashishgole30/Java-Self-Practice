public class VarArgs2 {
    public static void main(String[] args) {

        // Find minimum integers using Varargs
        System.out.println("Minimum Number Is:" + findMin(12, 23, 13, 13, 13, 142, 4235, 1232));
    }

    static int findMin(int... numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}