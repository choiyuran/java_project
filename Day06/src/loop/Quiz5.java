package loop;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		String n2 = "";
		String tmp = "";
		
		System.out.print("입력 : ");
		n1 = sc.nextInt();
		int cnt = 0;		// 반복의 횟수를 체크하기 위한 변수
		
		while(n1 != 0) {
			if(cnt != 0 && cnt % 3 == 0) {
				tmp += ",";
			}
			cnt++;
			
			tmp += n1 % 10;			// 오른쪽 끝에서 숫자를 하나 가져와서, tmp에 더한다
			n1 /= 10;				// 사용한 맨 끝자리는 제거한다
			
		}
		System.out.println("tmp : " + tmp);
		
		int i = tmp.length() - 1;		// 인덱스는 0부터 시작하기 때문에 길이 -1이 마지막 값이다
		while(i != -1) {	// 8, 7, 6, 5, 4, 3, 2, 1, 0
//			System.out.print(tmp.charAt(i));
			n2 += tmp.charAt(i);
			i--;
		}
		System.out.println("n2 : " + n2);
		
//		for(int i = 0; i < tmp.length(); i++) {
//			if(i != 0 && (tmp.length()-i) % 3== 0) {
//				System.out.print(",");
//			}
//			System.out.print(tmp.charAt(i));
//		}
		
	
		
		sc.close();
	}
}
