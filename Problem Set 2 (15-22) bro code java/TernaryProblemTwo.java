import java.util.Scanner;

public class TernaryProblemTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Age:");
        int age = scanner.nextInt();

        String check = (age >= 18) ? "ADULT" : "MINOR";
        System.out.println(check);
        scanner.close();

    }
}
