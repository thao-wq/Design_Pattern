package command;

public class LightOnCommand implements Command {
    private Light light;
    private int prev;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        prev = light.getBrightness();
        light.on();
    }

    public void undo() {
        light.setBrightness(prev);
    }
}