package edu.vernan.primeirasemana;
public class Method {
    public static void main(String[] args) {
        
        String firstName = "Vernan";
        String secondName = "Marques";

        // Calling the fullName Method
        String fullName = fullName(firstName, secondName);

        System.out.println(fullName);
    }

    public static String fullName( String firstName, String secondName) {

        // Concatenates
        return "My name's " + firstName.concat(" ").concat(secondName);

    }
}
