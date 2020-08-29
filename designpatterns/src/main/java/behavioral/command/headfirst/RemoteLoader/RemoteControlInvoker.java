package behavioral.command.headfirst.RemoteLoader;

import behavioral.command.headfirst.Command;
import behavioral.command.headfirst.NoCommand;

import java.util.ArrayList;
import java.util.List;

public class RemoteControlInvoker {
    private List<Command> onCommands;
    private List<Command> offCommands;
    private Command undoCommand;

    public RemoteControlInvoker() {
        offCommands = new ArrayList<>();
        onCommands = new ArrayList<>();
        undoCommand = new NoCommand();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands.add(slot, onCommand);
        offCommands.add(slot, offCommand);
    }

    public void onButtonPressed(int slot) {
        onCommands.get(slot).execute();
        undoCommand = onCommands.get(slot);
    }

    public void offButtonPressed(int slot) {
        offCommands.get(slot).execute();
        undoCommand = offCommands.get(slot);
    }

    public void undoButtonPressed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------Remote Control------ -\n");
        for (int i = 0; i < onCommands.size(); i++) {
            stringBuff.append("[slot " + i + "] " + onCommands.get(i).getClass().getName()
                    + " \t" + offCommands.get(i).getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
