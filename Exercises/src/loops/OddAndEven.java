package loops;

import java.util.Scanner;

/*
 Make a program that asks for N integers, calculates and displays 
 the number of even numbers and the number of odd numbers.
 */

public class OddAndEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int amountNumbers, number;
        int count = 0;
        int oddAmount = 0; 
        int pairAmount = 0;
        float divisionRemainder;
        
        System.out.println("\nEnter the number of numbers: \n");
        amountNumbers = scan.nextInt();
        System.out.println("-----------");

        do {
            System.out.println("Number: \n");
            number = scan.nextInt();

            divisionRemainder = number % 2;
   
            if(divisionRemainder == 0) pairAmount++;
            else oddAmount++;

            count++;

        } while (count < amountNumbers);

        System.out.println("Amount of even numbers: " + pairAmount);

        System.out.println("Number of odd numbers: " + oddAmount);
        
    }
}