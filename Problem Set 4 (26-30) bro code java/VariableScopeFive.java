public class VariableScopeFive {
    static int staticVar = 100; // static variable at class level

    public static void main(String[] args) {
        /*
         * Declare a static variable at class level.
         * Access it from two different methods.
         */

        // Accessing static variable from main method
        System.out.println(staticVar);

        // Accessing static variable from another method
        anotherMethod();
    }

    static void anotherMethod() {
        System.out.println(staticVar);
    }
}
