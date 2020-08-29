package behavioral.command.headfirst.Stereo;

public class Stereo {

    void on() {
        System.out.println(" stereo is on");
    }

    void off() {
        System.out.println(" stereo is off");
    }

    void setCD() {
        System.out.println(" stereo is set for CD input");
    }

    void setDVD() {
        System.out.println(" stereo is set for DVD input");
    }

    void setRadio() {
        System.out.println(" stereo is set for Radio");
    }

    void setVolume(int volume) {
        System.out.println(" Stereo volume set to " + volume);
    }
}
