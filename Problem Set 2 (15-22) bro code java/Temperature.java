import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Celsius To Farhenhit");
        System.out.println("2. Farhenhit To Celsius");
        System.out.print("Enter Your Choice:");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter Temperature in Celsius:");
            double inputOne = scanner.nextDouble();
            double outputOne = (inputOne * 9 / 5) + 32;
            System.out.printf("The temperature in farhenheit is %.2f farhenheits", outputOne);
        } else if (choice == 2) {
            System.out.print("Enter Temperature in Farhenheit:");
            double inputTwo = scanner.nextDouble();
            double outputTwo = (inputTwo - 32) * 5 / 9;
            System.out.printf("The temperature in celsius is %.2f celsiuss", outputTwo);

        } else {
            System.out.println("Invalid Choice");
        }
        scanner.close();
    }

}
