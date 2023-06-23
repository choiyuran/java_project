package collection;

import java.util.ArrayList;

public class Ex05 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("apple");
		list.add("banana");
		list.add("car");
		list.add("dinosaur");
		list.add("elephant");
		
		System.out.println(list);
		// 검색할 때
		System.out.println("list.contains(\"car\") : " + list.contains("car"));
		System.out.println("list.contains(\"carpet\") : " + list.contains("carpet"));
		System.out.println();
		
		System.out.println("list.indexOf(\"car\") : " + list.indexOf("car"));
		System.out.println("list.indexOf(\"carpet\") : " + list.indexOf("carpet"));		// index의 값 중 -1을 반환하면 없다는 의미
		System.out.println();
		
		// 조건부 삭제
		list.removeIf(s -> s.contains("r"));
		
		System.out.println(list);
		
		list.add("carpet");
		list.add("dictionary");
		System.out.println(list);
		
		// String은 Comparable 하기 때문에, 별도의 Comparator를 전달하지 않아도 된다
		// java 8 api 문서에서 java.lang.String 클래스 참조
		list.sort(null);		
		System.out.println(list);
		
		// 필요하다면 특정 정렬 기준을 제시하는 Comparator를 전달할 수도 있다
		// 글자수에 따라서 오름차순, 내림차순
		list.sort((a,b) -> a.length() - b.length());	// 오름차순
		System.out.println(list);

		list.sort((a,b) -> b.length() - a.length());	// 내림차순
		System.out.println(list);
		
		
	}
}
