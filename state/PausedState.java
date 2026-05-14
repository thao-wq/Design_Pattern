package state;

public class PausedState implements State {

    @Override
    public void play(MediaPlayer player) {

        System.out.println("Music playing.");

        player.setIcon("Pause Icon");

        player.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer player) {

        System.out.println("Music is already paused.");
    }
}


