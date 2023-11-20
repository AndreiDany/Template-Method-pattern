
public abstract class PizzaMaker {
	
	protected abstract void addToppings();
	
	protected abstract void bake();
	
	public void makeAPizza()
	{
		System.out.println("Add tomato sauce");
		
		System.out.println("Add mozzarella");
		
		addToppings();
		
		bake();
		
		System.out.println("\n");
	}
}
