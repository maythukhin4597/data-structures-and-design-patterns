package behavioral.command.headfirst.Stereo;

import behavioral.command.headfirst.Command;

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
