package computer;

public class LapTop extends Computer {
	String using;
	
	public LapTop(String name, int price, String using) {
		super(name, price);
		this.using = using;
	}

	@Override
	public String toString() {
		String format = "%s] %,d원, %s";
		Object[] args = { name, price, using };
		String s = String.format(format, args);
		return s;
	}

}
