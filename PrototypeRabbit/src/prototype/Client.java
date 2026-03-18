package prototype;

public class Client {
    public static void main(String[] args) {

        Rabbit rabbit1 = new Rabbit("Bunny", 2);

        Rabbit rabbit2 = rabbit1.clone();

        System.out.println("Original: " + rabbit1);
        System.out.println("Clone   : " + rabbit2);

        System.out.println("Same object? " + (rabbit1 == rabbit2));
    }
}