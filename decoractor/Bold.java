package decoractor;

public class Bold extends ShapeDecorator{
	public Bold(Component component) {
        super(component);
    }

    @Override
    public void draw() {
        super.draw();
        bold();
    }

    public void bold() {
        System.out.println("-> Making Bold");
    }

}
