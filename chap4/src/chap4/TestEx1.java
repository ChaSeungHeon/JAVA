/**
 * 2023.03.28[화]
 * 차승헌
 * 두 개의 숫자를 입력 받아서 두 숫자 사이의 홀수값을 모두 더해서 출력하기
 */
package chap4;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("두 개의 숫자 입력 (space로 구분) : ");
		int number1 = stdin.nextInt();
		int number2 = stdin.nextInt();
		int re = 0;
		int holsu1 = 0;
		int holsu2 = 0;
		if (number1>number2)
		{
			while (number1>re)
			{
				if (re%2 != 0)
				{
					holsu1 = holsu1+re;
					re = re+1;
				}
				else re = re+1;
			}
			re = 0;
			while (number2>=re)
			{
				if (re%2 != 0)
				{
					holsu2 = holsu2+re;
					re = re+1;
				}
				else re = re+1;
			}
			System.out.print(number1+"과"+number2+"의 사이 홀수값은 "+(holsu1-holsu2)+"이다.");
		}
		else
		{
			{
				while (number2>re)
				{
					if (re%2 != 0)
					{
						holsu1 = holsu1 + re;
						re = re+1;
					}
					else re = re+1;
				}
				System.out.println(holsu1);
				re = 0;
				while (number1>=re)
				{
					if (re%2 != 0)
					{
						holsu2 = holsu2+re;
						re = re+1;
					}
					else re = re+1;
				}
				System.out.println(holsu2);
				System.out.print(number1+"과"+number2+"의 사이 홀수값은"+(holsu1-holsu2)+"이다.");
			}
		}
			

	}

}
