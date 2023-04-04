/**
 * 윤년 계산 프로그램
 * 조건 1 : 4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으면 윤년이다.
 * 조건 2 : 400으로 나누어 떨어지는 해도 윤년에 포함된다.
 * 실행결과 년도 입력 : 2020
 * 2020년은 윤년입니다.
 * 2023.03.21[화]
 * 차승헌
 */
package chap3;

import java.util.Scanner;

public class OpEx02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = stdIn.nextInt();
		
		String yoonyear;
		yoonyear = year%4 ==0  && year%100 !=0 || year%400 == 0 ? "윤년입니다.":"윤년이 아닙니다.";
		System.out.printf("입력하신 "+year+"년은 "+yoonyear);

	}

}
