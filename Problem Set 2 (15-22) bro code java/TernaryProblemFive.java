import java.util.Scanner;

public class TernaryProblemFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Temperature:");
        int temp = scanner.nextInt();

        String hotOrCold = (temp > 30) ? "HOT" : "Normal";
        System.out.println(hotOrCold);
        scanner.close();

    }

}
