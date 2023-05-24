package array;

public class Ex08 {
	public static void main(String[] args) {
		
		int n1 = -5, n2 = 12, n3 = 4;
		int max;
		
		max = n1;
		if(max < n2) {
			max = n2;
		}
		if(max < n3) {
			max = n3;
		}
		System.out.println("max : " + max);
		System.out.println();
		
		int[] arr = { 17, 26, 33, 52, 46, 87, 69, 92, 73 };
		max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println();
	
		
 		// 1) arr의 값 중에서, 홀수이면서 가장 큰 값을 찾아서 출력하세요
		int oddMax = 0;
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] % 2 != 0 && oddMax < arr[i]) {
				oddMax = arr[i];				
			}
		}
		System.out.println("홀수 중 가장 큰 값 : " + oddMax);
		
		// 2) arr의 값 중에서, 짝수인 값의 합계를 구하여 출력하세요
		int num2 = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				num2 += arr[i];
			}
		}
		System.out.printf("짝수의 합 : %d\n", num2);
		
		/*
		 	int evenSum = 0;
		 	for(int num : arr) {
		 		if(num % 2 == 0) {
		 			evenSum += num;
		 		}
		 	}
		 	System.out.println("짝수의 합계 : " + evenSum);
		 */
		
		
		// 3) arr의 모든 값의 평균을 구하여 소수점 둘째자리까지 출력하세요
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		sum = sum / (double)arr.length;
		System.out.printf("전체 평균 : %.2f", sum);
		
		
		/*
		 	int sum = 0;
			for(int num : arr) {
				sum += num;
			}
			double avg = sum / (double)arr.length;
			System.out.printf("전체 평균 : %.2f", avg);
		 */
		
	}
}
