package loops;

import java.util.Scanner;

/*
 Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
 */

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i;
        int factorial;
        int multiplication = 1;

        System.out.println("Enter a number: ");
        factorial = scan.nextInt();

        for(i = factorial; i >= 1; i--){
            multiplication = multiplication * i;
        }

        System.out.println("The factorial of "+ factorial + " is " + multiplication);
    }
}