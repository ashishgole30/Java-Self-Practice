public class OverloadedMethodsTwo {
    public static void main(String[] args) {
        /*
         * Create overloaded method:**
         * area(int side) → square
         * area(int length, int breadth) → rectangle
         */
        int areaOfSquare = area(5);
        System.out.println("Area of Square:" + areaOfSquare + "cms squared");
        int areaOfRectangle = area(3, 6);
        System.out.println("Area of Rectangle:" + areaOfRectangle + "cms squared");
    }

    static int area(int side) {
        return side * side;
    }

    static int area(int lenght, int breadth) {
        return lenght * breadth;
    }
}
