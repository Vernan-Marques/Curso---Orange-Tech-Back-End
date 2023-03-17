public class Main {
    public static void main(String[] args) {

        // Exercice calculator
        System.out.println("Calculator");
        Calculator.sum(3, 5);
        Calculator.substraction(10, 2);
        Calculator.multiplication(3, 5);
        Calculator.division(15, 3);

        // Exercice Time of Day
        System.out.println("Time of Day");
        TimeOfDay.getTime(9);
        TimeOfDay.getTime(14);
        TimeOfDay.getTime(23);
    }
}