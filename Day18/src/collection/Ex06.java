package collection;

import java.util.HashSet;

public class Ex06 {
	public static void main(String[] args) {
		// Set : 순번이 없고, 값의 중복을 허용하지 않는다
		
		HashSet<Integer> set = new HashSet<>();
		// Generic Type에는 primitive 타입을 지정할 수 없다
		// 대신 wrapper class를 이용하여 지정할 수 있다
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);		// 중복 불가
		
		System.out.println(set);
		
		// 순번이 없어서, 특정 값을 지정해서 불러올 수 없다
//		System.out.println(set.get(0));
		for(Integer num : set) {
			System.out.println(num);
		}
		System.out.println();
		
		System.out.println("set.size() : " + set.size());
		// List는 쀄레로로셰 같은 느낌, Set은 abc 초콜릿 같은 느낌
		
		
		
		
	}
}
