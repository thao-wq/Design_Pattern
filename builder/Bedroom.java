package builder;

public class Bedroom {
    private String roomID;
    private String bedType;
    private boolean hasBathroom;
    private boolean hasBalcony;
    private String color;
    private double sizeRoom;
    private boolean hasAirConditioner;
    private boolean hasTV;

    public Bedroom(BedroomBuilder builder) {
        this.roomID = builder.roomID;
        this.bedType = builder.bedType;
        this.hasBathroom = builder.hasBathroom;
        this.hasBalcony = builder.hasBalcony;
        this.color = builder.color;
        this.sizeRoom = builder.sizeRoom;
        this.hasAirConditioner = builder.hasAirConditioner;
        this.hasTV = builder.hasTV;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "roomID='" + roomID + '\'' +
                ", bedType='" + bedType + '\'' +
                ", hasBathroom=" + hasBathroom +
                ", hasBalcony=" + hasBalcony +
                ", color='" + color + '\'' +
                ", sizeRoom=" + sizeRoom +
                ", hasAirConditioner=" + hasAirConditioner +
                ", hasTV=" + hasTV +
                '}';
    }
}