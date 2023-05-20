package control;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		
	/*
	 	사탕 1개에 500원 입니다
	 	50개 이상 구매하면 전체의 8%를 할인하고
	 	100개 이상 구매하면 전체의 12%를 할인합니다
	 	
	 	구매 수량을 입력하여 결제할 금액을 계산하여 출력하세요
	 	(단, 각각의 할인율은 중복해서 적용할 수 없습니다)
	 */
//	System.out.printf("결제 금액 : %,d원\n", 12000);
		
		// 여러 조건이 있을 경우 우선순위를 생각하면서 코드를 작성해야 한다
		Scanner sc = new Scanner(System.in);
		int num, price;
		double salesPercent;
		
		System.out.print("구매할 사탕 : ");
		num = sc.nextInt();
		
		if (num >= 100) {
			salesPercent = 0.12;
		}
		else if (num >= 50) {
			salesPercent = 0.08;
		}
		else {
			salesPercent = 0;
		}
		price = num * 500;
		price -= price * salesPercent;
		
		System.out.printf("결제 금액 : %,d원", price);
		
		sc.close();
	}
}
