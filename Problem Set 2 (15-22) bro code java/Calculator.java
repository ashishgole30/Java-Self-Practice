/*
 #19 Calculator Program  
Create a calculator that:
Takes two numbers
Takes operator (+ - * /)
Uses switch
Prints result 
*/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        double a = scanner.nextDouble();
        System.out.print("Enter Operator (+,-,*,/):");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter 2nd number:");
        double b = scanner.nextDouble();

        switch (operator) {
            case '+' -> System.out.println(a + b);
            case '-' -> System.out.println(a - b);
            case '*' -> System.out.println(a * b);

            /*
             * ❗ Rule of enhanced switch (->)
             * With ->, you CANNOT directly put an if-else statement
             * unless you use a block {}
             * FOR MULTIPLE STATEMENTS , LOOPS , IF ELSE USE BLOCK {}
             */

            case '/' -> {
                if (b == 0) {
                    System.out.println("Division Not Possible ");
                } else {
                    System.out.println(a / b);
                }
            }
            default -> System.out.println(operator + " Is An Invalid Operator");

        }
        scanner.close();
    }
}
