/**
 * 실수타입 - 묵시적으로 double형으로 처리
 * float 뒤에 반드시 f[F] 붙여야 한다.
 * 2023.03.21[화]
 * 차승헌
 */
package chap3;

public class TypeFloat {

	public static void main(String[] args) {
		//실수값 저장
		//float var1=3.14; // 컴파일 에러
		float var2=3.14f;
		double var3 = 3.14;
		
		//정밀도 확인
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		//e 사용
		double var6=3e6; //3*10^6
		double var7=2e-3; //2*(1/10)^3
		
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);

	}

}
