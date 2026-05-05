package command;

public class ProjectorWorkCommand implements Command {
    private Projector projector;
    private String prev;

    public ProjectorWorkCommand(Projector projector) {
        this.projector = projector;
    }

    public void execute() {
        prev = projector.getMode();
        projector.workMode();
    }

    public void undo() {
        if (prev.equals("OFF")) projector.off();
        else if (prev.equals("MOVIE")) projector.movieMode();
        else projector.workMode();
    }
}