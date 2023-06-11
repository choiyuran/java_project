package student;

abstract public class Student {
	private String name;
	private int sum;
	private double avg;
	

	public String getName() {
		return name;
	}

	public int getSum() {
		return sum;
	}

	public double getAvg() {
		return avg;
	}


	public Student(String name, int...scores) {
		this.name = name;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		avg = (double)sum / scores.length;
	}
	
	public abstract String toString();
	
}
