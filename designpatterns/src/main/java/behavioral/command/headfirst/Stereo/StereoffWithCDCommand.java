package behavioral.command.headfirst.after.Stereo;

import behavioral.command.headfirst.after.Command;

public class StereoffWithCDCommand implements Command {
    private Stereo stereo;

    public StereoffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
