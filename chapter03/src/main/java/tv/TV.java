package tv;

public class TV {
	private int channel; // 제약조건 1~255
	private int volume; // 0~100
	private boolean power;

	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void status() {// 티비상태출력
		System.out.println("TV [channer1=" + channel + ", volume=" + volume + ", power=" + power + "]");
	}

	public void power(boolean on) {// 티비 전원상태

		power = on;
	}

	public void volume(int volume) {// 볼륨조절

		if(volume >100) {
			this.volume = 0;
		}
		else if(volume < 0) {
			this.volume = 100;
		}

	}

	public void volume(boolean on) {
		

		volume( on ? this.volume+1 : this.volume-1);
		
	}

	public void channel(int channel) {
		
		if(channel >255) {
			this.channel = 0;
		}
		else if(channel < 0) {
			this.channel = 255;
		}
		
		this.channel = channel;
		
	}

	public void channel(boolean on) {
		//channel( channel + (on ? 1 : -1)); 
		//volume( on ? this.volume+1 : this.volume-1); 틀린예
		if(on) {
			channel(channel +1);
		}
		else {
			channel(channel -1);
		}
	
	}

}
