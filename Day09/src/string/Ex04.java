package string;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		String search = "멜로망스 선물 가사";
		search = search.replace(" ", "+");
		String url = "https://search.naver.com/search.naver?query=" + search;
		URL requestURL = new URL(url);
		URLConnection conn = requestURL.openConnection();
		Scanner sc = new Scanner(conn.getInputStream());
		String data = "";
		
		while(sc.hasNextLine()) {
			data += sc.nextLine() + "\n";
		}
		System.out.println(data);
		System.out.println(data.length());
		
		// 문자열 함수를 이용하여 내가 원하는 부분만 남기기
		data = data.substring(data.indexOf("<div class=\"intro_box\">"));
		data = data.substring(0, data.indexOf("</div>"));
		System.out.println(data.length());
		
		data = data.replace("<br/>", "\n");
		data = data.replace("<br>", "\n");
		data = data.replace("\n ", "\n");		// 두번째 줄 부터 줄바꿈 하면서 앞에 생기는 공백을 공백 없는 줄바꿈으로 바꾼다(줄의 젤 처음 글자의 앞칸을 없애기)		
		data = data.replace("</p>", "");
		data = data.substring(data.lastIndexOf(">") + 1);
		data = data.replaceFirst(" ", "");		// 첫번째 줄 첫글자의 앞 공백이 있으면 없애기(가사)
		
		System.out.println(data);
		System.out.println(data.length());
		
		sc.close();
	}
}
