/**
 * null과 NullPointException
 * 참조변수의 ==얀산 과 equals() 메소드
 * 2023.04.18(화)
 * 202095092 차승헌
 */
package chap6;

public class ArrayReference01 {

	public static void main(String[] args) {
		//int intArray=null;
		//intArray = 10; // Nullpointexception 이라는 에러가 뜸

		String strVal1 = "java";
		String strVal2 = "java";
		
		if(strVal1==strVal2) System.out.println("strVal1 과 strVal2 는 같은 참조값입니다.");
		else System.out.println("strVal1 과 strVal2 는 다른 참조값입니다.");
		
		if(strVal1.equals(strVal2)) System.out.println("strVal1 과 strVal2 는 같은 참조값입니다.");
		
		String strVal3=new String("mklee");
		String strVal4=new String("mklee");
		
		if(strVal3==strVal4) System.out.println("strVal3 과 strVal4 는 같은 참조값입니다.");
		else System.out.println("strVal3 과 strVal4 는 다른 참조값입니다.");
		
		if(strVal3.equals(strVal4)) System.out.println("strVal3 과 strVal4 는 같은 참조값입니다.");
	}

}
