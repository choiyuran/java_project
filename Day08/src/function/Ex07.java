package function;

public class Ex07 {
	// 가변인자 활용 예시
	// 내부적으로 배열을 사용함
	static int getTotal(int... args) {		// 전달인자의 개수가 일정하지 않을 때 사용
		int total = 0;
		System.out.println("args.length : " + args.length); 		// length를 사용할 수 있다는거 자체가 배열
		for(int num : args) {
			total += num;
		}
		return total;
	}
	public static void main(String[] args) {
		
		
//		System.out.printf()는 가변인자를 사용한다
		System.out.println(getTotal(1, 2, 3));
		System.out.println(getTotal(10, 20, 30, 40, 50));
		System.out.println(getTotal(3, 5));
		
	}
}
