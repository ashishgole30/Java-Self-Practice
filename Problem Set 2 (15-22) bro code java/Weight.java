import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Kgs To Pounds");
        System.out.println("2. Pounds To Kgs");
        System.out.print("Enter You Choice:");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter weight in Kgs:");
            double originalValueOne = scanner.nextDouble();
            double newValueOne = originalValueOne * 2.20462;
            System.out.printf("The weight in pounds is %.2f pounds", newValueOne);

        } else if (choice == 2) {
            System.out.print("Enter weight in Pounds:");
            double originalValueTwo = scanner.nextDouble();
            double newValueTwo = originalValueTwo / 2.20462;
            System.out.printf("The weight in kilograms is %.2f kilograms", newValueTwo);

        } else {
            System.out.println("Invalid Choice");
        }

        scanner.close();

    }
}
