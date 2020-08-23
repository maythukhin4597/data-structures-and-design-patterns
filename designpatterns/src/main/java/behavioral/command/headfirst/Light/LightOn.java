package behavioral.command.headfirst.after.Light;

import behavioral.command.headfirst.after.Command;

public class LightOn implements Command {
    private Light light;

    public LightOn(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
