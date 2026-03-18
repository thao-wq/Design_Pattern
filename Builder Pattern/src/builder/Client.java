package builder;

public class Client {
    public static void main(String[] args) {

        Bedroom room = new BedroomBuilder("R01", "King Bed")
                .withHasBathroom(true)
                .withHasBalcony(true)
                .withColor("White")
                .withSizeRoom(35.5)
                .withHasAirConditioner(true)
                .withHasTV(true)
                .build();

        System.out.println(room);
    }
}