public class Main {
    public static void main(String[] args) {
        // Returns
        System.out.println("Return exercice");

        double squareArea = Quadrilateral.area(3);
        System.out.println("Square area :"+ squareArea);

        double rectangleArea = Quadrilateral.area(5, 5);
        System.out.println("Rectangle area :"+ rectangleArea);
        
        double trapezeArea = Quadrilateral.area(7,8,9);
        System.out.println("Trapeze area :"+ trapezeArea);

    }
}
