package behavioral.command.headfirst.after.FanWithState;

public class CeilingFan {
    String location;
    protected static final int HIGH = 3;
    protected static final int MEDIUM = 2;
    protected static final int LOW = 1;
    protected static final int OFF = 0;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void High() {
        speed = HIGH;
        System.out.println(location + " ceiling fan is on high");
    }

    public void Medium() {
        speed = MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void Low() {
        speed = LOW;
        System.out.println(location + " ceiling fan is on low");
    }

    public void Off() {
        speed = OFF;
        System.out.println(location + " ceiling fan is on off");
    }


    public int getSpeed() {
        return speed;
    }
}
