package loops;

import java.util.Scanner;

/*
 Write a program that reads 5 numbers and returns the largest 
 number and the average of those numbers.
 */
public class LargestAndAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        int largest = 0;
        int sum = 0;
        float average = 0;

        for(int i = 0; i < 5; i++){
            
            System.out.println("Number: ");
            number = scan.nextInt();

            sum = number + sum;
            average = sum/5f;

            if(number > largest) largest = number;
            
        }
        
        System.out.println("The largest number is: "+ largest);
        System.out.println("Average: "+ average);
        
    }
}
