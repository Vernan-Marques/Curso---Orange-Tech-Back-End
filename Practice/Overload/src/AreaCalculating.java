/*
 * Create an application that calculates the area of ​​the three notable quadrilaterals: 
 * square, rectangle and trapezium. Use overload.
 */

public class AreaCalculating {
    public static void area(double side) {
        System.out.println("Square area: "+ side * side);
    }

    public static void area(double side1, double side2) {
        System.out.println("Rectangle area: "+ side1 * side2);
    }

    public static void area(double majorBase1, double minorBase, double height) {
        System.out.println("Trapeze area: "+ ((majorBase1 + minorBase) * height)/2);
    }

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("Diamond area: "+ (diagonal1 * diagonal2)/2);
    }
}
