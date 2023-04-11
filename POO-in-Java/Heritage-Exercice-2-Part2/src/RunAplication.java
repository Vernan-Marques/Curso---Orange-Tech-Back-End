public class RunAplication {
    public static void main(String[] args) {
        
        MotherClass [] class_ = new MotherClass[]{new SonClass1(), new SonClass2(), new MotherClass()};

        for(MotherClass class0: class_) {
            class0.method1();
        }

        System.out.println("");
        
        for(MotherClass class0: class_) {
            class0.method2();
        }

        System.out.println("");

        SonClass2 sonClass2 = new SonClass2();
        sonClass2.method2();
    }
}
