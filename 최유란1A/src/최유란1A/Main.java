package 최유란1A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Handler handler = new Handler();
		Scanner sc = new Scanner(System.in);
		Member[] arr = null;
		Member tmp = null;
		int row;
		String keyword;
		int menu;
		
		// dummy data
		handler.join(new Seller("itbank", "it", "테스트", "올리브영"));
		handler.join(new Seller("user1", "321", "김또치", "맥도날드"));
		handler.join(new Customer("apple", "999", "김진호", "부산광역시 북구"));
		
		while(true) {
			System.out.println("쇼핑몰 회원관리 프로그램 (응시자 : 최유란)");
			System.out.println("1. 회원가입");
			System.out.println("2. 회원탈퇴");
			System.out.println("3. 전체목록");
			System.out.println("4. 단일검색");
			System.out.println("5. 정렬");
			System.out.println("0. 종료");
			System.out.println("선택 >>>");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1: 	// 회원가입(생성)
				System.out.print("회원가입 유형을 선택하세요\n1. 판매자 | 2. 구매자 : ");
				menu = Integer.parseInt(sc.nextLine());
				if(menu == 1) 			tmp = joinSeller(sc);
				else if(menu == 2) 		tmp = joinCustomer(sc);
				else 					tmp = null;
				row = handler.join(tmp);
				System.out.println(row != 0 ? "가입을 축하드립니다" : "가입 실패");
				break;
				
			case 2: 	// 회원탈퇴(삭제)
				System.out.print("지정한 계정을 탈퇴합니다 ID 입력 : ");
				keyword = sc.nextLine();
				tmp = handler.search(keyword);
				if(tmp != null) {
					System.out.println(tmp);
				}
				
				System.out.print("정말 탈퇴 하시겠습니까?(y/n)");
				String agree = sc.nextLine();
				handler.agreeDel(agree, keyword);
				break;
				
			case 3: 	// 전체목록
				arr = handler.selectAll();
				for(Member m : arr) {
					if(m != null) {
						System.out.println(m);
					}
				}
				break;
				
			case 4: 	// 단일검색
				System.out.print("ID로 회원을 검색합니다 ID 입력 : ");
				keyword = sc.nextLine();
				tmp = handler.search(keyword);
				if(tmp != null) {
					System.out.println(tmp);
				}
				else { 
					System.out.println(keyword + " : 회원을 찾을 수 없습니다");
				}
				break;
				
			case 5: 	// 정렬(ID 오름차순)
				arr = handler.sort();
				for(Member m : arr) {
					if(m != null) {
						System.out.println(m);
					}
				}
				break;
			case 0:	
				sc.close();
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하셨습니다!");
			}
			System.out.println();
		}
		
		
	}

	private static Member joinSeller(Scanner sc) {
		String id, password, name;
		String storeName;
		
		System.out.println("ID를 입력하세요 : ");
		id = sc.nextLine();
		
		System.out.println("Password를 입력하세요 : ");
		password = sc.nextLine();
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.println("가게 이름을 입력하세요 : ");
		storeName = sc.nextLine();
		
		Seller sel = new Seller(id, password, name, storeName);
		return sel;
	}
	
	private static Member joinCustomer(Scanner sc) {
		String id, password, name;
		String address;
		
		System.out.println("ID를 입력하세요 : ");
		id = sc.nextLine();
		
		System.out.println("Password를 입력하세요 : ");
		password = sc.nextLine();
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.println("배송 주소를 입력하세요 : ");
		address = sc.nextLine();
		
		Customer cus = new Customer(id, password, name, address);
		return cus;
	}
}
