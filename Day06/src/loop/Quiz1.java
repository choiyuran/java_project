package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		// 정수를 하나 입력 받아서, 1부터 입력받은 정수까지 한 줄에 출력하는 코드를 작성하세요
		
		Scanner sc = new Scanner(System.in);
//		int cnt = 1;
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");	
 		}
		
		/*
		while(cnt <= num) {
			System.out.print(cnt + " ");
			cnt += 1;
		}
		System.out.println();
		System.out.println("프로그램 종료");		
		*/
		
		sc.close();
		System.out.println("\n프로그램 종료");		
		
		
	}
}
