package bridge;

public class Rectangle extends Shape {

    public Rectangle(ColorImplementation color) {
        super(color);
    }

    public void draw() {
        System.out.print("Drawing Rectangle - ");
        color.applyColor();
    }
}
