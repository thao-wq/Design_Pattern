package command;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private Command command;
    private Command lastCommand;
    private List<String> history = new ArrayList<>();

    public void setCommand(Command cmd) {
        this.command = cmd;
    }

    public void pressButton() {
        command.execute();
        lastCommand = command;
        history.add(command.getClass().getSimpleName());
    }

    public void pressUndo() {
        if (lastCommand != null) {
            lastCommand.undo();
        }
    }

    public void showHistory() {
        System.out.println("=== HISTORY ===");
        for (String s : history) {
            System.out.println(s);
        }
    }
}