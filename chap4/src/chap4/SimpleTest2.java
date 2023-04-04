/**
 * 2023.03.28[화]
 * 차승헌
 * 조건문 연습
 */
package chap4;

import java.util.Scanner;

public class SimpleTest2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("성적 입력 : ");
		int grade = stdin.nextInt();
		
		if (grade>=90) System.out.print("A");
		else if (grade>=80) System.out.print("B");
		else if (grade>=70) System.out.print("C");
		else if (grade>=60) System.out.print("D");
		else System.out.print("F");

	}

}
