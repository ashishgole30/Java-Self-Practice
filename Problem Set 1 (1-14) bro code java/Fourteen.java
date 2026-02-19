import java.util.Scanner;

public class Fourteen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter An Email ID with '@':");
        String emailID = scanner.nextLine();

        int atIndex = emailID.indexOf("@");

        String username = emailID.substring(0, atIndex);
        String domain = emailID.substring(atIndex + 1);

        System.out.println("Username:" + username);
        System.out.println("Domain:" + domain);

        scanner.close();

        // REMEMBER -
        // indexOf() finds position
        // substring(start, end)
        // substring(start)

    }
}
