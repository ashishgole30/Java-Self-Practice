import java.util.Scanner;

public class WhileLoopThirteen {
    public static void main(String[] args) {
        // BRO CODE WHILE LOOP EXAMPLE 3
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your age: ");
        int age = scanner.nextInt();
        while (age < 0) {
            System.out.println("Your age cant be negative. Please enter a valid age.");
            System.out.print("enter your age: ");
            age = scanner.nextInt();
        }
        System.out.println("You are " + age + " years old.");
        scanner.close();
    }
}
