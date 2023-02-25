package loops;

/*
 Write a program that reads sets of two values. 
 The first representing the student's name and the second representing his age. 
 (Stop the program by entering the value 0 in the name field.)
 */

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
