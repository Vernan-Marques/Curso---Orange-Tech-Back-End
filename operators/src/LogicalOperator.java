public class LogicalOperator {
    public static void main(String[] args) {
        boolean condition1 = true;

        boolean condition2 = false;

        // First Conditional
        if(condition1 && condition2) {
            System.out.println("\nConditions are true.");
        }
        else {
            System.out.println("\nConditions are false.");
        }

        // Second Conditional
        if(condition1 || condition2) {
            System.out.println("\nConditions are true.");
        }

        System.out.println("\nThe End!");
    }
}
