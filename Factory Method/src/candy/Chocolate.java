package candy;

public class Chocolate extends SoftCandy {

    public Chocolate() {
        name = "Chocolate Candy";
    }

    @Override
    public void prepare() {
        System.out.println("Melting cocoa and adding sugar...");
    }
}