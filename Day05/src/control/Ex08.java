package control;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int select;
		
		System.out.print("입력 : ");
		select = sc.nextInt();
		
		if(select == 1)	 		System.out.println("One");			// 종속 문장이 하나이고, 간결하면  중괄호{}를 생략할 수 있다(권장하지 x)
		else if(select == 2) 	System.out.println("Two");
		else if(select == 3) 	System.out.println("Three");
		else				 	System.out.println("Others");
		
		switch(select) {		//switch 조건에 실수는 쓸 수 없다(double,float는 사용x) -> switch문은 정확한 값을 필요로 하기 때문에
			case 1: 		System.out.println("하나");	break;
			case 2: 		System.out.println("둘");	break;
			case 3: 		System.out.println("셋");	break;
			default: 		System.out.println("다른거");	
		}
		sc.close();
	}
}
