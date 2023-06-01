package book;

// 도서 관리 프로그램에서 다룰 도서를 나타내는 클래스
// 도서 제목		(문자열)
// 저자			(문자열)
// 출판일자		(문자열)
// 평점			(실수, 소수점 첫째자리까지)
// 가격			(정수, 출력시 천단위 구분기호를 포함)
public class Book {
	private String title;			// 제목
	private String author;			// 저자
	private String publishDate;		// 출판일
	private double grade;			// 평점
	private int price;				// 가격
	
	Book(String title, String author, String publishDate, double grade, int price) {
		this.title = title;
		this.author = author;
		this.publishDate = publishDate;
		this.grade = grade;
		this.price = price;
	}
	// 검색했을 경우 보여줄 세부적인 정보
	void showDetail() {
		System.out.printf("제목(저자) : %s(%s)\n", title, author);
		System.out.printf("출판일자 : %s\n", publishDate);
		System.out.printf("평점 : %.1f\n", grade);
		System.out.printf("가격 : %,d원\n\n", price);
	}
	
	// 목록 조회했을 경우 보여줄 정보
	void show() {
		System.out.printf("제목(저자) : %s(%s)\n", title, author);
		System.out.printf("가격 : %,d원\n\n", price);
	}
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublishDate() {
		return publishDate;
	}
	
}
