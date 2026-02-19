import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number A:");
        double numberA = scanner.nextDouble();

        System.out.print("Enter Number B:");
        double numberB = scanner.nextDouble();

        double sum = numberA + numberB;
        double difference = numberA - numberB;
        double product = numberA * numberB;
        double quotient = numberA / numberB;

        System.out.println("The Addition of Number A & Number B is: " + sum);
        System.out.println("The Subtraction of Number A & Number B is: " + difference);
        System.out.println("The Product of Number A & Number B is: " + product);
        System.out.println("The Quotient of Number A & Number B is: " + quotient);

        scanner.close();
    }
}
