package behavioral.command.headfirst.after.FanWithState;

import behavioral.command.headfirst.after.Command;

public class FanHighCommand implements Command {
    CeilingFan ceilingFan;
    int speed;

    public FanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        speed = ceilingFan.getSpeed();
        ceilingFan.High();
    }

    @Override
    public void undo() {
        if (speed == CeilingFan.HIGH) {
            ceilingFan.High();
        } else if (speed == CeilingFan.MEDIUM) {
            ceilingFan.Medium();
        } else if (speed == CeilingFan.LOW) {
            ceilingFan.Low();
        } else if (speed == CeilingFan.OFF) {
            ceilingFan.Off();
        }
    }
}
