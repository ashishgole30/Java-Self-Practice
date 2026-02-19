public class OverloadedMethodsThree {
    public static void main(String[] args) {

        /*
         * Create overloaded method:
         * greet()
         * greet(String name)
         */

        greet();
        greet("Ashish");
    }

    static void greet() {
        System.out.println("Hey! how are you?");
    }

    static void greet(String name) {
        System.out.println("Hey!" + name + " how are you?");

    }
}
