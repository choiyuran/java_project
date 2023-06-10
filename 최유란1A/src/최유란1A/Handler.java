package 최유란1A;

import java.util.Arrays;

public class Handler {
	Member[] arr = new Member[100];

	// 회원가입(생성,추가)
	public int join(Member tmp) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && tmp.getId().equals(arr[i].getId())) {
				break;
			}
			if(arr[i] == null) {
				arr[i] = tmp;
				row = 1;
				break;
			}
		}
		return row;
	}

	// 삭제확인 후 삭제 실행
	public void agreeDel(String agree, String keyword) {
		if(agree.equals("y")) {
			int row = this.delete(keyword);
			System.out.println(row != 0 ? keyword + " 계정이 탈퇴 처리 되었습니다" : "탈퇴 실패");
		}
		else {
			System.out.println("회원 탈퇴를 취소하였습니다");
		}
	}
	// 삭제
	public int delete(String keyword) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getId().equals(keyword)) {
				arr[i] = null;
				row = 1;				
			}
		}
		return row;
	}

	// 목록 조회
	public Member[] selectAll() {
		return arr;
	}
	
	// 검색
	public Member search(String keyword) {
		Member sr = null;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getId().equals(keyword)) {
				sr = arr[i];
			}
		}
		return sr;
	}

	
	// 정렬
	public Member[] sort() {
		Arrays.sort(arr, (a,b) -> a != null && b != null ? a.getId().compareTo(b.getId()) : 0);
		return arr;
	}

}
