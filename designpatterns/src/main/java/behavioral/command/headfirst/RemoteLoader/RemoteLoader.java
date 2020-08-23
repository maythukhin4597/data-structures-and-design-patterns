package behavioral.command.headfirst.after.RemoteLoader;

import behavioral.command.headfirst.after.Command;
import behavioral.command.headfirst.after.FanWithState.CeilingFan;
import behavioral.command.headfirst.after.FanWithState.FanHighCommand;
import behavioral.command.headfirst.after.FanWithState.FanMediumCommand;
import behavioral.command.headfirst.after.FanWithState.FanOffCommand;
import behavioral.command.headfirst.after.Garage.GarageDoor;
import behavioral.command.headfirst.after.Garage.GarageDoorDown;
import behavioral.command.headfirst.after.Garage.GarageDoorUp;
import behavioral.command.headfirst.after.Light.Light;
import behavioral.command.headfirst.after.Light.LightOff;
import behavioral.command.headfirst.after.Light.LightOn;
import behavioral.command.headfirst.after.PartyRemote.MacroCommand;
import behavioral.command.headfirst.after.Stereo.Stereo;
import behavioral.command.headfirst.after.Stereo.StereoOnWithCDCommand;
import behavioral.command.headfirst.after.Stereo.StereoffWithCDCommand;

import java.util.Arrays;
import java.util.List;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlInvoker invokerRemote = new RemoteControlInvoker();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        Command livingRoomLightOnCommand = new LightOn(livingRoomLight);
        Command kitchenLightOnCommand = new LightOn(kitchenLight);
        Command livingRoomLightOffCommand = new LightOff(livingRoomLight);
        Command kitchenLightOffCommand = new LightOff(kitchenLight);
        Command garageDoorUpCommand = new GarageDoorUp(garageDoor);
        Command garageDoorDownCommand = new GarageDoorDown(garageDoor);
        Command stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        Command stereoOffWithCDCommand = new StereoffWithCDCommand(stereo);

        invokerRemote.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        invokerRemote.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        invokerRemote.setCommand(2, stereoOnWithCDCommand, stereoOffWithCDCommand);
        invokerRemote.setCommand(3, garageDoorUpCommand, garageDoorDownCommand);

        System.out.println(invokerRemote);
        invokerRemote.onButtonPressed(0);
        invokerRemote.offButtonPressed(0);
        invokerRemote.undoButtonPressed();

        invokerRemote.onButtonPressed(1);
        invokerRemote.offButtonPressed(1);
        invokerRemote.onButtonPressed(2);
        invokerRemote.offButtonPressed(2);

        /***********************************************/
        //Added ceiling fan with state

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        Command fanHighCommand = new FanHighCommand(ceilingFan);
        Command fanMediumCommand = new FanMediumCommand(ceilingFan);
        Command fanOffCommand = new FanOffCommand(ceilingFan);

        invokerRemote.setCommand(4, fanHighCommand, fanOffCommand);
        invokerRemote.setCommand(5, fanMediumCommand, fanOffCommand);

        invokerRemote.onButtonPressed(4);
        invokerRemote.offButtonPressed(4);
        invokerRemote.undoButtonPressed();

        /***********************************************/
        //Added Macro fan with state
        List<Command> partyOn = Arrays.asList(livingRoomLightOnCommand, kitchenLightOnCommand, garageDoorUpCommand, stereoOnWithCDCommand);
        List<Command> partyOff = Arrays.asList(livingRoomLightOffCommand, kitchenLightOffCommand, garageDoorDownCommand, stereoOffWithCDCommand);

        Command macroCommandOn = new MacroCommand(partyOn);
        Command macroCommandOff = new MacroCommand(partyOff);
        invokerRemote.setCommand(6,macroCommandOn,macroCommandOff);
        invokerRemote.onButtonPressed(6);
        invokerRemote.offButtonPressed(6);
        invokerRemote.undoButtonPressed();

    }
}
