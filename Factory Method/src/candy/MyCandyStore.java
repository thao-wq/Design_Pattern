package candy;

public class MyCandyStore extends CandyStore {

    @Override
    protected Candy createCandy(String type) {

        if (type.equalsIgnoreCase("chocolate"))
            return new Chocolate();

        if (type.equalsIgnoreCase("caramel"))
            return new Caramel();

        if (type.equalsIgnoreCase("lollipop"))
            return new Lollipop();

        return null;
    }
}