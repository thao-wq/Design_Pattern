package bridge;

public abstract class Shape {
	 protected ColorImplementation color;

	    public Shape(ColorImplementation color) {
	        this.color = color;
	    }

	    public abstract void draw();

}
