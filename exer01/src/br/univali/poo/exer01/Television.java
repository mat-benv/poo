package br.univali.poo.exer01;

public class Television {
    private int channel; //1 10 16
    private int volume; //0 to 10
    private boolean on;

    public Television(){
        this.channel = 1;
        this.volume = 0;
        this.on = false;
    }
    public void setChannel(int channel){
        this.channel = channel;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public int getChannel(){
        return this.channel;
    }
    public int getVolume(){
        return this.volume;
    }
    public boolean getOn(){
        return this.on;
    }
    public void raiseVolume(){
        if(this.volume < 10){
            this.volume++;
        } else {
            System.out.print("Volume at maximum already.\n");
        }
    }
    public void lowerVolume(){
        if(this.volume > 0){
            this.volume--;
        } else {
            System.out.print("Volume at zero already.\n");
        }
    }
    public void channelUp(){
        if(this.channel < 16) {
            this.channel++;
        } else {
            this.channel = 1;
        }
    }
    public void channelDown(){
        if(this.channel > 1){
            this.channel--;
        } else {
            this.channel = 16;
        }
    }
    public void turnOn(){
        this.on = true;
    }
    public void turnOff(){
        this.channel = 1;
        this.volume = 0;
        this.on = false;
    }
    public boolean isOn(){
        return this.on;
    }
    public String toString(){
        return
                String.format("%s: %s\n%s: %d\n%s: %d",
                        "Status: ",  (isOn() ? "On" : "Off"),
                        "Channel: ", getChannel(),
                        "Volume: ", getVolume());
    }
}
