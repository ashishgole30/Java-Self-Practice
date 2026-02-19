public class VariableScopeThree {
    int x = 10; // class variable

    public static void main(String[] args) {
        /*
         * Create a class variable and local variable with same name.
         * Print both (understand shadowing).
         */
        int x = 9; // local variable
        System.out.println(x);

        // object creation to access class variable
        VariableScopeThree obj = new VariableScopeThree();
        System.out.println(obj.x);

    }
}
