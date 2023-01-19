public class RelationalOperators {
    public static void main(String[] args) {

        //Case 1

        int number1 = 1;
        int number2 = 2;

        boolean yesNo = number1 == number2;

        System.out.println("\nIs numberOne equal to numberTwo? " + yesNo);
        
        yesNo = number1 != number2;

        System.out.println("\nIs numberOne different to numberTwo? " + yesNo);

        // Case 2

        String name1 = "Pedro";
        String name2 = new String("Pedro");

        System.out.println(name1 == name2);

        // The "equals" method will only be used when comparing objects or texts.
        System.out.println(name1.equals(name2)); 
    }
}
