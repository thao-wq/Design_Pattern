package factory;

public class Client {
 public static void main(String[] args) {
     Candy candy1 = CandyFactory.getCandy(CandyType.MILK);
     System.out.println(candy1.getName());

     Candy candy2 = CandyFactory.getCandy(CandyType.CHOCOLATE);
     System.out.println(candy2.getName());
 
     CandyStore store1 = new MilkCandyStore();
     Candy c1 = store1.orderCandy();

     CandyStore store2 = new ChocolateCandyStore();
     Candy c2 = store2.orderCandy();
 }
}