package control;

import java.util.Scanner;

public class Quiz6 {
	public static void main(String[] args) {
		/*
		 	놀이기구 이용시간에 따른 요금을 계산하여 출력하세요
		 	
		 	기본 요금은 3천원이며 10분당 500원의 요금이 추가로 발생합니다
		 	기본 요금이 적용되는 구간은 0 ~ 30분 입니다
		 	
		 	시간				금액
		 	0 ~ 30			3,000원
		 	31 ~ 40			3,500원
		 	41 ~ 50			4,000원
		 	51 ~ 60			4,500원
		 	...
		 	
		 	이후 시간대에서도 동일한 규칙으로 적용되어야 합니다
		 */
		// 시간에 따른 요금을 구하는 코드
		// int cost = getCost(int time) {...}
		// 		y 	=	f	(x)
		
		Scanner sc = new Scanner(System.in);		
		int cost, time;
		
		System.out.print("이용 시간 : ");
		time = sc.nextInt();
		
		if (0 <= time && time <= 30) {		// 기본 시간 이하로 이용했다면
			cost = 3000;					// 기본 요금 3천원 적용
		}
		else {					// 기본 시간보다 크다면
								// 기본 요금 + 추가 요금
			if (time % 10 == 0) {				// 이용시간이 10분 단위로 나누어 떨어질 때
				cost = 3000 + (500 * (((time - 30) / 10) + 0));	
			}
			else {								// 이용시간이 10분 단위로 나누어 떨어지지 않을 때
				cost = 3000 + (500 * (((time - 30) / 10) + 1));	
			}
		}
		System.out.printf("요금 : %,d원\n", cost);
		sc.close();
	}
}
