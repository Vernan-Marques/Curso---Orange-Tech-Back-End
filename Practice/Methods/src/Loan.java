/*
Calculate the final amount of a loan, from of the requested amount. 
Rates and installments influence. Arbitrarily define the bands that influence in the values.
 */
public class Loan {
    public static int calculateFiveInstallments() {
        return 5;
    }

    public static int calculateThreeInstallments() {
        return 3;
    }

    public static double calculateFiveInstallmentRate() {
        return 0.5;
    }
    
    public static double calculateThreeInstallmentRate() {
        return 0.3;
    }

    public static void calculate(double value, double payment) {

        if (payment == 5) {
            double finalValue = value + (value * calculateFiveInstallmentRate());

            System.out.println("Final loan amount for 5 installments: " + finalValue);
            
        } else if (payment == 3) {
            double finalValue = value + (value * calculateThreeInstallmentRate());

            System.out.println("Final loan amount for 3 installments: " + finalValue);
            
        } else {
            System.out.println("Value not accepted.");
        }
        
    }
    
}
