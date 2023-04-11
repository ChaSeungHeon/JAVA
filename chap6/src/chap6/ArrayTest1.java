package chap6;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int i;
		double sum=0.0,avg;
		double dnum[]=new double[5]; //배열 선언
		System.out.println("dnum의 배열의 길이 : "+dnum.length); //배열 길이
		System.out.println("초기화 하지 않은 dnum[]값 : ");
		
		for(i=0;i<dnum.length;i++)
		{
			System.out.print(dnum[i]+" ");//dnum[]의 목시적 값 출력
		}
		System.out.println();
		
		for(i=0;i<dnum.length;i++)
		{
			System.out.print("dnum["+i+"]번째 데이터 입력");
			dnum[i]=stdin.nextDouble();//dnum[]요소 값 실수로 입력
		}
		for (i=0;i<dnum.length;i++)
		{
			sum=sum+dnum[i]; //dnum[]요소값들 더하기
		}
		System.out.println("배열의 합은 "+sum+"입니다.");
		avg=sum/dnum.length;
		System.out.println("배열의 평균은 "+avg+"입니다.");
	}

}
