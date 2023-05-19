package input;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 생년원일을 8자리 정수로 입력 받아서
		// 올해연도를 이용하여 나이를 계산하여 출력하기
		// 출생 : yyyy-MM-dd
		// 나이 : x살
		
		Scanner sc = new Scanner(System.in);
		
		int currentYear = 2023;
		int birthYear;
		int month;
		int date;
		int age;
		int birth;
		boolean isBirth;
		int result;
		
		System.out.print("생년월일 입력(8자리) : ");
		birth = Integer.parseInt(sc.nextLine());
		System.out.print("생일이 지났는지 ture/false로 입력 : ");
		isBirth = Boolean.parseBoolean(sc.nextLine());
		
		birthYear = birth / 10000;
		birth %= 10000; 
		
		month = birth / 100;
		date = birth % 100;
		age = currentYear - birthYear + 1;
		
		if(isBirth) {
			result = age - 1; 
		}
		else {
			result = age - 2;
		}
			
		System.out.printf("출생 : %d-%02d-%02d\n", birthYear, month, date);
		System.out.printf("나이 : %d살(만 나이 : %d살)\n", age, result);

	}
}
