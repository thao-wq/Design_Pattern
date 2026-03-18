package client;

import factory.AbstractBikeFactory;
import factory.BikeFactory;
import products.Frame;
import products.Wheel;
import util.BikeType;

public class client {
	public static void main(String[] args) {
		AbstractBikeFactory factory = BikeFactory.getBikeFactory(BikeType.MOUNTAIN);
		
	Frame frame = factory.createFrame();
	Wheel wheel = factory.createWheel();
	
	frame.create();
	wheel.create();
	
	System.out.println("..");
	
	factory = BikeFactory.getBikeFactory(BikeType.ELECTRIC);
	frame = factory.createFrame();
	wheel = factory.createWheel();
	
	frame.create();
	wheel.create();
}

}
