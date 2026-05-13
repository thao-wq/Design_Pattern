package template;

public abstract class PizzaTemplate
{
 public final void makePizza()
 {
     prepareDough();
     addSauce();
     addToppings();
     cut();
     serve();
 }

 protected void prepareDough()
 {
     System.out.println("Preparing pizza dough...");
 }

 protected void addSauce()
 {
     System.out.println("Adding tomato sauce...");
 }

 protected abstract void addToppings();

 protected void cut()
 {
     System.out.println("Cutting pizza into slices...");
 }

 protected void serve()
 {
     System.out.println("Serving pizza...");
 }
}
