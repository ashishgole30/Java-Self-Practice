import java.util.Scanner;

public class OrOperatorOne {
    public static void main(String[] args) {
        /*
         * OR (||)
         * Problem 20.3
         * Input marks.
         * Print "Pass" if marks ≥ 40 OR attendance ≥ 75.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Marks:");
        int marks = scanner.nextInt();
        System.out.print("Enter Your Attedance:");
        int attendance = scanner.nextInt();
        if (marks >= 40 || attendance >= 75) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIl");
        }
        scanner.close();
    }
}
