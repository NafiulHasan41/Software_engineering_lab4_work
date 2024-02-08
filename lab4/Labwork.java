/*
 * Name:Nafiul Hasan
 * Roll:2007041
 * Used design pattern:Adapter
 */


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

    // special for smartTv
    public void youtube() {
        System.out.println("Launching YouTube on SmartTV");
    }
}

class Remote {
    TV tv;

    Remote(TV telv){
        if(tv==null)
            tv = telv;
    }
    public void togglePower() {
        if (tv.isEnabled()) {
            tv.disable();
            System.out.println("TV turnedoff");
        } else {
            tv.enable();
            System.out.println("TV turnedon");
        }
    }

    public void volumeUp() {

        int currentVolume = tv.getVolume();
        tv.setVolume(currentVolume + 1);
        System.out.println("Volume is increased to " + tv.getVolume());

    }

    public void volumeDown() {
        int currentVolume = tv.getVolume();
        tv.setVolume(currentVolume - 1);
        System.out.println("Volume is decreased to " + tv.getVolume());
    }

    public void channelUp() {
        int currentChannel = tv.getChannel();
        tv.setChannel(currentChannel + 1);
        System.out.println("Channel is increased to " + tv.getChannel());
    }

    public void channelDown() {
        int currentChannel = tv.getChannel();
        tv.setChannel(currentChannel - 1);
        System.out.println("Channel is decreased to " + tv.getChannel());
    }

}

class SmartRemote extends Remote {
    SmartRemote(TV telV){
        super(telV);
    }
    public void showYoutube() {
      
    }
}

class Adapter extends SmartRemote {
  

    Adapter(TV telV){
        super(telV);
    }


   public void showYoutube()
   {
     
      
        ((SmartTV)tv).youtube();
        
    
     
   } 



   
}

public class Labwork {

    public static void main(String[] args) {

        SmartTV smartTv1 = new SmartTV();
        GeneralTV generalTV = new GeneralTV();
        Remote remote = new Remote(generalTV);
        SmartRemote smartRemote = new SmartRemote(smartTv1);

       System.out.println(" ");
        System.err.println("Use remote for GeneralTV");
        System.out.println("");
        remote.togglePower();
        remote.volumeUp();
        remote.channelUp();
 

        System.err.println("Use smartRemote for SmartTv");
        System.out.println(" ");

        smartRemote.togglePower();
        smartRemote.volumeUp();
        smartRemote.channelUp();
    
        System.out.println("");
        Remote remote2 = new Remote(smartTv1);
        SmartRemote smartRemote2 = new SmartRemote(generalTV);

       System.out.println(" ");
        System.err.println("Use remote for SmartTv");
        System.out.println("");
        remote2.togglePower();
        remote2.volumeUp();
        remote2.channelUp();
      
 

        System.err.println("Use smartRemote for generalTv");
        System.out.println(" ");

        smartRemote2.togglePower();
        smartRemote2.volumeUp();
        smartRemote2.channelUp();
      
        
        System.out.println("");

        //adapter to show youtube
        System.out.println("Adapter to show youtube");
        SmartRemote smartRemote3= new Adapter(smartTv1);
        smartRemote3.showYoutube();

        

  

    }

}
