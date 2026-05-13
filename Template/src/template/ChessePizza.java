package template;

class CheesePizza extends PizzaTemplate
{
 @Override
 protected void addToppings()
 {
     System.out.println("Adding mozzarella cheese and cheddar...");
 }
}
