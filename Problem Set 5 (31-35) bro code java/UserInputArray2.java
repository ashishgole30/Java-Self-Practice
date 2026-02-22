/*
 * 🔹 Practice Problem — City Names Array
 * 📝 Problem Statement
 * Create a program that: Asks the user how many cities they want to store.
 * Create a String array using that size.
 * Use a loop to ask the user to enter each city name.
 * Store each city name inside the array.
 * After storing all cities, print them using an enhanced for loop.
 * 
 * 🔹 Example Flow (Concept Only)
 * If user enters:
 * How many cities? 3
 * Then program asks:
 * Enter city name:
 * Enter city name:
 * Enter city name:
 * Finally output:
 * Mumbai Delhi Pune
 */

import java.util.Scanner;
import java.util.Arrays;

public class UserInputArray2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cities;
        int size;

        System.out.print("How many number of cities do you want?:");
        size = scanner.nextInt();

        scanner.nextLine();

        cities = new String[size];

        for (int i = 0; i < cities.length; i++) {
            System.out.print("Enter name of a city:");
            cities[i] = scanner.nextLine();
        }

        for (String city : cities) {
            System.out.println(city);

        }
        scanner.close();
    }
}