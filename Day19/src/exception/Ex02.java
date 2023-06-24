package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 0, sum = 0;
		
		try {
			System.out.print("정수1 입력 : ");
			n1 = sc.nextInt();
			
			System.out.print("정수2 입력 : ");
			n2 = sc.nextInt();
			
			sum = n1 + n2;
			System.out.println("sum : " + sum);
			
		} catch(InputMismatchException e) {			// 특정 타입의 예외가 발생하면 처리코드를 작성하는 영역
			System.err.println("입력 형식이 잘못되었습니다");
			System.out.println(e.toString());
			return;			// try ~ catch문 밖에 있는 것을 실행할지 말지 정하기(return이 있으면 되돌아가니까 마지막 프로그램 종료를 실행하지 않는다)		
			
		} finally {			// 예외 발생 여부에 상관없이 반드시 수행하는 영역
			System.out.println("sc.close()");
			sc.close();
		}
		
		System.out.println("프로그램 종료");
		
		sc.close();
	}
}
