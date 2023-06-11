package drink;

import java.util.Arrays;
import java.util.Comparator;

public class Handler {
	Drink[] arr = new Drink[10];
	Object[] compArray = new Object[4];

	public Handler() {
		Comparator<Drink> comp1 = (a,b) -> a != null && b != null ? a.name.compareTo(b.name) : 0;
		Comparator<Drink> comp2 = (a,b) -> a != null && b != null ? b.name.compareTo(a.name) : 0;
		Comparator<Drink> comp3 = (a,b) -> a != null && b != null ? a.price - b.price : 0;
		Comparator<Drink> comp4 = (a,b) -> a != null && b != null ? b.price - a.price : 0;
		compArray[0] = comp1;
		compArray[1] = comp2;
		compArray[2] = comp3;
		compArray[3] = comp4;
		
	}
	
	// 전체 조회
	public Drink[] selectAll() {
		return arr;
	}

	// 추가
	public int insert(Drink tmp) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = tmp;
				row++;
				break;
			}
		}
		
		return row;
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

	// 검색
	public Drink[] search(String keyword) {
		int count = 0;
		Drink[] searchData = null;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.contains(keyword)) {
				count++;
			}
		}
		
		searchData = new Drink[count];
		count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.contains(keyword)) {
				searchData[count++] = arr[i];
			}
		}
		return searchData;
	}

	// 정렬
	@SuppressWarnings("unchecked")
	public Drink[] sort(int option) {
		// 이름순으로 정렬
//		Arrays.sort(arr, (a,b) -> a != null && b != null ? a.name.compareTo(b.name) : 0);
		
//		Arrays.sort(arr, new Comparator<Drink>() {
//
//			@Override
//			public int compare(Drink a, Drink b) {
//				if(a != null && b != null) {
//					return a.name.compareTo(b.name);					
//				}
//				return 0;
//			}
//		});
		
		if(0 <= option && option < compArray.length) {
			Arrays.sort(arr, (Comparator<Drink>)compArray[option]);
		}
//		
		return arr;
	}
	
	
	
	
	
	
}
