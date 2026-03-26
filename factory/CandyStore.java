package factory;

public abstract class CandyStore {
	public Candy orderCandy() {
		Candy candy = createCandy();
		System.out.println("Creating:"+candy.getName());
		return candy;
	}
	protected abstract Candy createCandy();

}
