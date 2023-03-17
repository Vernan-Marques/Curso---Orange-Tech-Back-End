/*
 Calculate the 4 basic operations: addition, subtraction, 
 multiplication and division. Always 2 values ​​must be passed.
 */
public class Calculator {
    public static void sum(double number1, double number2) {

        double result = number1 + number2;

        System.out.println(number1 + " + " +number2 + " = " + result);
    }

    public static void substraction(double number1, double number2) {

        double result = number1 - number2;

        System.out.println(number1 + " - " +number2 + " = " + result);

    }

    public static void multiplication(double number1, double number2) {

        double result = number1 * number2;

        System.out.println(number1 + " * " +number2 + " = " + result);

    }

    public static void division(double number1, double number2) {

        double result = number1 / number2;

        System.out.println(number1 + " / " +number2 + " = " + result);

    }
}
