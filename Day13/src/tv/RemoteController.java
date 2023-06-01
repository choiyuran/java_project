package tv;

public class RemoteController {
	
	TV tv;		// 객체를 참조할 수 있는 참조변수
	
	public void setTv(TV tv) {
		this.tv = tv;
	}

	void tvPower() {
		tv.turn();
	}
	
	void upChannel() {
		tv.channelUp();
	}
	
	void downChannel() {
		tv.channelDown();
	}
	
	void upVolume() { 
		tv.volumeUp();
	}
	
	void downVolume() {
		tv.volumeDown();
	}
	
	void mute() {
		tv.mute();
	}
	
	void setChannel(int channel) {
		tv.setChannel(channel);
	}

}
