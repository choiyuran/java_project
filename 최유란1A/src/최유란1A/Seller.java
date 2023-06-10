package 최유란1A;

public class Seller extends Member {
	private String storeName;

	public Seller(String id, String password, String name, String storeName) {
		super(id, password, name);
		this.storeName = storeName;
	}

	@Override
	public String toString() {
		String format = "[판매자정보]\nID : %s\nPW : %s\n이름 : %s\n가게이름 : %s\n";
		Object[] args = { getId(), "********", getName(), storeName };
		String s = String.format(format, args);
		return s;
	}

}
