package student;

public class ComputerStudent extends Student {
	private int kor, eng, math, java, python;
	
	public ComputerStudent(String name, int kor, int eng, int math, int java, int python) {
		super(name, kor, eng, math, java, python);
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.java = java;
		this.python = python;
	}
	
	@Override
	public String toString() {
		String format = "%s] %d, %d, %d, %d, %d, %d(%.2f)";
		Object[] args = { getName(), kor, eng, math, java, python, getSum(), getAvg() };
		return String.format(format, args);
	}

}
