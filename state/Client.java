package state;

public class Client {

    public static void main(String[] args) {

        MediaPlayer player = new MediaPlayer();

        System.out.println("Initial icon: " + player.getIcon());

        System.out.println("\n----- PLAY -----");

        player.play();

        System.out.println("Current icon: " + player.getIcon());

        System.out.println("\n----- PAUSE -----");

        player.pause();

        System.out.println("Current icon: " + player.getIcon());

        System.out.println("\n----- PLAY AGAIN -----");

        player.play();

        System.out.println("Current icon: " + player.getIcon());
    }
}