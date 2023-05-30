/**
 * 클래스 외부에서 메소드 호출
 * 반드시 객체를 생성 한 후 호출 해야 한다.
 */
package chap8_1;

public class Calculation_Test {

	public static void main(String[] args) {
		Calculation1 myCalc = new Calculation1();
		myCalc.execute();//객체 외부에서 execute()메소드 호출 (반드시 객체를 생성 한 후 호출 해야 한다.)
	}

}
