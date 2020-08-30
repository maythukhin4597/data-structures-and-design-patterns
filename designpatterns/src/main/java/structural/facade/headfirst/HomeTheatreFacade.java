package structural.facade.headfirst;

import behavioral.command.headfirst.FanWithState.CeilingFan;
import behavioral.command.headfirst.Light.Light;
import behavioral.command.headfirst.Stereo.Stereo;

public class HomeTheatreFacade {
    Light light;
    CeilingFan fan;
    Stereo stereo;

    public HomeTheatreFacade(Light light, CeilingFan fan, Stereo stereo) {
        this.light = light;
        this.fan = fan;
        this.stereo = stereo;
    }

    public void start() {
        System.out.println("Starts everything");
        light.on();
        fan.High();
        stereo.on();
        stereo.setVolume(11);
        stereo.setCD();
    }

    public void end() {
        System.out.println("Ends everything");
        stereo.off();
        fan.Off();
        light.off();
    }
}
