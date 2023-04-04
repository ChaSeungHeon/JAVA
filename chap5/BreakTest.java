/**
 * 2023.04.04
 * 차승헌
 * 숫자를 반복적으로 입력 받아서 정수의합이 1000이상이 되면 1000을 넘은 수와 평균을 출력
 */
package chap5;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int i=0;
		int total=0;
		int num=0;
		while (true)
		{
			num=0;
			System.out.print("정수 하나를 입력하십시오. : ");
			num = stdin.nextInt();
			total += num;
			i++;
			System.out.println("지금 까지의 합계는 : "+total);
			if (total>1000) break;
		}
		System.out.print("1000을 넘은수는 : "+num+" 평균값은 : "+(total/i));
	}

}
