package command;

public class CurtainDownCommand implements Command {
    private Curtain curtain;
    private int prev;

    public CurtainDownCommand(Curtain curtain) {
        this.curtain = curtain;
    }

    public void execute() {
        prev = curtain.getPosition();
        curtain.down();
    }

    public void undo() {
        curtain.setPosition(prev);
    }
}