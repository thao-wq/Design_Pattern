package candy;

public abstract class CandyStore {

    public Candy orderCandy(String type) {

        Candy candy = createCandy(type);

        if (candy == null) {
            System.out.println("Candy type not available!");
            return null;
        }

        candy.prepare();
        candy.wrap();
        candy.pack();

        System.out.println("Order completed: " + candy.getName());
        System.out.println("-------------------------");

        return candy;
    }

    protected abstract Candy createCandy(String type);
}