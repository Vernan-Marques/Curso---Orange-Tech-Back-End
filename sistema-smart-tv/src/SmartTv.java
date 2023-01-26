public class SmartTv {
    boolean on = false;
    int channel = 1;
    int level = 25;

    public void changeChannel (int newChannel) {
        channel = newChannel;
    }

    // Change Channel + or -
    public void increaseChannel() {
        channel++;
    }
    public void shrinkChannel() {
        channel--;
    }

    // Volume Level
    public void turnUpTheVolume(){
        level++;
        System.out.println("Increasing the volume to: "+ level);
    }

    public void lowerTheVolume(){
        level--;
        System.out.println("Decreasing the volume to:"+ level);
    }

    public void on(){
        on = true;
    }
    
    public void Off() {
        on = false;
    }
}