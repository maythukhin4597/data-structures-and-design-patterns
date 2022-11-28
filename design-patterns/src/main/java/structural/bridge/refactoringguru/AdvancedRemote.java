package structural.bridge.refactoringguru;

public class AdvancedRemote implements Remote {

    Device device;

    public AdvancedRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
    }

    @Override
    public void volumeDown() {

    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void channelDown() {

    }

    @Override
    public void channelUp() {

    }

    public void mute() {
        device.setVolume(0);
    }
}
