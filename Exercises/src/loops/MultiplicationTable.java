package loops;

import java.util.Scanner;

/*
Develop a table generator,
capable of generating the multiplication table of any integer between 1 to 10.
The user must inform which number he wants to see the table.
The output should look like the example below:
Table of 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i, table, result;

        System.out.println("Table: ");
        table = scan.nextInt();

        System.out.println("Table of "+ table);

        for(i = 1; i <= 10; i++){

            result = table * i;

            System.out.println(table + " X " + i + " = " + result);
        }

    }
}