package chap8_1;

public class Method_Test2 {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5); //Car의 setGas() 메소드 호출
		
		boolean gasState=myCar.isLeftGas(); // Car의 isLeftGas()메소드 호출
		if(gasState) {
			System.out.println("car start.");
			myCar.run(); //Car의 run()메소드 호출
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("no need to inject gas");
		}else {
			System.out.println("inject gas");
		}
		
		myCar.keyTrunOn(); //객체 생성 후 메소드 호출
		myCar.run2();
		int speed = myCar.getSpeed();
		System.out.println("current speed:"+speed+"km/h");
		
		}

	}

