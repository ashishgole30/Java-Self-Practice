import java.util.Scanner;

public class WhileLoopTwelve {
    public static void main(String[] args) {
        // BRO CODE WHILE LOOP EXAMPLE 2
        Scanner scanner = new Scanner(System.in);
        String response = "";
        while (!response.equals("Q")) {
            System.out.print("You are playing a game! Press Q to quit:");
            response = scanner.next().toUpperCase();
        }
        System.out.println("Game Over!");
        scanner.close();
    }
}
