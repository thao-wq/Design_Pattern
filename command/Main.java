package command;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Light light = new Light();
        Curtain curtain = new Curtain();
        Projector projector = new Projector();

        Command lightOff = new LightOffCommand(light);
        Command curtainDown = new CurtainDownCommand(curtain);
        Command projectorWork = new ProjectorWorkCommand(projector);

        Command meeting = new MacroCommand(
                Arrays.asList(lightOff, curtainDown, projectorWork)
        );

        RemoteControl remote = new RemoteControl();

        remote.setCommand(meeting);
        remote.pressButton();

        System.out.println("---- Undo ----");
        remote.pressUndo();

        System.out.println("---- Log ----");
        remote.showHistory();
    }
}