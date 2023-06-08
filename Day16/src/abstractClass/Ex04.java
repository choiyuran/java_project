package abstractClass;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;

// 인터페이스는 추상 클래스의 한 종류이다
// 인터페이스는 자료형으로 사용할 수 있다
// 인터페이스의 모든 필드는 public static final이다
// 인터페이스의 모든 메서드는 public abstract 이다(모두 추상 메서드, 일반 메서드는 절대 가질 수 없다)
// 인터페이스는 extends 대신 implements 키워드로 상속(구현)처리한다
// 인터페이스는 일반적인 상속과 달리, 다중 상속을 허용한다 -> 자바는 보통 상속할 때 하나만 가능하지만, 인터페이스는 여러 개 가능
// 가장 예외 덩어리인 녀석...

interface Test1 {
	// Illegal modifier for the interface field Test1.n1; 
	// only public, static & final are permitted
	// 오직 public static final만 허용한다
	public static final int n1 = 10;
	int n2 = 20;	// 아무것도 안붙여도 자동으로 앞에 public static final이 붙음
	
	// Illegal modifier for the interface method show;
	// only public, abstract, default, static and strictfp are permitted
	// default를 함수에 지정하면 인터페이스 내부에서도 코드를 작성할 수 있다
	public abstract void show();
		
}

class Test2 implements Test1, Serializable, Closeable {
	private static final long serialVersionUID = 1L;

	@Override
	public void show() {
		System.out.printf("%d, %d\n", n1, n2);
	}

	@Override
	public void close() throws IOException {
		System.out.println("close !!");
	}
	
}

public class Ex04 {
	public static void main(String[] args) throws Exception {
		Test2 ob = new Test2();
		ob.show();
		ob.close();
	}
}
