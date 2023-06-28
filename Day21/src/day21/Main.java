package day21;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);		// 키보드 입력을 받는 Scanner
		Handler handler = new Handler();
		
		List<PhoneBookInfo> list;
		String name, pnum;
		int menu = -1, age, row;
		PhoneBookInfo user;
		String keyword;
		
		while(menu != 0) {
			System.out.println("1. 전체 목록 출력");
			System.out.println("2. 데이터 추가");
			System.out.println("3. 저장");
			System.out.println("4. 검색");
			System.out.println("5. 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:				// 전체 목록 출력
				handler.load();			// 특정 파일이름의 데이터를 리스트에 불러오기
				list = handler.select();
				list.forEach(ob -> System.out.println(ob));
				System.out.println();
				break;
			case 2:				// 데이터 추가
				System.out.print("이름 입력 : ");
				name = sc.nextLine();
				System.out.print("나이 입력 : ");
				age = Integer.parseInt(sc.nextLine());	
				System.out.print("전화번호 입력 : ");
				pnum = sc.nextLine();
				
				user = new PhoneBookInfo(name, age, pnum);
				row = handler.add(user);
//				row = handler.add(new PhoneBookInfo(name, age, pnum));
				
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				System.out.println();
				break;
			case 3:				// 저장
				handler.save();
				System.out.println();
				break;
			case 4:				// 검색
				System.out.println("검색할 이름 입력 : ");
				keyword = sc.nextLine();
				list = handler.search(keyword);
				for(PhoneBookInfo result : list) {
					if(result != null) {
						System.out.println(result);
					}
					else {
						System.out.println("일치하는 결과가 없습니다.");
					}
				}
				System.out.println();
				break;
			case 0: 				// 종료
				sc.close();
				System.out.println("프로그램을 종료합니다");
				break;
			}		// end of switch
		}		// end of while
		
		
		sc.close();
	}
}
