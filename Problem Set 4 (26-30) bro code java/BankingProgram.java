
// JAVA BANKING PROGRAM
// importing scanner class
import java.util.Scanner;

// public class Banking Program
public class BankingProgram {

    static double balance = 0; // class level static variable so that all methods can access it
    static Scanner scanner = new Scanner(System.in); // created static scanner object at class level so all methods can
                                                     // access it

    // Main method
    public static void main(String[] args) {
        /*
         * Create a simple banking program with the following features:
         * 1. Create an account
         * 2. Deposit money into the account.
         * 3. Withdraw money from the account.
         * 4. Check the account balance.
         * 5. Handle insufficient funds during withdrawal.
         */

        String createAnAccount; // string variable
        String userName = ""; // string variable , also localized using ""
        int age; // integer variable
        int choice; // integer variable
        boolean isRunning = true;

        // created basic interface
        System.out.println("------------------------------------");
        System.out.println("WELCOME TO JAVA BANKING PROGRAM!");
        System.out.println("------------------------------------");
        System.out.print("Would You Like To Create An Bank Account?(yes/no)?:");
        createAnAccount = scanner.nextLine(); // taken user input

        if (createAnAccount.equalsIgnoreCase("yes"))// if conditon to check if user choice is yes(we also ignored
        // captial/small cases)
        {
            System.out.print("Enter Your Age:");
            age = scanner.nextInt(); // taken user input for age
            // if condition to check if user's age is greater than 18
            if (age < 18) {
                System.out.println("You are not old enought to create an bank account!");
                System.exit(-1); // if user's age is not greater than 18 terminate the program
            }

            scanner.nextLine();

            // User enters username after its checked that his/her age is greater than 18
            System.out.print("Enter Username For Your Bank Account:");
            userName = scanner.nextLine();

            while (isRunning) {
                // MENU
                System.out.println("Welcome! " + userName); // welcomes user with username
                System.out.println("------------------------------------------");
                System.out.println("1. Deposit Money into the Account");
                System.out.println("2. Withdraw Money from the Account");
                System.out.println("3. Check Account Balance");
                System.out.println("4. Type 4 to Quit");
                System.out.println();
                System.out.print("Enter Your Choice (1/2/3/4):"); // takes user choice
                choice = scanner.nextInt();

                // switch case to proccess each choice
                switch (choice) {
                    case 1 -> depositMoney();
                    // call method depositMoney

                    case 2 ->
                        withdrawMoney();// call method withdrawMoney

                    case 3 ->
                        checkAccountBalance();// call method checkAccountBalance

                    // case 4 is used to quit program and display goodbye message
                    case 4 -> {
                        isRunning = false;
                        System.out.println("------------------------------------------");
                        System.out.println("Thank You!Have a Great Day!");

                    }
                    // default case if user enters anything else than (1/2/3/4)
                    default -> System.out.println("Invalid Choice");

                }

            }
        }
        // if user enters no when asked to create an account
        else {
            System.out.println("No Problem!Have a Great Day!");
        }
        scanner.close();
    }

    // method to deposit money
    static void depositMoney() {
        // User asked to deposit money in double format
        // Ex: user can also enter 10 and 10.53 Rupees
        // User cannot deposit negative money
        // user cannot deposit 0 rupees (must deposit something)
        double amount;
        System.out.print("Enter Amount to be Deposited($):");
        amount = scanner.nextDouble();
        while (amount <= 0) {
            System.out.println("------------------------------------------");
            System.out.println("Amount Deposited Cannot be Negative or Zero");
            System.out.print("Enter Amount to be Deposited($):");
            System.out.println("------------------------------------------");
            amount = scanner.nextDouble();
        }
        balance = balance + amount;
        System.out.println("------------------------------------------");
        System.out.println("$" + String.format("%.2f", amount) + " Amount is Successfully Deposited");
        System.out.println("Current Balance:$" + String.format("%.2f", balance));
        System.out.println("------------------------------------------");

    }

    // method to withdraw money
    static void withdrawMoney() {
        // User Can withdraw money only if it doesnt exceed the deposited money
        // user cannot withdraw negative money
        // user cannot withdrawy 0 rupees (must withdraw something)

        if (balance <= 0) {
            System.out.println("------------------------------------------");
            System.out.println("Insufficient Funds! Please Deposit Money First.");
            System.out.println("------------------------------------------");
            return; // exit the method if balance is zero or negative
        }

        double amount;
        System.out.print("Enter Amount to be Withdrawn($):");
        amount = scanner.nextDouble();
        while (amount <= 0 || amount > balance) {
            if (amount <= 0) {
                System.out.println("------------------------------------------");
                System.out.println("Amount Withdrawn Cannot be Negative or Zero");
                System.out.println("------------------------------------------");

            } else if (amount > balance) {
                System.out.println("------------------------------------------");
                System.out.println("Insufficient Funds!");
                System.out.println("------------------------------------------");
            }
            System.out.print("Enter Amount to be Withdrawn($):");
            amount = scanner.nextDouble();
        }
        balance = balance - amount;
        System.out.println("------------------------------------------");
        System.out.println("$" + String.format("%.2f", amount) + " was Successfully Withdrawn");
        System.out.println("Current Balance:$" + String.format("%.2f", balance));
        System.out.println("------------------------------------------");

    }

    // method to check account balance
    static void checkAccountBalance() {
        System.out.println("------------------------------------------");
        System.out.println("Current Balance:$" + String.format("%.2f", balance));
        System.out.println("------------------------------------------");

    }
}
