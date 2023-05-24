package loop;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		   은행에 돈을 입금한다
		   첫날에는 10원, 둘째날에는 20원, 셋째날에는 40원
		   이런 식으로 전날의 두배를 준비하여 30일 동안 입금한다
		   입금이 끝나면 은행에 예금된 총 금액은 얼마인지 계산하여 출력하세요
		   출력할때  printf()의 서식을 활용하여 천단위 구분 콤마를 찍어주세요
		 */
		// 10,737,418,230
		long money = 10;	  // 입금 금액
		int day = 1;	  // 날짜
		long savemoney = 0;		// 은행 계좌 금액
		
		while(day <= 30) {
			savemoney += money;			
			System.out.printf("%d일차 : %d\n", day, savemoney);
			money *= 2;
			day++;
		}
		System.out.printf("예금된 총 금액 : %,d원", savemoney);
		
	}
}
