package operator;

public class Ex08 {
	public static void main(String[] args) {
		
		// 비교 연산 : >, <, >=, <= ,==, !=
		// 초과, 미만, 이상, 이하, 일치, 불일치
		// 두 값을 비교하여 결과를  boolean 형식 (true/false)로 만들어낸다
		
		int n1 = 10;
		int n2 = 3;
		
		System.out.println("n1 > n2 : " + (n1 > n2));
		System.out.println("n1 < n2 : " + (n1 < n2));
		System.out.println("n1 >= n2 : " + (n1 >= n2));
		System.out.println("n1 <= n2 : " + (n1 <= n2));
		System.out.println("n1 == n2 : " + (n1 == n2));			// 일치 (등호)
		System.out.println("n1 != n2 : " + (n1 != n2));
		System.out.println();
		
		boolean b1 = n1 > n2;		// 변수에 저장해두었다가 나중에 활용할 수 있다
		boolean b2 = n1 < n2;		// 별도의 자료형이 존재한다
		boolean b3 = n1 >= n2;
		boolean b4 = n1 <= n2;
		boolean b5 = n1 == n2;
		boolean b6 = n1 != n2;
		
		// !! 문자열은 == 로 일치 여부를 판별하지 않는다
		// 문자열 일치 여부에 ==를 사용할 경우 같은 것을 가리키는지 비교
		// 저장해놓은 문자 자체가 일치하는지 비교하려면  equals를 사용
		String s1 = "apple";					// s1, s2는 리터럴로 만들어진 apple을 가리키고 있다
		String s2 = "apple";
		String s3 = new String("apple");		// s3는 새로운 apple을 생성해서 가리키고 있다
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		
		// 바라보는 대상의 위치(주소)는 서로 다르다
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s2 == s3 : " + (s2 == s3));
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println();
		
		// 대상이 서로 달라도 문자열의 내용은 일치한다
		// 자료형의 첫글자가 대문자라면, 일치여부를 == 연산자로 비교하지 않고, equals()를 이용한다
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("s2.equals(s3) : " + s2.equals(s3));
		System.out.println("s1.equals(s3) : " + s1.equals(s3));
	}
}
