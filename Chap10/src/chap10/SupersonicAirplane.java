package chap10;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	public int flymode = NORMAL;
	
	@Override
	public void fly() {
		if (flymode == SUPERSONIC) {
			System.out.println("supersonic flight");
		}else {
			super.fly(); // Airplane 객체의 fly() 메소드 호출
		}
		
	}
}
