package tv;

public class Main {
	public static void main(String[] args) {
		
		// 객체 생성
		TV tv = new TV();
		
		System.out.println("현재 티비 상태1 :");
		tv.turn();
		tv.speakerTurn();
		tv.channelDown();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeDown();
		System.out.println();
		System.out.println();
		
		System.out.println("현재 티비 상태2 :");
		tv.turn();
		tv.speakerTurn();
		System.out.println();
		
		System.out.println("현재 티비 상태3 :");
		tv.turn();
		tv.speakerTurn();
		tv.channelUp();
		tv.channelDown();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeDown();
		System.out.println();
		System.out.println();
		
		System.out.println("현재 티비상태4 :");
		tv.turn();
		tv.speakerTurn();
		System.out.println();
		
		System.out.println("현재 티비 상태5 :");
		tv.turn();
		tv.channelUp();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.channelDown();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeDown();
		System.out.println();
		
	
		

	}
}
