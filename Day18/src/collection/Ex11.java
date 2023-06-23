package collection;

import java.util.HashMap;

public class Ex11 {
	public static void main(String[] args) {
		// 1부터 1000사이의 정수 중에서
		// 3의 배수, 5의 배수, 7의 배수의 개수를 각각 구하세요
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 1; i <= 1000; i++) {
			if(i % 3 == 0) {
				map.put(3, map.getOrDefault(3, 0) + 1);
			}
			if(i % 5 == 0) {
				map.put(5, map.getOrDefault(5, 0) + 1);
			}
			if(i % 7 == 0) {
				map.put(7, map.getOrDefault(7, 0) + 1);
			}
		}
		System.out.println(map);
		
	
	}
}
