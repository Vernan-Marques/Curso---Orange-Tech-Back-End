import java.net.Socket;

import javax.xml.crypto.Data;

public class Operators {
    public static void main(String[] args)  throws Exception {
        int age = 22;
        double weight = 68.2;
        char gender = 'M';
        boolean married = false;
        Date birthday = new Date();

        // Arithmetic

        double sum = 14.4 + 3;
        int subtraction = 12 - 6;
        int multiplication = 2 * 3;
        int division = 10 / 2;
        int module = 10 % 2;
        double result = (10 * 2) + (12 / 4);

        // Concatenation use +

        String fullName = "Java" + " Language";
        System.out.println(fullName);

        String concatenation = "?";
        System.out.println(concatenation);

        concatenation = 1 + 1 + 1 + "1";
        System.out.println(concatenation);

        concatenation = 1 + "1" + 1 + 1;
        System.out.println(concatenation);

        concatenation = 1 + "1" + 1 + "1";
        System.out.println(concatenation);

        concatenation = "1" + 1 + 1 + 1;
        System.out.println(concatenation);
        
        concatenation = "1" + (1 + 1 + 1);
        System.out.println(concatenation);

    }
}
