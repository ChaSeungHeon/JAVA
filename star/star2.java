package star;

import java.util.Scanner;

public class star2 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("원하는 별 층을 입력하시오 : ");
		int star = num.nextInt();
		
		for(int i=1;i<=star;i++)
		{
			for(int j=star;j>=i;j--) System.out.print("*");
			System.out.println();
		}
	}

}
