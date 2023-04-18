/**
 * 열거형(enumeration type); 한정된 열거 상수 중에서하나의 상수를 저장하는 타입
 * 열거 상수는 열거 객체로 생성 
 * 클래스처럼 보이게 하는 상수
 * 서로 관련있는 상수들끼리 모아 상수들을 정의 하는 것
 * enum 크래스 형을 기반으로 한 클래스형 선언
 * 
 * (특징)
 * 1.선언된 순서에 따라 0부터 index값을 가진다.
 * 2.상수들은 모두 대문자로 선언한다.
 * 3.마지막에 ;을 찍지 않는다.
 * 4.상수와 특정 값을 연결시킬 경우 마지막에 ;을 붙여야한다.
 * 5.일반적으로 java class파일을 따로 만들어 사용한다.
 */
package chap6;

public class EnumWeek {
	
	public enum Week{
		MONDAY, //열거 상수
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
	}
}
