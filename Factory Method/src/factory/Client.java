package factory;

public class Client {
 public static void main(String[] args) {
     Candy candy1 = CandyFactory.getCandy(CandyType.MILK);
     System.out.println(candy1.getName());

     Candy candy2 = CandyFactory.getCandy(CandyType.CHOCOLATE);
     System.out.println(candy2.getName());
 }
}