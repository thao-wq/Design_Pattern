package factory;

import mountain.MountainFrame;
import mountain.MountainWheel;
import products.Wheel;
import products.Frame;

public class MountainBikeFactory extends AbstractBikeFactory {
	@Override
	
	public Frame createFrame() {
		return new MountainFrame();
	}
	@Override
	
	public Wheel createWheel() {
		return new MountainWheel();
	}

}
