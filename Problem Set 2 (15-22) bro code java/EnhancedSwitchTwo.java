import java.util.Scanner;

public class EnhancedSwitchTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A Character a,e,i,o,u:");
        /*
         * In Java, the Scanner class does not have a dedicated nextChar() method. To
         * read a single character (char), you use a combination of the next() method
         * and the charAt(0) method.
         */

        char input = scanner.next().toLowerCase().charAt(0);
        // Convert input to lowercase .toLowerCase()

        switch (input) {

            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
            default -> System.out.println(input + " is a consonant");

        }
        scanner.close();

    }
}
