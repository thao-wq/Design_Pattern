package decoractor;

public class RedBorder extends ShapeDecorator {
	public RedBorder(Component component) {
		super(component);
	}
	@Override
	public void draw() {
		super.draw();
		color();
	}
	public void color() {
		System.out.println("Adding Red Border");
	}

}
