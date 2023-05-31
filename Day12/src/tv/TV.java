package tv;

// 필드와 메서드
// 필요하다면 생성자를 활용하여
// TV객체의 구성을 클래스로 나타냅니다

// 속성(명사형)은 필드
// 기능(동사형)은 메서드로 나타냅니다

public class TV {

	// 필드
	boolean power;		// = false;
	boolean speaker;	// = false;
	int channel = 1;
	int volume = 1;
	int volume2 = 1;

	// 메서드
	void turn() {
		power = !power;			// power에 true를 넣음
		if(power) {
			System.out.println("전원이 켜졌습니다");			
		}
		if(!power) {
			System.out.println("전원이 꺼졌습니다");
		}
	}
	//음소거
	void speakerTurn() {
		speaker = !speaker;
		if(speaker) {
			if(volume2 != 0) {
				System.out.printf("음소거 해제되었습니다 현재 볼륨 : %d\n", volume2);
			}
		}
		if(!speaker) {
			System.out.println("음소거 되었습니다.");
		}
	}
	
	// 채널 올리기
	void channelUp() {
		if(power) {
			if(channel == 999) {
				channel = 0;
			}
			channel++;
			System.out.printf("채널Up. 현재 채널은 %d번 입니다.\n", channel);	
		}
	}
	// 채널 내리기
	void channelDown() {
		if(power) {
			channel--;
			if(channel == 0) {
				channel = 999;
			}
			System.out.printf("채널Down. 현재 채널은 %d번 입니다\n", channel);
		}
	}
	
	//볼륨 올리기
	void volumeUp() {
		if(power) {				// if(power && speaker)
			if(volume == 20) {
				volume = 0;
			}
			volume++;
			System.out.printf("볼륨 Up. %d\n", volume);
			volume2 = volume;
		}
		else {
			System.out.println("음소거 상태입니다. 음소거를 해제하세요");
		}
	}
	//볼륨 내리기
	void volumeDown() {
		if(power) {		// if(power && speaker)
			volume--;			
			if(volume == 0) {
				volume = 20;
			}
			System.out.printf("볼륨 Down. %d", volume);
			volume2 = volume;
		}
		else {
			System.out.println("음소거 상태입니다. 음소거를 해제하세요");
		}
	}
	
}
