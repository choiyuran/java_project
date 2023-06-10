package 최유란1A;

public abstract class Member {
	private String id;
	private String password;
	private String name;
	
	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public Member(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	public abstract String toString();
	
	
}
