/**
 * 2023.03.28[화]
 * 차승헌
 * 반복문 (while)-1~10합계 구하기
 */
package chap5;

public class WhileTest {

	public static void main(String[] args) {
		int sum=0, cnt=1;
		
		while(cnt <= 10)
		{
			sum = sum+cnt;
			cnt = cnt+1;
		}
		System.out.println("while 1~10 합계 : "+sum);
		
		//for
		sum = 0;
		for (int i=1 ; i<=10 ; i=i+1)
		{
			sum = sum + i;
		}
		System.out.println("for 1~10 합계 : "+sum);
	
		//do~while
		sum=0;
		int count=0;
		do
		{
			sum=sum+count;
			count=count+1;
		}while(count <= 10);
		System.out.println("do~while 1~10 합계 : "+sum);
	}
}
