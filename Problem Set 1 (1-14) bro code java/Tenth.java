import java.util.Scanner;

public class Tenth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Item Name:");
        String itemName = scanner.nextLine();
        System.out.print("Enter Item Price:");
        double itemPrice = scanner.nextDouble();

        System.out.printf("Item: %s | Price: %.2f", itemName, itemPrice);
        scanner.close();
    }
}
