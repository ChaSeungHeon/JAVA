/**
 * 산술 연산
 * 2023.03.21 [화]
 * 차승헌
 */
package chap3;

public class ArithmeticEx1 {

	public static void main(String[] args) {
		int a=5, b=2;
		int sum=a+b;
		int mod=a%b;//나머지 연산
		int c=++a;//전위 연산
		int d=b++;//후위 연산
		
		System.out.println("a+b = "+sum);
		System.out.println("a%b = "+mod);
		System.out.println("a 전위 증가 연산 = "+c);
		System.out.println("a 변수의 값 = "+a);
		System.out.println("b 후위 증가 연산 = "+d);
		System.out.println("b 변수의 값 = "+b);
	}

}
