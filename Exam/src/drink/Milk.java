package drink;

public class Milk extends Drink {
	String company;
	
	public Milk(String name, int price, String company) {
		super(name, price);
		this.company = company;
	}

	@Override
	public String toString() {
		String format = "%s] %,d원, %s";
		Object[] args = { name, price, company };
		String result = String.format(format, args);
		return result;
	}

}
