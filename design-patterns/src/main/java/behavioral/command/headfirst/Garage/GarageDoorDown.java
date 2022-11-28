package behavioral.command.headfirst.Garage;

import behavioral.command.headfirst.Command;

public class GarageDoorDown implements Command {
    private GarageDoor garageDoor;

    public GarageDoorDown(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
