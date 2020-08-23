package behavioral.command.headfirst.after.SimpleRemote;

import behavioral.command.headfirst.after.Command;

public class SimpleRemoteControlInvoker {
    Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void butttonWasPressed() {
        slot.execute();
    }
}
