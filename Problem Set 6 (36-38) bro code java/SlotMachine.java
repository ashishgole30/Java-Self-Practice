// Slot Machine Game In Java
/*
 * 🎰 SLOT MACHINE – Basic Idea
 * 🔹 Concept
 * You will simulate a slot machine with:
 * 3 random symbols
 * Simple betting system
 * Win conditions based on matching symbols
 * 
 * Example symbols: @ # $
 * 🧠 STEP-BY-STEP STRUCTURE
 * 1️⃣ Setup Scanner + Random
 * You already know this from Rock Paper Scissors.
 * Scanner → user input
 * Random → generate symbols
 * 
 * 2️⃣ Create Symbols
 * Use an array to store symbols.
 * Example idea:
 * String[] symbols = { "Cherry", "Lemon", "Bell", "Star", "Diamond" };
 * Why array?
 * So you can randomly pick using index.
 * 
 * 3️⃣ Ask User for Bet Amount
 * Ask user how much they want to bet.
 * Store balance.
 * Deduct bet before spin.
 * Add a loop so game continues until:
 * balance becomes 0
 * user exits
 * 
 * 4️⃣ Generate 3 Random Symbols
 * Use random index:
 * spin1
 * spin2
 * spin3
 * Each should pick random index from symbols array.
 * Then print like:
 * | @ | # | $ |
 * 
 * 5️⃣ Winning Logic (Important)
 * Basic rules:
 * If all 3 match → BIG WIN (reward 3x bet)
 * If 2 match → Small win (reward 2x bet)
 * If none match → Lose bet
 * So logically check:
 * Case 1:
 * spin1 == spin2 AND spin2 == spin3
 * Case 2:
 * spin1 == spin2 OR
 * spin2 == spin3 OR
 * spin1 == spin3
 * Else:
 * Lose
 * 
 * 6️⃣ Update Balance
 * If win:
 * balance = balance + (bet * multiplier)
 * If lose:
 * Nothing added.
 * 
 * 7️⃣ Ask Play Again
 * Like your RPS game.
 * 
 * 🧠 Program Flow Structure
 * Initialize balance
 * While balance > 0
 * Ask bet
 * Generate 3 random symbols
 * Print spin
 * Check win
 * Update balance
 * Ask play again
 * End
 * Print goodbye
 * 
 * 🎯 Difficulty Level
 * Slightly harder than Rock Paper Scissors because:
 * Uses array
 * Uses money logic
 * Uses compound conditions
 * Requires clean structure
 * 
 * ⚠️ Common Mistakes To Avoid
 * Don’t create Random inside loop repeatedly (create once outside)
 * Don’t forget to check bet <= balance
 * Use equals() for String comparison (important)
 */

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int balance = 100;
        int choice = 1;
        char symbols[] = { '@', '#', '$' };

        while (balance > 0 && choice == 1) {

            System.out.println("Balance " + balance + "$");

            System.out.print("Enter Your Bet Amount:");
            int bet = scanner.nextInt();

            if (bet > balance) {
                System.out.println("Insufficient Funds");
                continue;
            }
            if (bet <= 0) {
                System.out.println("Invalid bet");
                continue;
            }
            balance = balance - bet;

            int index1 = random.nextInt(symbols.length);
            int index2 = random.nextInt(symbols.length);
            int index3 = random.nextInt(symbols.length);

            char spin1 = symbols[index1];
            char spin2 = symbols[index2];
            char spin3 = symbols[index3];

            System.out.println(" | " + spin1 + " | " + spin2 + " | " + spin3 + " | ");
            if (spin1 == spin2 && spin2 == spin3) {
                balance = balance + (bet * 3);
                System.out.println("JACKPOT");
            } else if (spin1 == spin2 || spin2 == spin3 || spin1 == spin3) {
                balance = balance + (bet * 2);
                System.out.println("Nice! 2 symbols matched!");
            } else {
                System.out.println("Better luck next time!");
            }
            System.out.println("Updated Balance :" + balance);
            System.out.println("Type 1 to Play Again");
            System.out.println("Type 2 to Quit");
            System.out.print("(1/2):");
            choice = scanner.nextInt();
            if (choice == 2) {
                break;
            }
        }
        System.out.println("Game Over : Final Balance: " + balance + "$");
        scanner.close();
    }
}