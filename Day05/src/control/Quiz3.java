package control;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 서로 다른 두 정수를 입력받아서 큰 수를 출력하세요
		// 만약 같으면 아무 수나 출력해도 됩니다
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, result;
		
		System.out.print("정수1 입력 : ");
		num1 = sc.nextInt();
//		sc.nextLine();
		
		System.out.print("정수2 입력 : ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			result = num1;
		}
		else {
			result = num2;
		}
		System.out.printf("두 정수 중 더 큰 수는 %d입니다", result);
		sc.close();
	}
}
