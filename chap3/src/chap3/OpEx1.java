/**
 * 동전교환 프로그램
 * 입력된 액수만큼 500원, 100원, 50원, 10원짜리 동전으로 교환해주는 프로그램 작성
 * 조건 1 : 동전의 총개수를 최소화
 * 조건 2 : 고액의 동전 우선 교환
 * 2023.03.21[화]
 * 차승헌
 */
package chap3;

import java.util.Scanner;
public class OpEx1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("가지고있는 돈 입력 : ");
		int coin = stdIn.nextInt();
		
		int coin500 = coin/500;
		int coin500A = coin%500;
		int coin100 = coin500A/100;
		int coin100A = coin500A%100;
		int coin50 = coin100A/50;
		int coin50A = coin100A%50;
		int coin10 = coin50A/10;
		int lastcoin = coin50A%10;
		
		System.out.println("현재 가지고 있는 돈은 "+coin+"원이고 동전으로 교환하면");
		System.out.println("500원짜리는 "+coin500+"개");
		System.out.println("100원짜리는 "+coin100+"개");
		System.out.println("50원짜리는 "+coin50+"개");
		System.out.println("10원짜리는 "+coin10+"개이고");
		System.out.println("남은 잔돈은 "+lastcoin+"원입니다.");
		
	}

}
