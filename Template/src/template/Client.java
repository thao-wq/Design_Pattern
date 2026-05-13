package template;

public class Client
{
 public static void main(String[] args)
 {
     System.out.println("=== Seafood Pizza ===");
     PizzaTemplate seafood = new SeafoodPizza();
     seafood.makePizza();

     System.out.println();

     System.out.println("=== Cheese Pizza ===");
     PizzaTemplate cheese = new CheesePizza();
     cheese.makePizza();
 }
}
