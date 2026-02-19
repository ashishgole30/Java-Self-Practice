import java.util.Scanner;

public class Thirteen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER A STRING:");
        String enteredString = scanner.nextLine();

        System.out.println(enteredString.length());
        System.out.println(enteredString.toLowerCase());
        System.out.println(enteredString.toUpperCase());

        scanner.close();

    }
}
