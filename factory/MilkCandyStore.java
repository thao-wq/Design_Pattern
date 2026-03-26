package factory;

public class MilkCandyStore extends CandyStore {
	@Override 
	protected Candy createCandy() {
		return new MilkCandy();
	}

}
