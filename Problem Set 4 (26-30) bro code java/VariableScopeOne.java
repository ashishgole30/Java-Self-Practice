/*
TOPIC 4 - VARIABLE SCOPE

What is Variable Scope?
Scope = Where a variable is accessible (usable).
It answers: From where can I use this variable?

NOTE:
If you try to use a variable outside its scope → compile-time error.

Why Scope Matters
Prevents confusion
Avoids variable conflicts
Controls memory usage
Improves clean coding

Types of Variable Scope in Java (Beginner Level)
You only need to know 3 types right now:
1️⃣ Local Variable
2️⃣ Parameter Variable
3️⃣ Instance / Class Variable (basic idea only)

1️⃣ Local Variable
Declared inside a method or block.
Accessible:Only inside that method/block.
Example:
public static void main(String[] args) {
    int a = 10;
}
You cannot use variable int a outside main().
Important Rules for Local Variables
✔ Must be initialized before use
✔ Exists only while method runs
✔ Not accessible outside method

2️⃣ Parameter Variable
Variables declared inside method parentheses.
Example:static void greet(String name)
Here:name is a parameter variable.
Scope:Only inside that method.

3️⃣ Instance / Class Variable (Basic Level)
Declared inside class but outside methods.
Example:
class Test {
    static int x = 10;
}
Scope:Accessible by all methods inside that class.
If static → can be accessed without object.
If non-static → need object.
Declared outside methods = wider scope.

4. Block Scope (Very Important)
Variables declared inside { } blocks.
Example:
if (true) {
    int a = 5;
}
You CANNOT use a outside that block.
Same applies to loops:
for (int i = 0; i < 5; i++) {
}
i exists only inside the loop.

5. Shadowing 
If local variable has same name as class variable:
Local variable hides (shadows) class variable.
Example:
static int x = 10;
public static void main(String[] args) {
    int x = 5;
}
Inside main → x is 5
Outside → x is 10

6. Lifetime vs Scope
Scope = where accessible
Lifetime = how long it exists
Local variable:
Scope → inside method
Lifetime → until method finishes

7. Common Beginner Errors
Using variable outside method
Forgetting initialization
Trying to use loop variable outside loop
Confusing parameter and local variable
*/
public class VariableScopeOne {
    public static void main(String[] args) {
        /*
         * Declare a variable inside main.
         * Try printing it inside another method.
         * Observe error.
         */
        int localVariable = 10;
        System.out.println("Local Variable is printed:" + localVariable);
    }

    static void methodone() {
        // System.out.println(localVariable);
    }
}
