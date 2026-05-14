package state;

public class PlayingState implements State {

    @Override
    public void play(MediaPlayer player) {

        System.out.println("Music is already playing.");
    }

    @Override
    public void pause(MediaPlayer player) {

        System.out.println("Music paused.");

        player.setIcon("Play Icon");

        player.setState(new PausedState());
    }
}