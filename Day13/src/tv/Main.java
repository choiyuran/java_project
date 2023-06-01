package tv;

public class Main {
	public static void main(String[] args) {
		TV tv = new TV();
		RemoteController remocon = new RemoteController();
		
		// 리모컨의 메서드를 호출하면, TV의 기능이 작동하도록 코드를 작성하여
		// 아래에서 테스트하세요
		
//		tv.turn();
//		tv.volumeUp();
		
		remocon.setTv(tv);
		System.out.println("1) 전원을 켜고 볼륨 및 채널 테스트");
		remocon.tvPower();
		
		for(int i = 0; i < 250; i++) {
			remocon.upChannel();
		}
		
		for(int i = 0; i < 105; i++) {
			remocon.upVolume();
		}
		
		System.out.println("2) 음소거 테스트");
		for(int i = 0; i < 42; i++) {
			remocon.downVolume();
		}
		remocon.mute();
		remocon.mute();
		
		System.out.println("3) 전원을 off했을 경우 작동하지 않아야 한다");
		remocon.tvPower();
		for(int i = 0; i < 3; i++) {
			remocon.downChannel();
		}
		remocon.tvPower();
		
		remocon.setChannel(45);
		remocon.setChannel(245);
	}
}
