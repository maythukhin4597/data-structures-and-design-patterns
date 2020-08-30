package behavioral.command.headfirst.Light;

public class Light {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + "Turn on the light");
    }

    public void off() {
        System.out.println(location + "Turn off the light");
    }
}
