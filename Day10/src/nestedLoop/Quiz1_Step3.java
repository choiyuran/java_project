package nestedLoop;

public class Quiz1_Step3 {
	static void show(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		int size = 5;
		int num = 1;
		int x = -1, y = 0;		// x를 0이 아닌 -1로 잡는 이유는 x += sign을 해야 하기 때문
								// x += sign을 뒤에 더해주면 실행이 잘 되다가 어느 순간 안됨
		int sign = 1;
		int[][] arr = new int[size][size];
		
		// 다음 형태로 출력하세요
		// 1	2	3	4	5
		// 16	17	18	19	6
		// 15 	24	25	20	7
		// 14	23	22	21	8
		// 13	12	11	10	9
		
		// while(true), if, for
		// sign = -sign

		while(true) {
			for(int i = 0; i < size; i++) {		// 반복 5회
				x += sign;						// x가 1씩 증가/감소
				arr[y][x] = num++;
			}
			size--;				// 길이감소(4)
			if(size == 0) {
				break;
			}
			
			for(int i = 0; i < size; i++) {		// 반복 4회
				y += sign;						// y가 1씩 증가/감소
				arr[y][x] = num++;
			}
			
			sign = -sign;				// 부호반전(-)
		}
		
	
		System.out.println("size : " + size + "\n");
		show(arr);
		

		
		
		
		
	}
}
