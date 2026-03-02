package candy;

public class Caramel extends SoftCandy {

    public Caramel() {
        name = "Caramel Candy";
    }

    @Override
    public void prepare() {
        System.out.println("Heating sugar to make caramel...");
    }
}