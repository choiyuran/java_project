package reference;

class Ball {}		// 아무 내용도 없는 클래스

class Kid {
	// 필드
	private Ball ball;			// 초기값 null
	private String name;
	
	// 생성자
	public Kid(String name) {
		this.name = name;
	}
	
	// 메서드
	public void setBall(Ball ball) {
		this.ball = ball;
	}
	
	public Ball getBall() {
		return ball;
	}
	
	public String getName() {
		return name;
	}
	
	public void throwBall(Kid other) {				// A 객체의 메서드 내부에서
		other.setBall(this.ball);					// B 객체의 메서드를 호출할 수 있다
		this.ball = null;		// this생략 가능
		System.out.printf("%s가 %s에게 공을 던졌다\n", this.name, other.name);
	}
	
	public boolean hasBall() {
		return ball != null; 
	}
}


public class Ex05 {
	public static void main(String[] args) {
		Kid ob1 = new Kid("도기");
		Kid ob2 = new Kid("지훈");
		Ball ball = new Ball();
		
		ob1.setBall(ball);
		System.out.println(ob1.getName() + "가 공을 가지고 있는가 : " + ob1.hasBall());
		System.out.println(ob2.getName() + "가 공을 가지고 있는가 : " + ob2.hasBall());
		System.out.println();
		
		ob1.throwBall(ob2);
		System.out.println(ob1.getName() + "가 공을 가지고 있는가 : " + ob1.hasBall());
		System.out.println(ob2.getName() + "가 공을 가지고 있는가 : " + ob2.hasBall());
		System.out.println();
		
		ob2.throwBall(ob1);
		System.out.println(ob1.getName() + "가 공을 가지고 있는가 : " + ob1.hasBall());
		System.out.println(ob2.getName() + "가 공을 가지고 있는가 : " + ob2.hasBall());
		System.out.println();
		
	}
}
