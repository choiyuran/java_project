package loop;

public class Ex05 {
	public static void main(String[] args) {
		
		// 다음 모양의 문자열을 만들어서 화면에 출력하세요
		
		// ====*====*====*====*====
		String str = "";
		for(int i = 1; i < 25; i++) {
			if(i % 5 == 0) {
				str += "*";
			}
			else {
				str += "=";
			}
		}
		System.out.println(str);
		
		String str2 = "";
		for(int i = 0; i < 5; i++) {
			str2 += "====";
			if(i != 4) {	// 마지막 순번이 아니면
				str2 += "*";	// *을 추가한다
			}
		}
		System.out.println(str2);
	}
}
