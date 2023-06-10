package 최유란1A;

public class Customer extends Member {
	private String address;
	
	public Customer(String id, String password, String name, String address) {
		super(id, password, name);
		this.address = address;
	}

	@Override
	public String toString() {
		String format = "[구매자정보]\nID : %s\nPW : %s\n이름 : %s\n주소 : %s\n";
		Object[] args = { getId(), "********", getName(), address };
		String s = String.format(format, args);
		return s;
	}
	
}
