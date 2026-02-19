/* TOPIC METHODS

✅ Prerequisites
You should know:
Variables
Data types (int, double, String, etc.)
if-else
Loops
main() method structure

✅ What is a Method?
A method is a block of code that:
Performs a specific task
Can be reused
Runs only when called
Think of it like a machine:
Input → Processing → Output

✅ Why Methods?
Code reuse
Clean structure
Avoid repetition
Easier debugging

Syntax:
AccessModifier ReturnType methodName(ParameterList) {
    // method body (statements)
}
AccessModifier: This defines the visibility of the method. 
Common modifiers include public, private, protected, or the default (package-private).

ReturnType: This specifies the type of data the method will return when it finishes execution.
It can be any valid Java data type (e.g., int, String, a custom class) or void if the method does not return a value.

methodName: This is a unique identifier for the method, 
which should follow Java's naming conventions (usually camelCase, starting with a lowercase letter).

ParameterList: Enclosed in parentheses (), this is a comma-separated list of inputs the method accepts.
Each parameter must specify a data type and a name (e.g., int x, String name).
This list can be empty if the method requires no inputs.

{} (Method Body): The block of code enclosed in curly braces contains the instructions 
 that are executed when the method is called. 

⚡ Golden Rules
If return type ≠ void → must return value
Method must be called to execute
Parameters are local to method
Use meaningful method names

Types of methods 
1. Void method
2. Return method

1️⃣ What is a Parameter?
A parameter is a variable written inside the method definition.
It acts as a placeholder to receive data.
Syntax:
returnType methodName(dataType parameterName)
Example:
public static void greet(String name)
Here:
String name → is a parameter
It receives value when method is called
Think:
👉 Parameter = input slot inside method

2️⃣ What is an Argument?
An argument is the actual value you pass when calling the method.
Example:
greet("Ashish");
Here:
"Ashish" → is the argument
It goes into parameter name
⚡ Simple Analogy
Think of method like a food machine:
Parameter = empty box to receive item
Argument = actual item you put inside

5️⃣ Important Rules
✔ Parameter data type must match argument data type
✔ Order matters
✔ Number of arguments must match number of parameters
✔ You can have multiple parameters separated by commas

6️⃣ Memory Understanding (Important)
When method is called:
A new copy of parameters is created
Java uses pass by value
Changes inside method DO NOT affect original variable

Common Beginner Mistakes
❌ Confusing parameter and argument
❌ Forgetting return keyword
❌ Mismatch in data types
❌ Writing method inside main (not allowed)

Method Calling
1️⃣ What is Method Calling?
Method calling means executing a method by writing its name followed by parentheses.
Definition:
👉 Method definition = writing the method
👉 Method call = using/executing the method
2️⃣ Basic Syntax
If method is in same class and static:
methodName();
If method has parameters:
methodName(value1, value2);

 */

import java.util.Scanner;

public class MethodOne {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Create a method that:
        // Takes an integer and prints whether it is EVEN or ODD.
        System.out.print("Enter an Integer:");
        int a = scanner.nextInt();
        evenOrOdd(a);
        scanner.close();
    }

    static void evenOrOdd(int a) {
        if (a % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

    }
}
// You don’t need to return anything because you're only printing.
// A static method can ONLY directly call another static method.
