class RunApp {
    public static <Employee> void main(String[] args) {
        
        Employee employee = new Employee();

        // Up cast
        Employee Manager = new Manager();
        Employee Seller = new Seller();
        Employee Janitor = new Janitor();

        //Down cast
        Seller seller = (Seller) new Employee();

    }
}
