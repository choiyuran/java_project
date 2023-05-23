package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz4 {
	// 랜덤을 활용한 업다운 게임을 작성하세요
	public static void main(String[] args) {

		Random ran = new Random();
		int num = ran.nextInt(100) + 1;
		int answer;
		int cnt = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~100 사이의 숫자를 맞춰보세요 : ");
		answer = sc.nextInt();
		
		while(answer != num) {
			if (answer < num) {
				System.out.print("업. 다시 입력하세요 : ");
				answer = sc.nextInt();
			}
			else {
				System.out.print("다운. 다시 입력하세요 : ");
				answer = sc.nextInt();
			}
			cnt++;
		}
		System.out.println(cnt + "번 만에 정답입니다.");
		sc.close();
	
//		while(true) {
//			System.out.println("정수 입력 (1 ~ 100) : ");
//			answer = sc.nextInt();
//			cnt++;
//			if(answer > num) {
//				System.out.println("Down");
//			}
//			else if(answer < num) {
//				System.out.println("Up");
//			}
//			else {
//				break;
//			}
//		}
//		System.out.printf("정답입니다. %d회 만에 정답을 맞췄습니다\n", cnt);
	}
	
}
