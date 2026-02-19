import java.util.Scanner;

public class NotOperatorOne {
    public static void main(String[] args) {
        /*
         * NOT (!)
         * Problem 20.5
         * Input boolean isRaining.
         * Print "Go outside" if it is NOT raining.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is it Raining?(true/false):");
        boolean isRaining = scanner.nextBoolean();
        if (!isRaining) { // instead of isRaining!= true
            System.out.println("Go Outside");
        } else {
            System.out.println("Stay at Home");
        }
        scanner.close();
    }
}
/* case is ignored automatically for booleans */