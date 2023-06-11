package drink;

abstract public class Drink {
	String name;
	int price;
	
	public Drink(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public abstract String toString();
}
