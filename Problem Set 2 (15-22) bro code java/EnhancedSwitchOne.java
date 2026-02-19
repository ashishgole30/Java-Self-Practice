import java.util.Scanner;

public class EnhancedSwitchOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A Number 1-7:");
        int day = scanner.nextInt();

        switch (day) {

            case 1 -> System.out.println("Monday"); // use 1 for int
                                                    // use '1' for characters
                                                    // use "1" for strings
            case 2 -> System.out.println("Tueday");
            case 3 -> System.out.println("Wedday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Satday");
            case 7 -> System.out.println("Sunday");

            default -> System.out.println("The number " + day + " is not associated to any day of the week");

        }
        scanner.close();

    }
}
