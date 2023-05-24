package loop;

public class Ex03 {
	public static void main(String[] args) {
		// 1) 1부터 100 사이의 홀수의 합과 짝수의 합을 for문으로 계산하여 출력하세요
		int sum1=0, sum2=0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum2 += i;
			}
			else {
				sum1 += i;
			}
		}
		System.out.printf("홀수의 합 : %d\n", sum1);
		System.out.printf("짝수의 합 : %d\n", sum2);
		
		
		// 2) A부터 Z까지 띄어쓰기로 구분하여 한 줄에 출력하세요
		// char는 글자를 표현하기 위한 정수 자료형이다
		
		for(char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 3) 빈 문자열에 * 기호를 5번 추가하여 출력하세요
		String s1 = "";
		for(int i = 0; i < 5; i++) {
			s1 += "*";
		}
		System.out.println("s1 : " + s1);
		
	}
	
}
