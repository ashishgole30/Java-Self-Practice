public class VarArgs3 {
    public static void main(String[] args) {
        // Find Average of Double numbers using varargs
        System.out.println("Average Of Numbers Is:" + average(1.1, 1.2, 1.3, 1.4));
    }

    static double average(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum = sum + number;
        }
        sum = sum / numbers.length;
        return sum;
    }
}
