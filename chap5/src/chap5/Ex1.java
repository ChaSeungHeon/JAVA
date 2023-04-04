/**
 * 1~1000까지의 정수 중에서 사용자가 입력한 숫자의 배수만을 더하여 출력하는 프로그램
 * for로 작성
 * 2023.03.28 (화)
 * 차승헌
 */
package chap5;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int picknum = stdin.nextInt();
		int hap = 0;
		
		if (picknum < 1 || picknum > 1000)
			System.out.print("1~1000사이의 수만 입력하여주십시오.");
		else
		{
			System.out.print(picknum+"의 배수는 : ");
			for (int i=1; i<=1000;i++)
			{
				if (i%picknum==0)
				{
					System.out.print(i+" ");
					hap = hap+i;
				}
			}
		System.out.println("");
		System.out.print(picknum+"의 배수의 합은 : "+hap);
		}

	}

}
