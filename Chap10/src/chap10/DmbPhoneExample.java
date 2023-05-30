package chap10;

public class DmbPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone 객체생성
		DmbCellphone dmbCellPhone = new DmbCellphone("java phone","black",10);
		
		//Cellphone 클래스로부터 상속받은 필드
		System.out.println("model: "+dmbCellPhone.model);
		System.out.println("color: "+dmbCellPhone.color);
		
		//DmbCellPhone 클랫의 필드
		System.out.println("channel: "+dmbCellPhone.channel);
		
		//CelPhone 클래스로부터 상속받은 메소드 호출
		dmbCellPhone.poweron();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("hello");
		dmbCellPhone.receiVoice("hello! i'm gildong");
		dmbCellPhone.sendVoice("nice to meet you");
		dmbCellPhone.hangUp();

		//dmbCellPhone 클래스의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
