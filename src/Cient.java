
public class Cient {

	public static void main(String[] args) {
	
		PizzaMaker pizzaMakerForPepperoniPizza = new PepperoniPizza();
		
		pizzaMakerForPepperoniPizza.makeAPizza();
		
		PizzaMaker pizzaMakerForHawaiianPizza = new HawaiianPizza();
		
		pizzaMakerForHawaiianPizza.makeAPizza();

	}

}
