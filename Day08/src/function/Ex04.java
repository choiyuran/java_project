package function;

public class Ex04 {
	static int getAbsolute(int num) {
		int answer = 0;
		answer = num;
		if(num < 0) {
			answer = -num;
		}
		return answer;
		
		// return num > 0 ? num : -num;
	}
	
	static int getMinValue(int n1, int n2, int n3) {
//		 int min = Integer.MAX_VALUE;		 정수 범위에서 최대값(이 경우 min과 숫자 세개 다 비교 - if문 세개)
		int answer = n1;
		if(answer > n2) {
			answer = n2;
		}
		if(answer > n3) {
			answer = n3;
		}
		return answer;
	}
	
	static int getMinValue(int[] arr) {
//		 int min = Integer.MAX_VALUE		 정수 범위에서 최대값
//		 for(int i = 0; i < arr.lenght; i++) {
//			if(min > arr[i]) {
//				min = arr[i];
//			}
//		}
		int index = 0;
		int min = arr[index];
		for(int i = 1; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	
	public static void main(String[] args) {
		// 1) 정수를 하나 전달받아서 절대값을 반환하는 함수
		int t1 = getAbsolute(5 - 7);
		
		// 2) 세 정수를 전달받아서 최소값을 반환하는 함수
		int t2 = getMinValue(7, 2, 5);
		
		// 3) 길이가 3인 배열을 전달받아서 최소값을 반환하는 함수
		int[] arr = { 7, 2, 5 };
		int t3 = getMinValue(arr);
		
		// 하나의 함수 이름으로, 여러개의 함수 정의를 별도로 만들 수 있다
		// 함수 오버로딩, 메서드 오버로딩
		// 구분 기준 : 함수이름 + 매개변수의 자료형, 개수, 순서
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		System.out.println("t3 : " + t3);
		
	}
}
