package command;

public class LightOffCommand implements Command{
	private Light light;
    private int prev;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        prev = light.getBrightness();
        light.off();
    }

    public void undo() {
        light.setBrightness(prev);
    }
}
