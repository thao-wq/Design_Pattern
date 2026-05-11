package observer;

public class Main {

    public static void main(String[] args) {

        Connection alice = new Connection();

        SocialMediaFeed bobFeed = new SocialMediaFeed();
        SocialMediaFeed charlieFeed = new SocialMediaFeed();

        System.out.println("Before observing:");
        alice.setStatus("Hello World!");

        alice.add(bobFeed);
        alice.add(charlieFeed);

        System.out.println("\nAfter observers added:");

        alice.setStatus("Having coffee!");
        alice.setStatus("Watching a movie!");
        alice.setStatus("Going to the beach!");

        System.out.println("\nHaHa Feed:");
        bobFeed.showFeed();

        System.out.println("\nHiHi Feed:");
        charlieFeed.showFeed();
    }
}