package factory;

import util.BikeType;

public class BikeFactory {
	public static AbstractBikeFactory getBikeFactory(BikeType type) {
		switch (type) {
		case MOUNTAIN:
			return new MountainBikeFactory();
			
		case ROAD:
			return new RoadBikeFactory();
		case ELECTRIC:
			return new ElectricBikeFactory();
		default:
			return null;
		}
	}

}
