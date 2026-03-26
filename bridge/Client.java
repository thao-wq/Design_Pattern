package bridge;

public class Client {
    public static void main(String[] args) {

        Shape redCircle = new Circle(new RedColor());
        Shape blueSquare = new Square(new BlueColor());
        Shape greenRectangle = new Rectangle(new GreenColor());

        redCircle.draw();
        blueSquare.draw();
        greenRectangle.draw();
    }
}
