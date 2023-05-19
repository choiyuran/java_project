package operator;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// Ex04의 Scanner 형식을 참조하여 다음 조건을 만족하는 코드를 작성하세요
		// 정수를 하나 입력 받아서, 홀수와 짝수를 문자열로 출력하는 코드를 작성합니다
		// 단, 0은 짝수로 취급합니다
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		//int num = sc.nextInt();
		int num  = Integer.parseInt(sc.nextLine());
		// sc.nextLine()은 띄어쓰기도 다 포함해서 저장(엔터를 기준으로 저장)
		// sc.next()는 띄어쓰기를 기준으로 잘라서 저장
		String result2;
		
		String result = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println("result : " + result);
		
		if(num % 2 == 0) {
			result2 = "짝수";
		}
		else {
			result2 = "홀수";
		}
		
		System.out.println("result2 : " + result2);
		
		sc.close();
	}
}
