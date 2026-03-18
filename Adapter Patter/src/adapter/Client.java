package adapter;

public class Client {
    public static void main(String[] args) {

        PriceCaculator car = new CarPriceCalculator(20000.0);
        System.out.println("Car price (USD): " + car.calculatePrice());

        PriceCaculator truck = new TruckPriceCalculator(30000.0);
        System.out.println("Truck price (USD): " + truck.calculatePrice());

        PriceCaculator ukCar = new UKCarPriceAdapter(15000.0);
        System.out.println("UK Car price (USD): " + ukCar.calculatePrice());
    }
}