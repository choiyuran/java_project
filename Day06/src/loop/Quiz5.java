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
		
		while(n1 != 0) {
			tmp += n1 % 10;
			n1 /= 10;
			for(int i = 0; i < tmp.length(); i++) {
				
			}
			
		}
		System.out.println("tmp : " + tmp);
		
	
		
		sc.close();
	}
}
