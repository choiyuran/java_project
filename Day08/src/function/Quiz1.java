package function;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int[] arr = new int[3];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(15) + 1;
		}
		System.out.println(Arrays.toString(arr));
		// 3대의 엘리베이터가 있다
		// 사용자에게 현재 층수를 입력받아서 가장 가까운 엘리베이터가 움직이도록 출력하세요
		// 처음부터 순서대로, 엘리베이터 이름을 A, B, C라고 하면
		// "%s 엘리베이터가 이동합니다" 라고 출력해야 합니다
		// Ex04에서 작성했던 함수를 참조하여, 활용하면 좋습니다
		
//		int cur, A = 0, B = 0, C = 0;
//		int disA = 0, disB = 0, disC = 0;
//		System.out.print("현재 층수 입력 : ");
//		cur = sc.nextInt();
//		
//		for(int i = 0; i < arr.length; i++) {
//			if (i == 0) 		A = arr[i];
//			else if (i == 1) 	B = arr[i];
//			else 				C = arr[i];
//		}
//		// 거리 구하기
//		disA = A - cur;
//		disB = B - cur;
//		disC = C - cur;
//		
//		// 구한 거리 절대값으로 바꾸기
//		if (disA < 0) 		disA = -disA;
//		if (disB < 0) 		disB = -disB;
//		if (disC < 0)		disC = -disC;
//		
//		// 최소값 구하기
//		int min = disA;
//		String result;
//		for(int i = 0; i < arr.length; i++) {
//			if(min > disB) 		min = disB;
//			if(min > disC)		min = disC;
//		}
//		
//		
//		if (min == disA)		result = "A";
//		else if (min == disB) 	result = "B";
//		else 					result = "C";
//		
//		System.out.printf("%s 엘리베이터가 이동합니다", result);
		
		// 풀이
		int currentFloor;
		System.out.print("현재 층 입력 : ");
		currentFloor = sc.nextInt();
		
		int min = 14;			// 최소값을 구하기 위해서는 이론상의 최대값을 넣어두고 시작한다(현재 층과 엘리베이터 층수의 차이 최대값)
		int index = 0;
		
		for(int i = 0; i < arr.length; i++ ) {
			// i번째 엘리베이터의 층수와, 요청받은 층수의 차이를 출력
			int diff = getAbsolute(arr[i] - currentFloor);
			if (min > diff) {
				min = diff;
				index = i;
			}
			
			System.out.print(diff + " ");
		}
		System.out.println();
		System.out.println((char)(index + 'A') + "엘리베이터가 이동합니다");
		
		char test = getNearElebatorName(arr, currentFloor);
		System.out.println("test : " + test);
		sc.close();
	}
	
	static char getNearElebatorName(int[] arr, int currentFloor) {
		char ele = 'A';
		int index = 0;
		int min = 14;
		
		// 1) 현재층과 각 엘리베이터의 차이 구하기
		for(int i = 0; i < arr.length; i++) {
			int diff = arr[i] - currentFloor;

			// 2) 차이에 절대값 처리하기(거리)
			if(diff < 0) {
				diff = -diff;
			}
			// 3) 거리 중 최소값을 찾아서 index 구하기
			if(min > diff) {
				min = diff;
				index = i;
			}
		}
		
		// 4) index를 ele에 더하고 반환하기
		ele += index;
		return ele;
	}
	
	static int getAbsolute(int num) {
		int answer = 0;
		answer = num;
		if(num < 0) {
			answer = -num;
		}
		return answer;
		
		// return num > 0 ? num : -num;
	}
}
