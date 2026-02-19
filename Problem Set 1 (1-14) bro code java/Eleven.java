import java.util.Scanner;

public class Eleven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Prinicipal Amount:");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate:");
        double rate = scanner.nextDouble() / 100;

        System.out.print("Enter Number of Times Compounded (n):");
        int n = scanner.nextInt();

        System.out.print("Enter Time in Years:");
        int time = scanner.nextInt();

        double finalAmount = principal * Math.pow(1 + (rate / n), n * time);

        System.out.printf("%.2f", finalAmount);

        scanner.close();
    }
}
