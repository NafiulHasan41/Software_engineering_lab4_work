interface TV {

    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int volume);

    int getChannel();

    void setChannel(int channel);
}

class GeneralTV implements TV {
    private boolean powerOn;
    private int volume;
    private int channel;

    public boolean isEnabled() {
        return powerOn;
    }
    public void enable() {
        powerOn = true;
    }
    public void disable() {
        powerOn = false;
    }
     public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getChannel() {
        return channel;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
}


class SmartTV implements TV {
    private boolean powerOn;
    private int volume;
    private int channel;

    public boolean isEnabled() {
        return powerOn;
    }
    public void enable() {
        powerOn = true;
    }
    public void disable() {
        powerOn = false;
    }
     public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getChannel() {
        return channel;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
}

public class tv {

    public static void main(String[] args) {

    }
    
}

   
