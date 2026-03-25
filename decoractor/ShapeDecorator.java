package decoractor;

public abstract class ShapeDecorator implements Component {
	protected Component component;
	
	public ShapeDecorator(Component component) {
		this.component = component;
	}
	@Override
	public void draw() {
		component.draw();
	}

}
