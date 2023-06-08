package abstractClass;

// 추상 클래스 : 추상 메서드를 포함할 수 있는 클래스, 일반 메서드도 포함할 수 있다
// 추상 메서드 : 함수의 형식은 정해져 있으나, 구체적인 내용(실행코드)은 정해지지 않은 함수
// 오버라이딩을 강제 하기 위해서 추상 클래스 사용
class Normal { 
	public void test1() {
		System.out.println("test1");
	}
}

abstract class Abstract {
	public void test2() {
		System.out.println("test2");
	}
	
	// Abstract methods do not specify a body
	// 추상 메서드는 바디(함수 내용)를 지정할 수 없습니다
	// 반환형을 지정해 주어야 한다
	
	// The abstract method test3 in type Abstract can only be defined by an abstract class
	// 추상 메서드 test3는 오직 추상 클래스 내부에서만 정의될 수 있습니다
	public abstract void test3();
		
	
}

class Sub extends Abstract	{		// 추상 클래스를 상속 받는 클래스 Sub
	// The type Sub must implement the inherited abstract method Abstract.test3()
	// 자료형 Sub는 상속받은 추상 메서드 test3()를 반드시 구현(구체화)해야 합니다

	@Override
	public void test3() {
		System.out.println("test3");
	}	
	
}

public class Ex01 {
	public static void main(String[] args) {
		Normal ob1 = new Normal();
		ob1.test1();
		
		
		// Cannot instantiate the type Abstract
		// 추상 클래스는 객체화할 수 없습니다
//		Abstract ob2 = new Abstract(); 
			
		Sub ob3 = new Sub();		// 추상 클래스를 상속받아서 미구현 메서드를 구현한 객체
		ob3.test2();
		ob3.test3();
		
		Abstract ob4 = new Sub();		// 슈퍼클래스 ob4 = new 서브클래스();
										// 동물					강아지  -> 강아지는 동물이다(다형성)
		ob4.test3(); 					// Sub에서 실행
		
		// test3()의 내용만 구체화하여 결정한다면 객체를 생성할 수 있다
		// ob5는 Abstract의 내용을 상속받은 후 test3()의 내용을 구현한 이름없는 클래스
		// 미구현 메서드의 내용을 만들기 위해 클래스를 새로 작성하는 것이 번거로울 수 있다
		// 즉석에서 클래스 상속 + 미구현 메서드 내용 구현을 수행하면서 객체를 생성하는 문법
		// Anonymous Inner Type : 익명 내부 클래스
		Abstract ob5 = new Abstract() {
			@Override
			public void test3() {
				System.out.println("즉석에서 작성한 test3");
			}
		};
		ob5.test3();
	}
}
