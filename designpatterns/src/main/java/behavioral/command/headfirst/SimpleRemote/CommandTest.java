package behavioral.command.headfirst.after.SimpleRemote;

import behavioral.command.headfirst.after.Command;
import behavioral.command.headfirst.after.Garage.GarageDoor;
import behavioral.command.headfirst.after.Garage.GarageDoorUp;
import behavioral.command.headfirst.after.Light.Light;
import behavioral.command.headfirst.after.Light.LightOn;
import behavioral.command.headfirst.after.Stereo.Stereo;
import behavioral.command.headfirst.after.Stereo.StereoOnWithCDCommand;

public class CommandTest {
    public static void main(String[] args) {
        SimpleRemoteControlInvoker remoteControl = new SimpleRemoteControlInvoker();
        Light light = new Light("living room");
        Command lightOnCommand = new LightOn(light);
        remoteControl.setCommand(lightOnCommand);
        remoteControl.butttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        Command garageDoorUp = new GarageDoorUp(garageDoor);
        remoteControl.setCommand(garageDoorUp);
        remoteControl.butttonWasPressed();

        Stereo stereo = new Stereo();
        Command stereoOnCommand = new StereoOnWithCDCommand(stereo);
        remoteControl.setCommand(stereoOnCommand);
        remoteControl.butttonWasPressed();
    }
}
