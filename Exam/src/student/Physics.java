package student;

public class Physics extends Student{
	private int kor, eng, math;
	private int physi;
	
	public Physics(String name, int kor, int eng, int math, int physi) {
		super(name, kor, eng, math, physi);
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.physi = physi;
	}

	@Override
	public String toString() {
		String format = "%s] %d, %d, %d, %d, %d(%.2f)";
		Object[] args = { getName(), kor, eng, math, physi, getSum(), getAvg() };
		return String.format(format, args);
	}

}
