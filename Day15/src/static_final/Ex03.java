package static_final;

class Test2 {
	// final : 변경할 수 없다. 마지막 값이다
	// 지역변수에 사용 가능, 처음 설정한 값을 이후 변경할 수 없다
	// 멤버필드에 사용 가능, 처음 설정한 값을 이후 변경할 수 없다
	// 메서드에 사용 가능, 함수의 내용을 변경할 수 없다(오버라이딩 불가)
	// 클래스에 사용 가능, 클래스의 구성을 변경할 수 없다(상속 불가)
	
	final int n3 = 10;
	final int n4;
//	The blank final field n4 may not have been initialized(초기화 되지 않은 것 같다) -> 생성자를 통해서 초기화 해서 오류 없어짐
	private final int n5 = 30;				// final은 setter 생성 불가, getter는 생성 가능
	public static final String ACADEMY_NAME = "KGITBANK";
	final int n6 = Integer.MAX_VALUE;
	
	
	Test2(int n4) {			// final 멤버 필드는 생성자를 통한 초기화가 가능하다(한번 정하면 못 바꿈)
		this.n4 = n4;
	}

	public int getN5() {
		return n5;
	}

//	public static String getAcademyName() {
//		return ACADEMY_NAME;
//	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		int n1 = 10;
		final int n2 = 20;
		
		System.out.println(n1);
		System.out.println(n2);
		
		n1 += 1;
//		n2 += 1;
//		The final local variable n2 cannot be assigned. It must be blank and not using a compound assignment
		
		System.out.println("학원 이름 : " + Test2.ACADEMY_NAME);
//		System.out.println(Test2.getAcademyName());				// ACADEMY_NAME을 private로 설정할 경우 getter를 생성 후 접근 가능
	}
}
