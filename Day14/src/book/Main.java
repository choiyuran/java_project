package book;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);			// 키보드 입력
		Handler handler = new Handler();				// Handler의 객체 생성
		
		int menu;						// switch문에서 사용할 메뉴 번호
		Book tmp = null;				// 추가할 데이터를 입력했을 때 그 데이터를 담을 임시 변수
		String title;					// 삭제할때 입력받을 제목 변수, 데이터를 추가할때 입력받을 제목 변수
		String keyword;					// 검색할때 입력받을 키워드(제목) 변수
		
		// 데이터 추가 시 입력 받을 변수
		String author;			// 저자
		String publishDate;		// 출판일
		double grade;			// 평점
		int price;				// 가격
		
		Book[] arr = null;		// 전체 데이터 조회나 검색 시 데이터를 받아올 배열
		int row;				// 추가, 삭제가 잘 되었는지 확인할 변수
		
		// 테스트를 좀 더 편하게 하기 위해 미리 데이터를 몇개 넣어놓음(dummy data 생성)
		handler.insert(new Book("냥이 씨의 달콤한 식탁", "박혜선", "2023/05/05", 10.0, 12600));		
		handler.insert(new Book("헤아림의 조각들", "임지은", "2023/05/24", 10.0, 15120));		
		handler.insert(new Book("역행자", "자청", "2023/05/29", 9.4, 17550));		
		handler.insert(new Book("불편한 편의점", "김호연", "2021/04/20", 9.2, 12600));		
		handler.insert(new Book("불편한 편의점2", "김호연", "2022/08/10", 9.2, 12600));		
		
		
		while(true) {				// 메뉴 목록을 돌리는 while문
			System.out.println("1. 목록 조회");
			System.out.println("2. 추가");
			System.out.println("3. 삭제");
			System.out.println("4. 검색");
			System.out.println("0. 종료");
			System.out.print("선택 >>>");
			menu = Integer.parseInt(sc.nextLine());		// nextInt()로 받을 경우 엔터가 남아있을수 있으므로 
														// 깔끔하게 nextLine()으로 받고 형변환 시켜줌
			switch(menu) {		// 메뉴 선택 번호에 따라 다른 실행을 하게 하는 switch문
			case 1 :	// 목록 조회
				arr = handler.getArray();				// handler에 있는 목록을 가져오는 getArray()메서드를 호출하여 arr 배열에 넣어줌
				for(int i = 0; i < arr.length; i++) {	// arr 배열을 순환하여
					if (arr[i] != null) {				// arr[i]가 null값이 아니라면(비어있는게 아니라면)
						arr[i].show();					// show() 메서드를 호출하여 정보를 보여준다
					}
				}
				break;
				
			case 2 :	// 데이터 추가(insert)
				System.out.print("도서 제목 : ");	
				title = sc.nextLine();
			
				System.out.print("저자 : ");
				author = sc.nextLine();
				
				System.out.print("출판일자 : ");
				publishDate = sc.nextLine();
				
				System.out.print("평점 : ");
				grade = Double.parseDouble(sc.nextLine());
				
				System.out.print("가격 : ");
				price = Integer.parseInt(sc.nextLine());
				
				tmp = new Book(title, author, publishDate, grade, price);		// 추가할 데이터들을 tmp에 저장
				row = handler.insert(tmp);					// 추가할 데이터 tmp를 전달하여 handler의 insert()메서드를 실행시킨다 
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");	// row가 0이 아니면 성공 메세지, row가 0이면 실패 메세지
				break;
				
			case 3 :	// 삭제
				System.out.print("삭제할 제목을 입력 : ");
				title = sc.nextLine();
				row = handler.delete(title);			// delete() 메서드를 실행하면서 삭제할 데이터가 들어있는 title을 매개변수로 전달
				System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");	// 실행 후 row가 0이 아니면 성공 메세지, 0이면 실패 메세지
				break;
				
			case 4 :	// 검색
				System.out.print("검색할 키워드 입력 : ");
				keyword = sc.nextLine();	
				arr = handler.search(keyword);			// 키워드를 포함하는 데이터 배열을 arr배열에 넣어줌
				for(int i = 0; i < arr.length; i++) {	// 검색한 데이터가 들어있는 arr배열을 순환하며
					if(arr[i] != null) {				// arr[i]번째가 null값이 아니면 
						arr[i].showDetail();					// 해당하는 데이터를 보여줌
					}
				}
				break;
				
			case 0 :	// 프로그램 종료
				System.out.println("프로그램 종료");
				sc.close();
				return;
			
			}// end of switch
			System.out.println();
			
		}	//end of while
		
	}	//end of main
}	//end of class
