package control;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 서로 다른 세 정수를 입력받아서 큰 수를 출력하세요
		// 만약 같으면 아무 수나 출력해도 됩니다
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, max;
//		System.out.println("세 정수를 띄어쓰기로 구분하여 입력 : ");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		num3 = sc.nextInt();
		
		System.out.print("정수1 입력 : ");
		num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		num2 = sc.nextInt();
		System.out.print("정수3 입력 : ");
		num3 = sc.nextInt();
		
		max = num1;				// n1이 가장 크다고 가정한다
		
		if(max < num2) {		// 만약, n2가 더 크면
			max = num2;			// n2의 값을 최대값으로 지정한다
		}
		if(max < num3) {		// 만약, n3가 더 크면(이전 if의 실행여부와 상관없이 무조건 체크한다)
			max = num3;			// n3의 값을 최대값으로 지정한다
		}
	
		System.out.printf("가장 큰 수는 %d입니다", max);
		sc.close();
	}
}
