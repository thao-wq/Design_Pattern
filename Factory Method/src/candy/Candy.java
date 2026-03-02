package candy;

public abstract class Candy {

    protected String name;

    public String getName() {
        return name;
    }

    public abstract void prepare();

    public void wrap() {
        System.out.println("Wrapping " + name);
    }

    public void pack() {
        System.out.println("Packing " + name);
    }
}