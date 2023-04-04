/**
 * 2023.03.28[화]
 * 차승헌
 * 조건문 연습
 */
package chap4;

import java.util.Scanner;

public class SimpleTest3 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("성적 입력 : ");
		int grade = stdin.nextInt();
		
		switch (grade/10)
		{
			case 10:
			case 9: 
				System.out.print("A"); 
				break;
			case 8: 
				System.out.print("B"); 
				break;
			case 7: 
				System.out.print("C"); 
				break;
			case 6: 
				System.out.print("D"); 
				break;
			default: 
				System.out.print("F"); 
				break;

		}
	}

}
