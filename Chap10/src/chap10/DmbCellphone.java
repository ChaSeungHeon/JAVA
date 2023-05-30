/**
 * 여러개의 부모클래스 상속 안됨 -extends 뒤에는 단 하나의 부모 클래스만..
 * private 접근 제한을 갖는 필드와 메소드는 상속 대상에서 제외
 */
package chap10;

public class DmbCellphone extends Cellphone {
	//필드
	int channel;
	//생성자
	DmbCellphone(String model, String color, int channel){
		this.model = model; //상속받은 필드
		this.color = color; //상속받은 필드
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("channel" + "channel" + "DMB Start receiving broadcasts.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("channel" + channel + " change. ");
	}
	void turnOffDmb() {
		System.out.println("DMB end of broadcast reception");
	}
}
