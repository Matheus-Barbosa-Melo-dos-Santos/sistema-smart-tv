public class SmartTv{
    boolean on = false;
    int channel = 1; 
    int volume = 25;
    
    public void on(){
        on = true; 
    }

    public void off(){
        on = false; 
    }

    public void hightVolume(){
        volume++;
    }

    public void lowVolume(){
        volume--;
    }

    public void changeChannel(int newChannel){
        channel = newChannel;
    }

    public void nextChannel(){
        channel++;
    }

    public void lastChannel(){
        channel--;
    }
}