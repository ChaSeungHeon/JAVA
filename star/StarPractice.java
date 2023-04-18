package star;

import java.util.Scanner;

public class StarPractice {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("원하는 별 층을 입력하시오 : ");
		int star = num.nextInt();
		
		for(int i=1;i<=star;i++)
		{
			for(int j=star;j>i;j--) System.out.print(" ");
			for(int k=0;k<i;k++) System.out.print("*");
			for(int l=1;l<i;l++) System.out.print("*");
			System.out.println();
		}
		
		for(int i=1;i<=star;i++)
		{
			for(int k=0;k<i;k++) System.out.print(" ");
			for(int j=star;j>i;j--) System.out.print("*");
			for(int l=star-1;l>i;l--) System.out.print("*");
			System.out.println();
		}

	}

}
