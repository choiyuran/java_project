package computer;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Handler handler = new Handler();
		Scanner sc = new Scanner(System.in);
		Computer tmp = null;
		Computer[] arr = null;
		String keyword;
		int menu;
		int row;
		
		handler.insert(new DeskTop("삼성 컴퓨터", 1180000, 28));
		handler.insert(new DeskTop("LG 컴퓨터", 2180000, 30));
		handler.insert(new LapTop("gram", 1050000, "사무용"));
		handler.insert(new LapTop("삼성 펜", 1850000, "사무용"));
		handler.insert(new LapTop("게이밍 노트북", 2300000, "게이밍"));
		
		while(true) {
			System.out.println("1. 전체 조회");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 삭제");
			System.out.println("5. 정렬");
			System.out.println("0. 종료");
			System.out.println("선택 >>");
			menu = Integer.parseInt(sc.nextLine()); 
			
			switch(menu) {
			case 1:			// 전체 조회
				arr  = handler.selectAll();
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] != null) {
						System.out.println(arr[i]);
					}
				}
				break;
				
			case 2:			// 추가
				System.out.println("추가 할 상품 (숫자로 입력) : 1. 컴퓨터 | 2. 노트북");
				menu = Integer.parseInt(sc.nextLine());
				
				if(menu == 1) 		tmp = addDeskTop(sc);
				else if(menu == 2) 	tmp = addLapTop(sc);
				else 				tmp = null;
				row = handler.insert(tmp);
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;
				
			case 3:			// 검색
				System.out.println("검색어 입력 : ");
				keyword = sc.nextLine();
				
				arr = handler.search(keyword);
				for(Computer c : arr) {
					if(c != null) {
						System.out.println(c);
					}
				}
				break;
				
			case 4:			// 삭제
				System.out.println("삭제할 데이터 입력 : ");
				keyword = sc.nextLine();
				row = handler.delete(keyword);
				System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
				break;
				
			case 5:			// 정렬
				System.out.println("정렬 방식 선택 (1 ~ 4) : ");
				menu = Integer.parseInt(sc.nextLine());
				arr = handler.sort(menu - 1);
				for(Computer c : arr) {
					if(c != null) {
						System.out.println(c);
					}
				}
				break;
				
			case 0:			// 종료
				sc.close();
				System.out.println("프로그램 종료!");
				return;
			default:
				System.out.println("잘못된 번호 입니다!");
			}
			System.out.println();
		}
		
	}

	private static Computer addLapTop(Scanner sc) {
		String name;
		int price;
		String using;
		
		System.out.println("노트북 상품 : ");
		name = sc.nextLine();
		
		System.out.println("노트북 가격 : ");
		price = Integer.parseInt(sc.nextLine());
		
		System.out.println("노트북 용도 : ");
		using = sc.nextLine();
		
		LapTop l = new LapTop(name, price, using);
		return l;
	}

	private static Computer addDeskTop(Scanner sc) {
		String name;
		int price;
		int inch;
		
		System.out.println("컴퓨터 상품 : ");
		name = sc.nextLine();
		
		System.out.println("컴퓨터 가격 : ");
		price = Integer.parseInt(sc.nextLine());
		
		System.out.println("컴퓨터 인치 : ");
		inch = Integer.parseInt(sc.nextLine());
		
		Computer c = new DeskTop(name, price, inch);
		return c;
	}
}
