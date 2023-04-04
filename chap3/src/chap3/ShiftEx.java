/**
 * 
 */
package chap3;

import java.util.Scanner;
public class ShiftEx {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("Enter two numbers : ");
		int a = stdIn.nextInt(); // 첫번째 정수 저장
		int b = stdIn.nextInt(); // 두번째 정수 저장
		
		System.out.println("a="+a+"("+Integer.toBinaryString(a)+")");
		System.out.println("b="+b+"("+Integer.toBinaryString(b)+")");
		
		System.out.println("a<<2="+(a<<2)+"("+Integer.toBinaryString(a<<2)+")");
		System.out.println("a>>2="+(a>>2)+"("+Integer.toBinaryString(a>>2)+")");
		
		System.out.println("b<<2="+(b<<2)+"("+Integer.toBinaryString(b<<2)+")");
		System.out.println("b>>2="+(b>>2)+"("+Integer.toBinaryString(b>>2)+")");

	}

}
