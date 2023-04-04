/**
 * 2023.03.28[화]
 * 차승헌
 * 구구단
 */
package chap5;

import java.util.Scanner;

public class GugudanTest1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("단을 입력 : ");
		int gugu = stdin.nextInt();
		
		System.out.println(""+gugu+"단 출력");
		for (int i=1;i<=9;i++)
		{
			System.out.println(gugu+"*"+i+"="+(gugu*i));
		}

	}

}
