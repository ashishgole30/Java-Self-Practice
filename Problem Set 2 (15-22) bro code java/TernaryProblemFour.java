import java.util.Scanner;

public class TernaryProblemFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Marks:");
        int marks = scanner.nextInt();

        String passOrFail = (marks >= 40) ? "PASS" : "FAIL";
        System.out.println(passOrFail);
        scanner.close();

    }

}
