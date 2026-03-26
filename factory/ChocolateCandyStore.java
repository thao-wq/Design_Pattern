package factory;

public class ChocolateCandyStore extends CandyStore {
	@Override 
	protected Candy createCandy() {
		return new ChocolateCandy();
	}

}
