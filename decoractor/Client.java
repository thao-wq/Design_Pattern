package decoractor;

public class Client {

    public static void main(String[] args) {

        Component circle = new Circle();

        System.out.println("Normal:");
        circle.draw();

        Component redCircle = new RedBorder(circle);

        System.out.println("\nRed Border:");
        redCircle.draw();

        Component fancyCircle = new Bold(new RedBorder(new Circle()));

        System.out.println("\nRed + Bold:");
        fancyCircle.draw();
    }
}