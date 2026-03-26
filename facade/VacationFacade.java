package facade;

public class VacationFacade {
    private static VacationFacade instance;

    private VehicleBooking vehicle;
    private HotelBooking hotel;
    private FlightBooking flight;

    private VacationFacade() {
        vehicle = new VehicleBooking();
        hotel = new HotelBooking();
        flight = new FlightBooking();
    }

    public static VacationFacade getInstance() {
        if (instance == null) {
            instance = new VacationFacade();
        }
        return instance;
    }

    public void option1() {
        System.out.println("Option 1: Budget Vacation");
        vehicle.bookMotorbike();
        hotel.standardRoom();
        flight.oneWay();
    }

    public void option2() {
        System.out.println("Option 2: Standard Vacation");
        vehicle.bookCar();
        hotel.standardRoom();
        flight.roundTrip();
    }

    public void option3() {
        System.out.println("Option 3: Luxury Vacation");
        vehicle.bookCar();
        hotel.luxuryRoom();
        flight.roundTrip();
    }
}
