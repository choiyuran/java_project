package control;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 	지하철 1구간 당 평균 이동시간이 [4분]이라고 가정한다
		 	[이동한 구간 수]를 입력받아서, [걸린 시간]을 출력하세요
		 	단, [시간이 60분 이상]이면 [시간과 분을 구분]하여 출력하고
		 	[시간이 60분 미만]이면 [분만] 출력하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		int station, hour, min;
		int time = 4;
//		String result;
		
		System.out.print("구간 수 입력 : ");
		station = sc.nextInt();
		time = station * time;
		
		if (time >= 60) {
			hour = time / 60;
			min = time % 60;
			System.out.printf("총 소요 시간 : %d시간 %d분", hour, min);
		}
		else {
			System.out.printf("총 소요 시간 : %d분", time);
		}
		
		/*
		if (time >= 60) {
			hour = time / 60;
			min = time % 60;
			result = "총 소요 시간은 " + hour + "시간 " + min + "분 입니다";
		}
		else {
			result = "총 소요 시간은 " + time + "분 입니다";
			
		}
		System.out.println(result);
		 */
		sc.close();
	}
}
