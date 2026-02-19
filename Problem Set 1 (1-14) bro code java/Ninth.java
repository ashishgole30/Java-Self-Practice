import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter An Number:");
        double number = scanner.nextDouble();

        System.out.println(Math.sqrt(number));
        System.out.println(Math.pow(number, 2));
        System.out.println(Math.abs(number));

        scanner.close();
    }
}
