import java.util.Scanner;

public class TernaryProblemOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter An Integer Number:");
        int number = scanner.nextInt();

        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);
        scanner.close();
    }
}