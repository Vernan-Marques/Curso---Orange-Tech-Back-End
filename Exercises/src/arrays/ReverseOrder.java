package arrays;

public class ReverseOrder {
    public static void main(String[] args) {

        int [] vector = {4, 3, 7, 9, 6, 1};

        System.out.print("\nNormal Order: \n");

        int count = 0;
        while (count < vector.length) {
            System.out.print(vector[count] + " ");

            count++;
        }

        System.out.print(" \nReverse Vector Order: \n");
        for(int i = vector.length-1; i >= 0; i--){
            System.out.print(vector [i] + " ");
        }
    }
}
