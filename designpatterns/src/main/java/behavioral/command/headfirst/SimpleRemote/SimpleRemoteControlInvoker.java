package behavioral.command.headfirst.SimpleRemote;

import behavioral.command.headfirst.Command;

public class SimpleRemoteControlInvoker {
    Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void butttonWasPressed() {
        slot.execute();
    }
}
