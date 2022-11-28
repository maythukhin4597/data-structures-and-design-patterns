package structural.bridge.refactoringguru;

public interface Device {
    boolean isOn();

    void on();

    void off();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
