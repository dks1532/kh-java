package tv03;

public class Tv {
	// tv의 속성
	String company;	// 아무것도 안넣었을때 디폴트 값: null
	String model;
	int channel;	// 아무것도 안넣었을때 디폴트 값: 0
	int volume;
	boolean power;	// 아무것도 안넣었을때 디폴트 값: false
	
	// 기능(메서드)
	void power() {
		power = !power;
		if(power == true)
			System.out.println("tv를 켭니다");
		else
			System.out.println("tv를 끕니다");
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
	void volumeUp() {
		++volume;
	}
	void volumeDown() {
		--volume;
	}
}
