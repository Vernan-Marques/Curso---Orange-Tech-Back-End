package arrays;

import java.util.Random;

/*
 Generate and print a 4x4 M matrix with random values ​​between 0-9.
 */

public class MultidimensionalArrays {
    public static void main(String[] args) {
        Random random = new Random();

        int[] [] M = new int [4][4];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = random.nextInt(9);
                
            }
        }

        System.out.println("Matrix: ");
        for (int[] line : M) {
            for (int column : line) {
                System.out.print(column + " ");
            }

            System.out.println();
        }
    }
}
