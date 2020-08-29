package behavioral.command.headfirst.Garage;

import behavioral.command.headfirst.Command;

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
