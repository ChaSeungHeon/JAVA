/**
 * 메소드 오버로딩
 * 같은 이름의 메소드 여러 개 선언
 * 메소드 오버로딩의 조건은 매개 변수의 타입, 개수, 순서 중 하나라도 달라야 한다.
 * 리턴 타입은 상관없음
 * jvm은 일차적으로 매개변수 타입을 보고, 매개변수 타입이 일치하지 않는 경우 자동 타입 변환이
 * 가능한지 검사한다.
 */
package chap8_1;

public class Rectangle {
	//필드
	
	//생성자
	
	//메소드(오버로딩)
	
	double areaRectangle(double width) { //정사갹형 넓이
		return width*width;
	}
	
	double areaRectangle(double width, double height) { //직사각형 넓이
		return width*height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
