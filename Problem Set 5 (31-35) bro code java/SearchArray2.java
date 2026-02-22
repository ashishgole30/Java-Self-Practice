import java.util.Arrays;

public class SearchArray2 {
    public static void main(String[] args) {

        int[] numbers = { 11, 23, 13, 32, 42, 56, 44, 17 };
        int target = 42;
        boolean targetFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Target Element " + target + " found at index: " + i);
                targetFound = true;
                break;

            }
        }

        if (!targetFound) {
            System.out.println("Target Element not found");
        }

    }

}