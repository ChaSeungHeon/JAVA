/**
 * 생성자는 호출되지 않는다.
 * 모든 객체는 클래스의 생성자를 호출해야만 생성 된다.
 * 상위 클래스의 기본 생성자(묵시적)가 먼저 호출 된다.
 * super()는 맨 첫줄에 작성하고 부모 클래스의 기본 생성자를 호출 한다.
 * super(매개값...)매개값과 타입이 일치하는 부모 생성자가 없으면 컴파일 에러
 */
package chap10;

public class People {
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
}
