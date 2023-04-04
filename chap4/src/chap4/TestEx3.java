/**
 * 2023.03.28[화]
 * 차승헌
 * 입력된 숫자가 양수, 0, 음수인지 판별하는 프로그램 작성 
 */
package chap4;

import java.util.Scanner;

public class TestEx3 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자 하나 입력 : ");
		int check = stdin.nextInt();
		
		if (check > 0) System.out.print("입력된 "+check+"는 양수 입니다.");
		else if (check == 0) System.out.print("입력된 "+check+"는 0입니다.");
		else System.out.print("입력된 "+check+"는 음수입니다.");

	}

}
