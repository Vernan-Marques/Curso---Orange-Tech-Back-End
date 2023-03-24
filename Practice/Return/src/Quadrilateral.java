/*
 * Recreate an application that calculates the area of ​​the 3 notable quadrilaterals.
 * Now make the methods return values.
 */

public class Quadrilateral {
    public static double area(double side) {
        return side * side;
    }

    public static double area(double side1, double side2) {
        return side1 * side2;
    }

    public static double area(double majorBase, double minorBase, double height) {
        return ((majorBase + minorBase)* height) / 2;
    }
}
