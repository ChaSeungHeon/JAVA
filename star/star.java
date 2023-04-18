package star;

import java.util.Scanner;
public class star {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("원하는 별 층을 입력하십시오 : ");
		int star = num.nextInt();
		for (int i=1;i<=star;i++)
		{
			for (int j=0;j<i;j++) System.out.print("*");
			System.out.println();
		}

	}

}
