public class exemples {

    // class variable ''
    double balance = 10.0;

    public void toWithdraw(Double value) throws Exception {

        // method local variable
        double newBalance = balance -  value;
    }

    public void printBalance() {
        
        // available in every class
        System.out.println(balance);
    }

    public double calculateExponentialDebt(){

        // Method local variable
        double divisionValue = 50.0;
        double amountValue = 0.0;
        for (int x = 1; x <= 5; x++) {
            double calculatedValue = divisionValue * x;
            amountValue = amountValue + calculatedValue;
        }
    }
}
