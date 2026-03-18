package factory;

import road.RoadFrame;
import road.RoadWheel;
import products.Frame;
import products.Wheel;

public class RoadBikeFactory extends AbstractBikeFactory {
	@Override
	public Frame createFrame() {
		return new RoadFrame();
	}
	
	@Override
	public Wheel createWheel() {
		return new RoadWheel();
	}


}
