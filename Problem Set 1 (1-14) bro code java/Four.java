
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter An Adjective:");
        String adjective = scanner.nextLine();

        System.out.print("Enter A Noun:");
        String noun = scanner.nextLine();

        System.out.print("Enter A Verb:");
        String verb = scanner.nextLine();

        System.out.println("The " + adjective + " " + noun + " likes to " + verb + ".");

        scanner.close();
    }
}
