package adapter;

public class CarPriceCalculator implements PriceCaculator {
	private double carPrice;
	
	public CarPriceCalculator(double carPrice) {
		this.carPrice = carPrice;
	}
	@Override
	public double calculatePrice() {
		return carPrice * 1.1;
	}
}
