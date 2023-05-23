package loop;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		
		// 탐색
		// 알고리즘
		// 순차탐색(sequencial search) : 처음부터 순서대로 하나씩 값을 비교해나가는 방식
		// 간단하게 구현이 가능하나 원하는 값을 얻기까지 시간이 걸릴 수 있다
		
		// 이진탐색(binary search) : 중간값을 찾아나가면서, 값의 범위를 좁혀나가는 방식
		
		// 순차탐색
		Random ran = new Random();
		int cnt = 0;
		int min = 1;
		int max = 1000;
		int answer = ran.nextInt(max) + 1;
		
		int seq = min;
		
		while(true) {
			cnt++;
			if(seq == answer) {
				break;
			}
			seq++;		
		}
		System.out.printf("seq : %d, cnt : %d\n", seq, cnt);
		
		// 이진탐색
		int bin;
		cnt = 0;
		
		while(true) {
			bin = (min + max) / 2;			// 찾는 값은(최소값 + 최대값) / 2
			cnt++;
			
			System.out.printf("bin : %d, cnt : %d\t", bin, cnt);
			
			if(bin > answer) {
				System.out.println("Down");
				max = bin;
			}
			else if(bin < answer) {
				System.out.println("Up");
				min = bin;
			}
			else { 
				break;
			}
		}
		System.out.printf("bin : %d, cnt : %d\n", bin, cnt);
	}
}
