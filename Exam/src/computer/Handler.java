package computer;

import java.util.Arrays;
import java.util.Comparator;

public class Handler {
	Computer[] arr = new Computer[10];
	Object[] compArray = new Object[4];
	
	public Handler() {
		Comparator<Computer> comp1 = (a,b) -> a != null && b != null ? a.name.compareTo(b.name) : 0;
		Comparator<Computer> comp2 = (a,b) -> a != null && b != null ? b.name.compareTo(a.name) : 0;
		Comparator<Computer> comp3 = (a,b) -> a != null && b != null ? a.price - b.price : 0;
		Comparator<Computer> comp4 = (a,b) -> a != null && b != null ? b.price - a.price : 0;
		compArray[0] = comp1;
		compArray[1] = comp2;
		compArray[2] = comp3;
		compArray[3] = comp4;
		
	}
	
	// 전체 반환
	public Computer[] selectAll() {
		return arr;
	}

	// 추가
	public int insert(Computer tmp) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = tmp;
				row = 1;
				break;
			}
		}
		return row;
	}
	
	// 검색
	public Computer[] search(String keyword) {
		int count = 0;
		Computer[] searchArr = null;
		
		for(int i = 0; i < arr.length; i++) {
			Computer c = arr[i];
			if(arr[i] != null && c.name.contains(keyword)) {
				count++;
			}
		}
		
		searchArr = new Computer[count];
		count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.contains(keyword)) {
				searchArr[count++] = arr[i];
			}
		}
		return searchArr;
	}
	
	// 삭제
	public int delete(String keyword) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(keyword)) {
				arr[i] = null;
				row = 1;
			}
		}
		return row;
	}

	// 정렬
	@SuppressWarnings("unchecked")
	public Computer[] sort(int option) {
		
//		Arrays.sort(arr, new Comparator<Computer>() {
//
//			@Override
//			public int compare(Computer a, Computer b) {
//				if(a != null && b != null) {
//					return a.name.compareTo(b.name);
//				}
//				return 0;
//			}
//			
//		});
//		Arrays.sort(arr, (a,b) -> a != null && b != null ? b.name.compareTo(a.name) : 0);
		if(0 <= option && option < arr.length) {
			Arrays.sort(arr, (Comparator<Computer>)compArray[option]);
		}
		
		return arr;
	}

}
