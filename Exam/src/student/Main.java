package student;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Handler handler = new Handler();
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, math;
		int physi;
		int java, python;
		int chemistry;
		Student tmp = null;
		Student[] arr = null;
		String keyword;
		int row;
		int menu;
		
		handler.insert(new ComputerStudent("홍길동", 98, 78, 89, 90, 95));
		handler.insert(new Physics("김나무", 92, 90, 91, 96));
		handler.insert(new Mathematics("박찬우", 89, 77, 87, 88));
		
		while(true) {
			System.out.println("1. 전체 조회");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 삭제");
			System.out.println("5. 정렬");
			System.out.println("0. 종료");
			System.out.println("선택 >>>");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:		// 목록 조회
				arr = handler.selectAll();
				for(Student st : arr) {
					if(st != null) {
						System.out.println(st);
					}
				}
				break;
				
			case 2:		// 추가
				System.out.println("추가 할 항목 선택(숫자 선택) : 1. 컴퓨터공학 | 2. 수학과 | 3. 화학과");
				menu = Integer.parseInt(sc.nextLine());
				if(menu == 1)			tmp = addCom(sc);
				else if(menu == 2)		tmp = addMath(sc);
				else if(menu == 3) 		tmp = addPhy(sc);
				else					tmp = null;
				row = handler.insert(tmp);
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;
				
			case 3:		// 검색
				System.out.println("검색할 학생을 입력하세요 : ");
				keyword = sc.nextLine();
				arr = handler.search(keyword);
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] != null) {
						System.out.println(arr[i]);
					}
				}
				break;
				
			case 4:		// 삭제
				System.out.println("삭제할 학생을 선택하세요 : ");
				keyword = sc.nextLine();
				row = handler.delete(keyword);
				System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
				break;
				
			case 5:		// 정렬
				System.out.println("정렬 방식을 선택 (1 ~ 4) : ");
				menu = Integer.parseInt(sc.nextLine());
				arr = handler.sort(menu - 1);
				for(Student st : arr) {
					if(st != null) {
						System.out.println(st);
					}
				}
				break;
				
			case 0:		// 종료
				sc.close();
				System.out.println("프로그램 종료");
				return;
				
			default:		
				System.out.println("잘못된 번호입니다!");
			}
			System.out.println();
		}
		
		
	}

	private static Student addPhy(Scanner sc) {
		String name;
		int kor, eng, math, physi;
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.println("국어 점수 : ");
		kor = Integer.parseInt(sc.nextLine());
		
		System.out.println("영어 점수 : ");
		eng = Integer.parseInt(sc.nextLine());
		
		System.out.println("수학 점수 : ");
		math = Integer.parseInt(sc.nextLine());
		
		System.out.println("물리 점수 : ");
		physi = Integer.parseInt(sc.nextLine());
		
		Physics phy = new Physics(name, kor, eng, math, physi);
		return phy;
	}

	private static Student addMath(Scanner sc) {
		String name;
		int kor, eng, math, chemistry;
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.println("국어 점수 : ");
		kor = Integer.parseInt(sc.nextLine());
		
		System.out.println("영어 점수 : ");
		eng = Integer.parseInt(sc.nextLine());
		
		System.out.println("수학 점수 : ");
		math = Integer.parseInt(sc.nextLine());
		
		System.out.println("화학 점수 : ");
		chemistry = Integer.parseInt(sc.nextLine());
		
		Mathematics ma = new Mathematics(name, kor, eng, math, chemistry);
		return ma;
	}

	private static Student addCom(Scanner sc) {
		String name;
		int kor, eng, math;
		int java, python;
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.println("국어 점수 : ");
		kor = Integer.parseInt(sc.nextLine());
		
		System.out.println("영어 점수 : ");
		eng = Integer.parseInt(sc.nextLine());
		
		System.out.println("수학 점수 : ");
		math = Integer.parseInt(sc.nextLine());
		
		System.out.println("자바 점수 : ");
		java = Integer.parseInt(sc.nextLine());
		
		System.out.println("파이썬 점수 : ");
		python = Integer.parseInt(sc.nextLine());
		
		ComputerStudent com = new ComputerStudent(name, kor, eng, math, java, python);
		return com;
	}
}
