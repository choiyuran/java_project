package computer;

public class DeskTop extends Computer{
	int inch;

	public DeskTop(String name, int price, int inch) {
		super(name, price);
		this.inch = inch;
		
	}

	@Override
	public String toString() {
		String format = "%s] %,d원, %d인치";
		Object[] args = { name, price, inch };
		String s = String.format(format, args);
		return s;
	}

}
