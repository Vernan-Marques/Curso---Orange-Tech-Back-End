package loops;

import java.util.Scanner;

/*
 Make a program that asks for a score, between 0 and 10. 
 Show a message if the value is invalid and keep asking until the user enters a valid value.
 */
public class Score {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int score;

        System.out.println("\nEnter a number between 0 and 10: ");
        score = scan.nextInt();

        while(score < 0 || score > 10){
            System.out.println("\nInvalid number. Enter a valid number: ");
            score = scan.nextInt();
        }

        System.out.println("\nThe End...");
        
    }
}
