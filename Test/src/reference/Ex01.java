package reference;

import java.util.Scanner;

class Phone{
	private String msg;
	private String name;
	
	public Phone(String name, String msg) {
		this.name = name;
		this.msg = msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	void receive(Phone sender, String msg) {		// 문자를 받음
		this.setMsg(msg);
		System.out.printf("보낸 사람 : %s\n", sender.name);
		System.out.printf("받은 사람 : %s\n", this.name);
		System.out.printf("문자 내용 : %s\n", msg);
		
	}

	void send(Phone other, String msg) {		// 답장을 보냄
		other.setMsg(msg);
		System.out.printf("받은 사람 : %s\n", other.name);
		System.out.printf("보낸 사람 : %s\n", this.name);
		System.out.printf("문자 내용 : %s\n", msg);
	}
	
	
}

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg;
		System.out.print("문자 전송 : ");
		msg = sc.nextLine();

		Phone ph1 = new Phone("철수", msg);
		Phone ph2 = new Phone("유리", msg);
		
		ph2.receive(ph1, msg);			// ph2가 ph1한테 문자를 받음(유리가 문자 받음)
		
		System.out.println();
		System.out.print("답장 전송 : ");
		msg = sc.nextLine();
		ph2.send(ph1, msg);				// ph2가 ph1한테 답장 보냄(유리가 철수한테 답장 보냄)
		System.out.println();

		sc.close();
	}
}
