/**
 * 2023 - 04 - 11 [화]
 * 1차원 배열에서 입력받은 값 검색하기 (선형 검색)
 * 202095092 차승헌
 */
package chap6;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		int inum[]= {8,7,3,6,8,7,0,4,1,2};
		Scanner stdin=new Scanner(System.in);
		System.out.print("input number : ");
		int key = stdin.nextInt();
		int cnt=0; // 동일한 데이터의 갯수
		for(int i=0;i<inum.length;i++)
		{
			if(key==inum[i])
			{
				cnt++;
				System.out.println((i+1)+"match");
			}
		}
		if (cnt==0)
			System.out.print(key+"not match");
		else
			System.out.print(key + "is" +cnt);
	}

}
