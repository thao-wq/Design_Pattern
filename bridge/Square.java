package bridge;

public class Square extends Shape {

    public Square(ColorImplementation color) {
        super(color);
    }

    public void draw() {
        System.out.print("Drawing Square - ");
        color.applyColor();
    }
}
