package adapter;

public class UKCarPriceAdapter implements PriceCaculator {
    private UKCarPriceCalculator ukCalculator;

    public UKCarPriceAdapter(Double basePrice) {
        this.ukCalculator = new UKCarPriceCalculator(basePrice);
    }

    @Override
    public double calculatePrice() {
        return ukCalculator.getPrice();
    }
}