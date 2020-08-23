package behavioral.command.headfirst.after.Garage;

import behavioral.command.headfirst.after.Command;

public class GarageDoorUp implements Command {
    private GarageDoor garageDoor;

    public GarageDoorUp(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
