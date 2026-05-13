package template;

class SeafoodPizza extends PizzaTemplate
{
 @Override
 protected void addToppings()
 {
     System.out.println("Adding shrimp, squid, and crab...");
 }
}
