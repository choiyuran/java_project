package array;

import java.util.Arrays;
import java.util.Random;

public class Quiz3 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		int size = 10;
		int range = 100;
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(range);
		}
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		// 1) arr의 값에서 홀수와 짝수가 각각 몇개인지 파악하여 출력하세요
		int oddNum=0, evenNum=0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenNum++;
			}
			else {
				oddNum++;
			}
		}
		System.out.println("홀수의 개수 : " + oddNum);
		System.out.println("짝수의 개수 : " + evenNum);
		System.out.println();
		
		
		// 2) oddArray와 evenArray를 생성하여 각각 홀수와 짝수를 담아서 출력하세요
		int[] oddArr = new int[oddNum];
		int[] evenArr = new int[evenNum];
		int oddIndex = 0, evenIndex=0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenArr[evenIndex++] = arr[i];
				//evenArr[evenArr.length - evenNum] = arr[i]
				//evenNum--;
			}
			else {
				oddArr[oddIndex++] = arr[i];
				//oddArr[oddArr.length - oddNum] = arr[i]
				//oddNum--;
			}
		}
		System.out.println(Arrays.toString(evenArr));
		System.out.println(Arrays.toString(oddArr));
		
		// 3) arr의 총합을 구하여 출력하세요
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println("arr의 총합 : " + total);
	}
}
