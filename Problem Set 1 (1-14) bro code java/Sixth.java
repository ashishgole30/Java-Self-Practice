import java.util.Scanner;

public class Sixth {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter item name:");
        String itemname = scanner.nextLine();

        System.out.print("Enter item price:");
        double itemprice = scanner.nextDouble();

        System.out.print("Enter item quantity:");
        int itemquantity = scanner.nextInt();

        double finalprice = itemquantity * itemprice;

        System.out.println("Great! You purchased " + itemquantity + " " + itemname + " for " + finalprice + "Rs");
        scanner.close();
    }
}
