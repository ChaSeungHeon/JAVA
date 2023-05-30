/**
 * add,sub,mul,div 클래스 생성
 * 각 클래스의 공통 필드 메소드
 * -int a,b : 2개의 피연산자
 * -void setValud(int a, int b) : 피 연산자 값 객체 내에저장
 * -int calculate():클래스 목적에 맞는연산 실행 후 결과 return
 * main () 메소드
 * -add,sub,mul,div 객체 생성
 * -setValue,calculate()호출 후 결과 출력
 * 실행 결과
 * - 두 정수 연산자 입력 >> 5 7 *
 *  35
 */
package Test;

import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		int a,b;
		String c;
		Scanner stdin = new Scanner(System.in);
		System.out.print("두 정수 연산자 입력 >> ");
		a = stdin.nextInt();
		b = stdin.nextInt();
		c = stdin.next();
		
		if (c.equals("+"))
		{
			add.setValud(a,b);
			System.out.println(add.calculate());
		}
		else if (c.equals("-"))
		{
			sub.setValud(a,b);
			System.out.println(sub.calculate());
		}
		else if (c.equals("*"))
		{
			mul.setValud(a,b);
			System.out.println(mul.calculate());
		}
		else if (c.equals("/"))
		{
			div.setValud(a,b);
			System.out.println(div.calculate());
		}
		
		

	}

}
