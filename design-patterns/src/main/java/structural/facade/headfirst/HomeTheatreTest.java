package structural.facade.headfirst;

import behavioral.command.headfirst.FanWithState.CeilingFan;
import behavioral.command.headfirst.Light.Light;
import behavioral.command.headfirst.Stereo.Stereo;

public class HomeTheatreTest {
    public static void main(String[] args) {
        Light light = new Light("Living Room");
        CeilingFan fan = new CeilingFan("Living Room");
        Stereo stereo = new Stereo();
        HomeTheatreFacade facade = new HomeTheatreFacade(light, fan, stereo);
        facade.start();

        System.out.println("Watching..........");
        facade.end();
    }


}
