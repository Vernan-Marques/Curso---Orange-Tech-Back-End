class Calculator implements MathematicalOperation{

    @Override
    public void Addition(double operating1, double operating2) {
        
        System.out.println("Addition: "+ (operating1 + operating2));
    }

    @Override
    public void subtraction(double operating1, double operating2) {
        
        System.out.println("subtraction: "+ (operating1 - operating2));
    }

    @Override
    public void multiplication(double operating1, double operating2) {
       
        System.out.println("multiplication: "+ operating1 * operating2);
    }

    @Override
    public void division(double operating1, double operating2) {
        
        System.out.println("division: "+ operating1 / operating2);
    }
    
}
