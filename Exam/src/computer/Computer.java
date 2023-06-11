package computer;

abstract public class Computer {
	String name;
	int price;
	
	public Computer(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public abstract String toString();
	
	
}
