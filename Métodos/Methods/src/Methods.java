public class Methods {
    public static void main(String[] args) throws Exception {

        //Exemples of Methods
        sum (int n1, int n2) {}

        openConnection () {}

        finishProcessing () {}

        findById(int id){}
    }

    // method visibility_______

    public double add(int numb1, int numb2) {
        
        return ... ;// Will return something
    }

    public void imprimir(String texto) {
        // Void - Will not return anything
    }

    // throws Exception : Indicated that the method may generate an exception
    public double dividir(int dividendo, int divisor) throws Exception{}

    // private - This method cannot be seen by other classes
    private void privateMethod(){}

    public void gravarCliente(String nome, String cpf){
        // This method is intended to record customer information. 
        // Why not create a client object and pass it as a parameter?
        // See below:
    }

    public void gravarCliente(Cliente cliente){}
    // or
    public void gravar(Cliente cliente) {}
}
