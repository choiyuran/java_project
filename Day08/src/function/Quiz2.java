package function;

public class Quiz2 {
		static String quiz1(int station) {
			int time = 0, min = 0, hour = 0;			
			time = station * 4;
			String s = time + "분";
			
			if(time > 60) {
				hour = time / 60;
				min = time % 60;
				s = String.format("%d시간  %d분", hour, min);
			}
			return s;		
		}
		
		static String quiz2(int time) {
			int price = 0;
			if (time > 30) {
				if(time % 10 == 0) {
					price = 3000 + 500 * ((time-30) / 10);					
				}
				else {
					price = 3000 + 500 * ((time-30) / 10 + 1);									
				}
			}
			else {
				price = 3000;
			}
			String s =String.format("이용 요금은 : %,d원", price);
			return s;
		}
	
		static int quiz3(int n1, int n2) {
			int sum = 0; 
			// 먼저, 두 수의 대소관계에 따라 새로운 변수에 대입하거나 값을 바꾼다
			if(n1 > n2) {
				int tmp = n1;
				n1 = n2;
				n2 = tmp;
			}
			for(int i = n1; i <= n2; i++) {
				sum += i;
			}
			return sum;
		}
		
		
		// String s = String.format("%2d : %2d\n", hour, minute);
	
		// 1) 정거장 구간 수에 따른 걸린 시간을 문자열로 반환하기
		// (구간당 4분으로 계산하며, 60분을 초과하면 시간과 분으로 구분하여 반환하기)
		
		// 2) 놀이기구 이용 시간에 따른 요금을 문자열로 반환하기
		// 기본 30분까지는 3천원, 이후 10분당 500원의 추가 요금 발생
		// (천단위 구분 기호를 찍어서 처리해야 함)
		
		// 3) 두 정수를 전달 받아서, 두 정수 사이의 모든 수의 합을 구하여 반환하기
		// (두 정수의 대소관계는 정해져 있지 않음)
	public static void main(String[] args) {
		String s1 = quiz1(12);		// 48분
		String s2 = quiz1(16);		// 1시간 4분
		
		String s3 = quiz2(25);		// 3000원
		String s4 = quiz2(40);		// 3500원
		String s5 = quiz2(41);		// 4000원
		
		int n1 = quiz3(1, 10);		// 55
		int n2 = quiz3(10, 1);		// 55
		
		System.out.println("총 소요 시간은 : " + s1 + "입니다");
		System.out.println("총 소요 시간은 : " + s2 + "입니다\n");
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println();
		
		System.out.println("총 합은 : " + n1);
		System.out.println("총 합은 : " + n2);

	}
	
	// 풀이
	/*
	static String quiz1(int station) {
		String answer = null;
		int time = station * 4;
		if(time > 60) {
			answer = String.format("%d시간 %d분", time/60, time%60);
		}
		else {
			answer = time + "분";
		}
		return answer;
	}	 
	 */

	
	/*
	static String quiz2(int time) {
		String answer = "";
		int fee = 3000;		 // 기본 요금 3000원
		if(time > 30) {		 // 30분을 초과하면
			fee += ((time - 21) / 10) * 500;		// 기본요금에 추가요금을 더함	
		}
		answer = String.format("%,d원", fee);		// 요금에 콤마 찍어주기
		return answer;			// 반환
	}	
	 */
	

	/* 등차수열 이용해서 합 구하기
	static int quiz3(int n1, int n2) {
		int sum = 0; 
		// 먼저, 두 수의 대소관계에 따라 새로운 변수에 대입하거나 값을 바꾼다
		if(n1 > n2) {
			int tmp = n1;
			n1 = n2;
			n2 = tmp;
		}
			sum = (n1 + n2) * (n2 - n1 + 1) / 2;
		
		return sum;
	}
	 */

	
}
