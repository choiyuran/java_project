package static_final;

// static은 클래스에 소속되는 필드 및 메서드
// 클래스가 객체보다 먼저 메모리에 로드된다
// 클래스가 로드되는 시점에서 static 요소는 생성이 되어있다
// 클래스만 로드된 시점에서 아직 객체는 생성되지 않았다
// 따라서 static요소는 non-static요소를 정상적으로 참조할 수 있는 보장이 없다
class Test1 {
	int n1 = 10;
	static int n2 = 20;
	
//	Cannot make a static reference to the non-static field n1
//	static이 먼저 생성된 후 나머지가 생성됨
//	static은 non-static(필드나 메서드)을 참조할 수 없지만 non-static은 static 참조 가능
//	하지만, static은 static끼리 non-static은 non-static끼리 연결해주는게 좋다
	
//	static void showN1() {			// 클래스가 생성되고 static만 생성되어 있는 상황에 non-static 필드 n1을 사용하면 에러
//		System.out.println(n1);		// 객체가 생성될때 non-static필드가 생성됨
//	}
	
	void showN1() {
		System.out.println(n1);
	}
	
	static void showN2() {
		System.out.println(n2);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// static : 객체마다 서로 다른 값이 아니라, 클래스에 '고정'된 값
//		예를 들어, 책은 무슨 모양? 사각형 이런식의 전체를 생각했을 때 공통된 것
//		카드의 무늬?, 번호는 서로 달라야 하니까 non-static/ 카드의 크기는 서로 다른 객체여도 같아야 하니까 static

//		System.out.println("Test1.n2 : " + Test1.n1);	// static이 아니라 참조 불가
		System.out.println("Test1.n2 : " + Test1.n2);	// 클래스로 접근
		
		Test1 ob = new Test1();
		System.out.println("ob.n1 : " + ob.n1);
		System.out.println("ob.n1 : " + ob.n2);		// static 함수는 클래스로 접근하는 것이 바람직하다
//		The static field Test1.n2 should be accessed in a static way
//		서로 다른 객체들이 공유하는 값이 된다(후천적으로 값이 바뀔수도 있다)
		
		
		
	}
}
