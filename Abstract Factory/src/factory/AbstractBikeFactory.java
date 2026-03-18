package factory;

import products.Frame;
import products.Wheel;

public abstract class AbstractBikeFactory {
	public abstract Frame createFrame();
	public abstract Wheel createWheel();

}
