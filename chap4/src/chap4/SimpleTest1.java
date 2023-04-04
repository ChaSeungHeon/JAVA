/**
 * 2023.03.28[화]
 * 차승헌
 * 조건문 연습
 */
package chap4;

import java.util.Scanner;

public class SimpleTest1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("성적 입력 : ");
		int grade = stdin.nextInt();
		
		if (grade >= 90)
		{
			System.out.println("통과");
			System.out.println("합격!");
			System.out.print("축하합니다.");
		}
		else
			System.out.print("불합격!");
	}

}
