package _spooler;

public class main {
	public static void main(String[] args) {
		PrintSpooler p1 = PrintSpooler.getInstance();
		PrintSpooler p2 = PrintSpooler.getInstance();
		
		p1.print("Documnent A");
		p2.print("Document B");
		
		System.out.println("Same object?" + (p1 == p2));
   }

}
