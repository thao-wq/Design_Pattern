package composite;

public class Salesperson implements Payee {
	private String name;
	
	public Salesperson(String name) {
		this.name = name;
	}
	public void payExpenses(int amount) {
		System.out.println(" Salesperson " + name + 
				" được trả " + amount + " dollars. ");
	}
 
}
