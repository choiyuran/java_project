package loop;

public class Quiz2 {
	public static void main(String[] args) {
		// 1부터 100사이의 정수를 반복하여
		// 홀수의 합과 짝수의 합을 각각 구하여 출력하세요
		int i = 1;
		int oddsum = 0, evensum = 0;
		
		while(i <= 100) {
			if (i % 2 == 0) {
				evensum += i;
			}
			else {
				oddsum += i;
			}
			i++;
		}
		System.out.println("짝수의 합 : " + evensum);
		System.out.println("홀수의 합 : " + oddsum);
		
	}
}
