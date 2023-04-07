public class RunApplication {

    public static void main(String[] args) {
        
        Car car1 = new Car();

        car1.setColor("Blue");
        car1.setModel("BMW 3 series");
        car1.setTankCapacity(59);

        System.out.println(car1.getModel());
        System.out.println(car1.getColor());
        System.out.println(car1.getTankCapacity());
        System.out.println(car1.totalTankValue(6.39));

        Car car2 = new Car("Gray", "Mercedes", 66);

        System.out.println(car2.getModel());
        System.out.println(car2.getColor());
        System.out.println(car2.getTankCapacity());
        System.out.println(car2.totalTankValue(6.46));

    }
}
