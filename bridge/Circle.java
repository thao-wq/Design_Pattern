package bridge;

public class Circle extends Shape {

    public Circle(ColorImplementation color) {
        super(color);
    }

    public void draw() {
        System.out.print("Drawing Circle - ");
        color.applyColor();
    }
}
