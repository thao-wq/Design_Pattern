package adapter;

public class TruckPriceCalculator implements PriceCaculator {
	private double carPrice;
	
	public TruckPriceCalculator(double carPrice) {
		this.carPrice = carPrice;
	}
	@Override
	public double calculatePrice() {
		return carPrice * 1.2;
	}
}
