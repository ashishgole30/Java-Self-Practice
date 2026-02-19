import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO PUNE CITY ELECTIONS ");
        System.out.print("Enter Your Age:");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("YES! You are eligible to vote");
        } else {
            System.out.println("OOPS! You are not eligible to vote");
        }

        scanner.close();

    }
}