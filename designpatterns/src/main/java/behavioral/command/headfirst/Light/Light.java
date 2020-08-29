package behavioral.command.headfirst.Light;

public class Light {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    void on() {
        System.out.println(location + "Turn on the light");
    }

    void off() {
        System.out.println(location + "Turn off the light");
    }
}
