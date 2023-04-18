/**
 * Array 클래스 - System.arraycopy(str1, 0, str2, 0, len)
 * 				str1배열의 인덱스 0 ~ str2 배열의 인덱스 0에 len 만큼 복사
 * 2022.04.18[화]
 * 202095092 차승헌
 */
package chap6;
import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int num1[] = {10,20,30};
		int num2[] = {40,50,60};
		
		String str3[] = {"java","array","copy"};
		String str4[] = new String[5]; //str4는 null로 초기화
		
		//배열 요소 값들 각각 복사
		for (int i=0; i < num1.length;i++) num2[i]=num1[i];
		
		System.out.print("num2 값은 : ");
		for (int i:num2) System.out.print(i + " "); //num2 출력 [10,20,30]
		
		//System.araycopy()로 복사
		System.arraycopy(str3, 0, str4, 0, 3);
		
		System.out.print("\nstr4 값은 : ");
		for (String value:str4) System.out.print(value + " "); //str4 출력 복사되자 않은 항목은 초기값 출력
		
		//Arrays.copyOf()로 복사
		String str5[] = Arrays.copyOf(str3,2); //str3 배열의 인덱스 0~길이 2만큼 str5에 복사
		
		System.out.print("\nstr5 값은 : ");
		for (String value1:str5) System.out.print(value1+" "); //str5 출력
		
	}

}
