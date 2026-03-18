package factory;

import electric.ElectricFrame;
import electric.ElectricWheel;
import products.Wheel;
import products.Frame;

public class ElectricBikeFactory extends AbstractBikeFactory {
	
	@Override
	public Frame createFrame() {
		return new ElectricFrame();
	}
	
	@Override
	public Wheel createWheel() {
		return new ElectricWheel();
	}

}
