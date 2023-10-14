public class Px7_4 {
    public static void main(String[] args) {
        MyTv myTv = new MyTv();

        myTv.setChannel(10);
        System.out.println("CH:" + myTv.getChannel());
        myTv.setVolume(20);
        System.out.println("VOL:" + myTv.getVolume());
    }
}

class MyTv {
    private boolean isPowerOn;
    private int channel;

    private int previousChannel;
    private int volume;

    private final int MAX_VOLUME = 100;
    private final int MIN_VOLUME = 0;
    private final int MAX_CHANNEL = 100;
    private final int MIN_CHANNEL = 0;

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel > MAX_CHANNEL || channel < MIN_CHANNEL) {
            return;
        }
        this.previousChannel = this.channel;
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME || volume < MIN_VOLUME) {
            return;
        }
        this.volume = volume;
    }

    public void gotoPrevChannel () {
        setChannel(this.previousChannel);
    }
}