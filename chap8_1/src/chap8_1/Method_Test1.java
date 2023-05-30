/**
 * 메소드 이름은 자바 식별자 규칙에 맞게 작성
 * 관례적으로 소문자로 작성
 * $,_ 제외한 특수문자 사용 불가
 * 매개변수-메소드가 실행할 때 필요한 데이터를 외부에서 받기 위해 사용
 * (1)매개변수의 개수를 알 수 있는 경우
 * (2)매개변수의 개수를 모를 경우-배열 타입으로 선언
 */
package chap8_1;

class Calculator{
	//리턴 값이 없는 메소드 void
	void poweron() {
		System.out.println("power on");
	}
	//리턴값이 int형인 메소드
	int plus(int x,int y) {
		int result=x+y;
		return result;
	}
	//리턴 값이 double 형인 메소드
	double divide(int x,int y) {
		double result=(double)x/(double)y;
		return result;
	}
	void powerOff() {
		System.out.println("power off");
	}
	
	//매개변수의 개수를 모를 경우1(베열 타입 선언)
	int sum1(int[] values) {
		int sum=0;
		for (int i=0;i<values.length;i++) {
			sum += values[i];
		}
		return sum;
	}
	int sum2(int... values) {
		int sum=0;
		for (int i=0;i<values.length;i++) {
		sum += values[i];
		}
		return sum;
	}
}

public class Method_Test1 {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.poweron();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result 1:"+result1);
		
		byte x=10;
		byte y=4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2:"+result2);
		
		int []values1= {1,2,3};
		int result3=myCalc.sum1(values1);
		System.out.println("result3:"+result3);
		
		int result4=myCalc.sum2(new int[] {1,2,3,4,5});
		System.out.println("result4:"+result4);
		
		int result5=myCalc.sum2(1,2,3);
		System.out.println("result5:"+result5);
		
		myCalc.powerOff();
		

	}

}
