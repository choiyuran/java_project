package drink;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Handler handler = new Handler();
		Scanner sc = new Scanner(System.in);
		int menu;
		int row;
		Drink[] arr = null;
		Drink tmp = null;
		String keyword;
		
		handler.insert(new Milk("매일우유", 4300, "매일"));
		handler.insert(new Milk("맛있는 우유 GT", 5800, "남양"));
		handler.insert(new Coffee("아메리카노", 2500, "ICE"));
		handler.insert(new Coffee("바닐라라떼", 4000, "ICE"));
		handler.insert(new Coffee("카라멜마끼아또", 3800, "HOT"));
		
		while(true) {
			System.out.println("1. 전체 조회");
			System.out.println("2. 추가");
			System.out.println("3. 삭제");
			System.out.println("4. 검색");
			System.out.println("5. 정렬");
			System.out.println("0. 종료");
			System.out.println("선택 >>>");
			menu = Integer.parseInt(sc.nextLine()); 
			
			switch(menu) {
			case 1 :			// 전체 조회
				arr = handler.selectAll();
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] != null) {
						System.out.println(arr[i]);
					}
				}
//				for(Drink dr : arr) {
//					if(dr != null) {
//						System.out.println(dr);
//					}
//				}
				break;
				
			case 2 :			// 추가
				System.out.println("추가할 항목 : 1. Coffee | 2. Milk");
				menu = Integer.parseInt(sc.nextLine());
				if(menu == 1) tmp = addCoffee(sc);
				else if(menu == 2) tmp = addMilk(sc);
				else				tmp = null;
				row = handler.insert(tmp);
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;
				
			case 3 :			// 삭제
				System.out.println("삭제할 이름을 입력해주세요 : ");
				keyword = sc.nextLine();
				row = handler.delete(keyword);
				System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
				break;
				
			case 4 :			// 검색
				System.out.println("상품 이름 입력 : ");
				keyword = sc.nextLine();
				arr = handler.search(keyword);
				for(Drink d : arr) {
					if(d != null) {
						System.out.println(d);
					}
				}
				break;
				
			case 5 :			// 정렬
				System.out.println("정렬 방식을 선택하세요 (1 ~ 4) : ");
				menu = Integer.parseInt(sc.nextLine()); 
				
				arr = handler.sort(menu - 1);
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] != null) {
						System.out.println(arr[i]);
					}
				}
				break;
				
			case 0 :			// 종료
				sc.close();
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못된 입력입니다");
			}
			System.out.println();
		}
		
		
		
	}

	private static Drink addMilk(Scanner sc) {
		String name;
		int price;
		String company;

		System.out.println("우유 이름 : ");
		name = sc.nextLine();
		
		System.out.println("우유 가격 : ");
		price = Integer.parseInt(sc.nextLine());
		
		System.out.println("우유 제조회사 : ");
		company = sc.nextLine();
		
		Milk m = new Milk(name, price, company);
		return m;
	}

	private static Drink addCoffee(Scanner sc) {
		String name;
		int price;
		String iceHot;
		
		System.out.println("커피 이름 : ");
		name = sc.nextLine();
		
		System.out.println("커피 가격 : ");
		price = Integer.parseInt(sc.nextLine());
		
		System.out.println("커피 ICE/HOT : ");
		iceHot = sc.nextLine();
		
		Coffee c = new Coffee(name, price, iceHot);
		return c;
	}
}
