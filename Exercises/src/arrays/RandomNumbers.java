package arrays;

import java.util.Random;

/*
 Write a program that reads 20 random integers (between 0 and 100) and stores them in a vector.
 At the end, show the numbers and their successors.
 */

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int[] randomNumbers = new int[20];

        for (int i = 0; i < randomNumbers.length; i++) {
            int number = random.nextInt(100);
            randomNumbers[i] = number;
        }

        System.out.print("\nRandom Numbers: ");
        for(int number : randomNumbers){
            System.out.print(number + " ");
        }

        System.out.print("\n\nSuccessor Number: ");
        for(int number : randomNumbers){
            System.out.print((number + 1) + " ");
        }

        System.out.print("\n");
    }
}
