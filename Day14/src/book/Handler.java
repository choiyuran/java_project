package book;

//추가/삭제/전체목록반환/검색

public class Handler {
	private Book[] arr = new Book[10];			
	
	// 객체 추가
	public int insert(Book book) {		// Book 타입의 매개변수를 받음
		int row = 0;					// 데이터 추가 성공 여부 확인
		for(int i = 0; i < arr.length; i++) {		// arr의 배열 길이만큼 순환(생성해놓은 배열의 길이만큼만 돌려야 하기 때문)
			if(arr[i] == null) {					// arr 배열의 i번째에 데이터가 비어있다면
				arr[i] = book;						// 전달받은 book데이터를 넣어준다
				row = 1;							// 데이터를 추가했으면 row에 1을 넣어줌
				break;								// 하나를 추가했으면 멈춤
			}					
		}
		return row;
	}
	
	// 목록 반환
	public Book[] getArray() {
		return arr;
	}
	
	// 제목을 입력받아 해당하는 정보가 있으면 삭제
	public int delete(String title) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {				// 검색어에 해당하는 정보가 있는지 데이터가 추가 되어있는 arr 배열에서 순환하여 찾음	
			if(arr[i] != null && arr[i].getTitle().equals(title)) {	// arr[i]번째가 비어있으면 null포인터 예외가 뜨기 때문에 null이 아닐때를 조건에 추가해주고
																		// 전달받은 제목과 일치하는지 확인 
				arr[i] = null;		// 확인 후 일치하는 데이터가 있다면 그곳에 null을 넣어줘서 삭제
				row = 1;			// 성공했으면 1을 row에 넣어줌
				break;
			}
		}
		return row;
	}
	
	
	// 검색하는 키워드(책 제목)를 포함하고 있으면 반환
	// 1) 검색하는 키워드가 포함된 수를 찾음
	// 2) 찾은 수 크기만큼의 배열을 새로 만듬
	// 3) 포함하고 있는 데이터들을 새로 만든 배열에 복사하여 저장해줌
	// 4) 배열을 반환
	public Book[] search(String keyword) {
		Book[] result = null;					// 키워드가 포함된 수로 만들 배열을 null로 초기화 해놓음
		int count = 0;						// 찾은 개수
		for(int i = 0; i < arr.length; i++) {			// 키워드가 포함된 데이터를 찾기위해 arr배열을 순환
			if(arr[i] != null) {					// arr[i]가 null이 아니라면
				if((arr[i].getTitle().contains(keyword)) || (arr[i].getAuthor().contains(keyword)) ||	// arr[i]의 제목, 저자, 출판일이 keyword를 포함하고 있는지 체크
					(arr[i].getPublishDate().contains(keyword))) {
					count++;						// 포함한다면 개수에 플러스
				}
			}
//			if(arr[i] != null && arr[i].getTitle().contains(keyword)) {		// arr[i]가 null값이 아닌지 같이 체크해줌
//																			// arr[i]가 null값이 아니고 키워드가 포함한다면
//				count++;													// 개수에 플러스
//			}
		}
		result = new Book[count];	// 배열의 크기를 개수로 지정
		int index = 0;				// result 배열의 index로 사용
		for(int i = 0; i < arr.length; i++) {					// arr 배열을 순환하여 일치하는 데이터를 뽑아옴
			if(arr[i] != null) {			// arr[i]가 null이 아니라면
				if((arr[i].getTitle().contains(keyword)) || (arr[i].getAuthor().contains(keyword)) ||	// arr[i]의 제목, 저자, 출판일이 keyword를 포함하고 있는지 체크
					(arr[i].getPublishDate().contains(keyword))) {
					result[index++] = arr[i];					// 포함한다면 새로 만든 배열 result에 데이터 추가 후 그 다음 인덱스에 또 찾은 데이터를 추가해줘야 하니까 인덱스 플러스
				}
			
//			if(arr[i] != null && arr[i].getTitle().contains(keyword)) {	
//				result[index++] = arr[i];						// 일치하는 데이터를 복사해 저장할 배열에(result)에 일치하는 데이터를 저장해줌
//																// 일치하는 데이터가 없을 경우를 생각했을때 result의 인덱스를 i로 사용하면 배열에 빈 부분이 생겨서 index를 따로 사용
			}
		}
		return result;											// 배열을 반환
	}
	
	
}
