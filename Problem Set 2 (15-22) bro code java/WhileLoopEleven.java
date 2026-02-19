import java.util.Scanner;

public class WhileLoopEleven {
    public static void main(String[] args) {
        // BRO CODE WHILE LOOP EXAMPLE 1
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}