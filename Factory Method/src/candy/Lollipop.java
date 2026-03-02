package candy;

public class Lollipop extends HardCandy {

    public Lollipop() {
        name = "Lollipop";
    }

    @Override
    public void prepare() {
        System.out.println("Hardening sugar syrup...");
    }
}