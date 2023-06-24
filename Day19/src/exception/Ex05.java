package exception;

public class Ex05 {
//	throw : callee(호출 당하는 함수) 에서 발생한 예외를 caller(대상을 호출하는 함수) 에게 전가시킨다
//	callee 에서 직접 처리하기 위한 것은  try ~ catch 구문
//	예외를 무한정 전가시키기 위함이 아니다
//	하위 코드에서  발생한 예외를 적절한 상위 단계에서 모아서 일괄적으로 처리하고
//	예외 처리의 효율성을 증대시키기 위한 문법이다
//	try(실행할 문장), catch(예외 처리 부분), finally(무조건 실행)
//	throw(to catch), throws(to caller) - 예외 전가
//	class MyException extends Exception -> 예외 클래스를 상속받아 직접 원하는 예외 클래스를 작성
	
	public static void main(String[] args) throws InterruptedException {
		
		for(int i = 5; i != -1; i--) {
			System.out.println(i);
//			try {
				Thread.sleep(1000);
//			} catch(InterruptedException e) {}
		}
		System.out.println("End");
		
	}
}
