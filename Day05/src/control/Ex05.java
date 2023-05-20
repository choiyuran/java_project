package control;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("점수 입력 (0 ~ 100) : ");
		score = sc.nextInt();
		
		if(score < 0 || 100 < score) {
			System.err.println("점수가 범위를 벗어났습니다");
			sc.close();
			return;				// end of function(함수 즉시 종료)
		}
		System.out.println("점수 : " + score);
		sc.close();
	}
}
