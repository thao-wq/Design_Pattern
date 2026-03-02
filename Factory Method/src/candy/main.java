package candy;

public class main {

    public static void main(String[] args) {

        CandyStore store = new MyCandyStore();

        store.orderCandy("chocolate");
        store.orderCandy("caramel");
        store.orderCandy("lollipop");
        store.orderCandy("unknown");
    }
}