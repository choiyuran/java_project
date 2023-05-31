package oop;

// 클래스 : 객체를 생성하기 위해 만든다
class Human {
	// 멤버 필드 : 객체가 가지는 내부 변수
	// 사람의 이름(문자열)과 나이(정수), 키와 체중(실수)를 변수로 선언하세요
	String name;
	int age;
	double height, weight;
	
	// 멤버 메서드 : 객체가 호출할 수 있는 내부 함수
	// 1) (문자열, 정수, 실수, 실수)를 전달받아서 멤버필드에 저장하는 함수
	void save(String name, int age, double height, double weight) {
		this.name = name;			// 지역변수와 멤버필드의 이름이 같으면
		this.age = age;				// this를 이용하여 구분할 수 있다
		this.height = height;		// this는 클래스에 의해 생성된 객체 자신을 가리키는 변수
		this.weight = weight;
	}
	
	// 2) 멤버필드에 저장된 값을 한줄씩 출력하고 마지막에 한줄 띄우는 함수
	void show() {
		System.out.println("이름 : " + name);
		System.out.printf("나이 : %d살\n ", age);
		System.out.printf("키 : %.1fcm\n", height);
		System.out.printf("체중 : %.1fkg\n", weight);
		System.out.println();
	}
	
	// 3) 객체를 생성하면서 값을 할당하는 생성자를 생성한다
	// 생성자는 클래스의 이름과 같으며 반환형을 지정하지 않는 특수한 함수이다
	// 생성자를 작성하지 않으면, 컴파일시에 기본 생성자를 자동으로 만들어준다
	// 생성자를 작성했다면, 자동으로 생성자를 만들어주지 않는다
	// 객체를 생성하고 값을 넣는 두가지 과정을 한번에 처리하고 싶을 때 만든다
	Human(String name, int age, double height, double weight) {
		this.name = name;		
		this.age = age;			
		this.height = height;	
		this.weight = weight;
	}
	// 4) 직접 생성자를 작성했다면 기본 생성자가 자동 작성되지 않기 때문에
	// 별도로 작성해주어야 한다
	 Human() {}
}

public class Ex05 {
	public static void main(String[] args) {
		// 서로 다른 Human 객체 3개를 생성하고, 각각 다른 값을 넣어주세요
		// 배열로 묶어서 구성하세요
		// 반복문을 이용하여 여러명의 데이터를 출력하세요
		Human hm1 = new Human();			// 먼저 생성하고
		Human hm2 = new Human();
		Human hm3 = new Human();
		
		hm1.save("홍길동", 20, 178.8, 70.3);		// 생성된 객체에 값을 넣는다
		hm2.save("고길동", 25, 175.9, 68.8);		// 한번에 4개의 데이터를 넣는다
		hm3.save("박찬호", 30, 180.3, 75.2);
		
//		하나 하나 지정해서 데이터를 넣을수도 있지만 비효율적
//		hm1.name("홍길동");
//		hm1.age(20);
		
//		 객체 생성과 동시에 값을 지정한다(3번을 만들어놨기 때문에)
//		Human hm1  = new Human("홍길동", 20, 178.8, 70.3);			
		
		Human[] arr = { hm1, hm2, hm3 };
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].show();
		}
	}
}
