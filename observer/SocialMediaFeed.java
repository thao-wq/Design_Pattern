package observer;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaFeed implements Observer {

    private List<String> statuses;

    public SocialMediaFeed() {
        statuses = new ArrayList<>();
    }

    @Override
    public void update(String status) {

        statuses.add(status);

        System.out.println("New status received: " + status);
    }

    public void showFeed() {

        System.out.println("\n=== SOCIAL MEDIA FEED ===");

        if (statuses.isEmpty()) {
            System.out.println("No statuses yet.");
        } else {

            for (String s : statuses) {
                System.out.println("- " + s);
            }
        }
    }
}