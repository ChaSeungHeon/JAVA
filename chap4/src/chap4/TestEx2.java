/**
 * 2023.03.28[화]
 * 차승헌
 * 직급과 나이를 입력 받아서 직급이 7 또는 8에겨 내에개 40대이면 "연금 80%"
 * 직급이 5또는6이고 나이가 50대이면 "연급 100%"
 * 그 외의 경우는 "연금 대상자 아님"
 * 을 출력하는 프로그램 
 */
package chap4;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("직급과 나이를 입력 (space로 구분) : ");
		int level = stdin.nextInt();
		int age = stdin.nextInt();
		
		switch (level)
		{
			case 8:
			case 7:
				if (age>=40 && age<50) 
					{
					System.out.print("연금 80%");
					break;
					}
				else 
					{
					System.out.print("연금 대상자 아님");
					break;
					}
			case 6:
			case 5:
				if (age>=50 && age<60)
					{
					System.out.print("연금 100%");
					break;
					}
				else 
					{
					System.out.print("연금 대상자 아님");
					break;
					}
			default:
				System.out.print("연금 대상자 아님");
					
		}
	}

}
