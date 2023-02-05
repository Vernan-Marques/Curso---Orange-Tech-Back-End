import java.util.Locale;
import java.util.Scanner;

public class AboutMeTwo {
    public static void main(String[] args) {
        
        // Creating scanner object
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\nType your name: ");
        String name = scanner.next();
    
        System.out.println("\nType your last name: ");
        String lastname = scanner.next();
    
        System.out.println("\nEnter your age: ");
        int age = scanner.nextInt();

        System.out.println("\nEnter your height: ");
        double height = scanner.nextDouble();

        System.out.println("\nHi, my name is " + name + " " + lastname);
        System.out.println("I'm " + age);
        System.out.println("My height is " + height + " cm");
    }
}