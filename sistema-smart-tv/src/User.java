public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.lowerTheVolume();
        smartTv.lowerTheVolume();
        smartTv.lowerTheVolume();
        smartTv.turnUpTheVolume();

        System.out.println("\nCurrent channel : " + smartTv.channel);

        smartTv.changeChannel(13);

        System.out.println("\nCurrent channel : " + smartTv.channel);

        System.out.println("\nCurrent level : " + smartTv.level);


        System.out.println("\nTv is on? " + smartTv.on);
        
        System.out.println("\nCurrent level : " + smartTv.level);
    
        smartTv.on ();
        System.out.println("\n New status -> Tv is on? " + smartTv.on);

        smartTv.Off ();
        System.out.println(" New status -> Tv is on? " + smartTv.on);
        
    }
}
