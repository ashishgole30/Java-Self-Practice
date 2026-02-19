/*
🔹 TOPIC 3 — METHOD OVERLOADING

✅ Prerequisites
You must understand:
Methods
Parameters
Return types

✅ What is Method Overloading?
Same method name, different parameters.
Java decides which method to call based on:
Number of parameters
Type of parameters
Order of parameters

✅ Why Overloading?
Improves readability
Logical grouping
Reuse same method name for similar tasks

✅ Syntax Example
public static int add(int a, int b) {
    return a + b;
}

public static double add(double a, double b) {
    return a + b;
}

✅ Valid Overloading Conditions
You can change:
Number of parameters
Data type of parameters
Order of parameters

❌ Not Valid
Changing only return type is NOT overloading.
int add(int a)
double add(int a)   ❌ Error

✅ Types of Overloading

1️⃣ By number of parameters
2️⃣ By data type
3️⃣ By parameter order

⚡ Golden Rules
Same method name
Parameters MUST be different
Return type alone is NOT enough
Happens at compile time 
*/

public class OverloadedMethodsOne {
    public static void main(String[] args) {
        /*
         * Create overloaded method:
         * multiply(int a, int b)
         * multiply(double a, double b)
         */

        int resultone = multiply(5, 3);
        System.out.println(resultone);

        double resultwo = multiply(3.23, 3.34);
        System.out.println(resultwo);

    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }
}