package drink;

public class Coffee extends Drink {
	String iceHot;
	
	public Coffee(String name, int price, String iceHot) {
		super(name, price);
		this.iceHot = iceHot;
	}

	@Override
	public String toString() {
		String format = "%s] %,d원, %s";
		Object[] args = { name, price, iceHot };
		String result = String.format(format, args);
		return result;
	}

}
