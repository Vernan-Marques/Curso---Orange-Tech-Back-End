package loops;

import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;

        while(true) {
            System.out.println("\nName: ");
            name = scan.next();

            if(name.equals("0")) break;
        
            System.out.println("\nAge: ");
            age = scan.nextInt();
        }

        System.out.println("\nThe End.");

    }
}
