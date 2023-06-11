package student;

public class Mathematics extends Student {
	private int kor;
	private int eng;
	private int math;
	private int chemistry;
	
	public Mathematics(String name, int kor, int eng, int math, int chemistry) {
		super(name, kor, eng, math, chemistry);
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.chemistry = chemistry;	
	}

	@Override
	public String toString() {
		String format = "%s] %d, %d, %d, %d, %d(%.2f)";
		Object[] args = { getName(), kor, eng, math, chemistry, getSum(), getAvg() };
		return String.format(format, args);
		
	}

}
