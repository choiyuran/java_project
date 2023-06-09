package product;

import java.util.Arrays;
import java.util.Comparator;


public class Handler {
	// { f, f, i, i, null, null.... }
	Product[] arr = new Product[10];
	
	Object[] compArray = new Object[4];
	
	public Handler() {
		Comparator<Product> comp1 = (a,b) -> a != null && b != null ? a.name.compareTo(b.name) : 0;			// 이름 오름차순
		Comparator<Product> comp2 = (a,b) -> a != null && b != null ? b.name.compareTo(a.name) : 0;			// 이름 내림차순
		Comparator<Product> comp3 = (a,b) -> a != null && b != null ? a.price - b.price : 0;				// 가격 오름차순
		Comparator<Product> comp4 = (a,b) -> a != null && b != null ? b.price - a.price : 0;				// 가격 내림차순
		compArray[0] = comp1;
		compArray[1] = comp2;
		compArray[2] = comp3;
		compArray[3] = comp4;
	}
			
	// 전체 목록
	public Product[] selectAll() {
		return arr; 
	}

	// 추가
	public int insert(Product tmp) {
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
	public Product[] search(String search) {
		Product[] ret = null;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			Product p = arr[i];
			// 상품(P)의 (.) 이름(name)이 검색어(search)를 포함(contains)하면
			if(arr[i] != null && p.name.contains(search)) {
				count++;
			}
		}
		ret = new Product[count];
		count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.contains(search)) {
				ret[count++] = arr[i];
			}
		}
		
		return ret;
	}

	// 삭제
//	row = handler.delete(name);
	public int delete(String search) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(search)) {
				arr[i] = null;
				row += 1;
			}
		}
		return row;
	}

	
	
	// 정렬
	@SuppressWarnings("unchecked")				// 타입이 확인되지 않은 다운캐스팅에 대하여 경고를 억제한다
	public Product[] sort(int option) {			// 1, 2번 할때는 int option 매개변수 받지 않음
		// 1) 람다식 Comparator
//		Arrays.sort(arr, (a, b) -> a != null && b != null ? a.name.compareTo(b.name) : 0);		// null이 있는 부분도 있기 때문에 예외 터짐
		
		// 2) 익명 클래스
//		Arrays.sort(arr, new Comparator<Product>() {
//
//			@Override
//			public int compare(Product a, Product b) {
//				if(a != null && b != null) {
//					return a.name.compareTo(b.name);
//				}
//				return 0;
//			}
//			
//		});
		
		if(0 <= option && option < compArray.length) {
			Arrays.sort(arr, (Comparator<Product>)compArray[option]);
		}
		return arr;
	}
		
	
}
