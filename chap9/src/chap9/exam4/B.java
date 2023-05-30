package chap9.exam4;

public class B {
	public B() {
		A a = new A();
		a.field1=1;
		a.field2=1;
		//a.field3=1; //(x) private 접근 불가
	
		a.method1();
		a.method2();
		//a.method3(); //(x) private 접근 불가
	}
}
