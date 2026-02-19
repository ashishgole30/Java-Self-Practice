import java.util.Scanner;

public class OrOperatorTwo {
    public static void main(String[] args) {
        /*
         * Problem 20.4
         * Input day name.
         * Print "Weekend" if day is Saturday OR Sunday.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Day:");
        String dayName = scanner.nextLine();
        if (dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday")) {
            System.out.println("Weekend");
        } else {
            System.out.println("Not a weekend");
        }
        scanner.close();
    }
}
