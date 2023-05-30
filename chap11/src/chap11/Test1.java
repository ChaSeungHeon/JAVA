package chap11;

import java.util.Scanner;

abstract class calculator{
	abstract void cal(double a, double b);
}
class add extends calculator{
	void cal(double a, double b) {
		System.out.println(a+"+"+b+"="+(a+b));
	}
}
class sub extends calculator{
	void cal(double a, double b) {
		System.out.println(a+"-"+b+"="+(a-b));
	}
}
class mul extends calculator{
	void cal(double a, double b) {
		System.out.println(a+"X"+b+"="+(a*b));
	}
}
class div extends calculator{
	void cal(double a, double b) {
		System.out.println(a+"/"+b+"="+(a/b));
	}
}
public class Test1 {

	public static void main(String[] args) {
		double a,b;
		String c;
		Scanner stdin = new Scanner(System.in);
		System.out.print("두 정수 연산자 입력 (a + b) >> ");
		a = stdin.nextInt();
		c = stdin.next();
		b = stdin.nextInt();
		calculator check = new add();
		if (c.equals("+"))
		{
			check.cal(a,b);
		}
		else if (c.equals("-"))
		{
			check = new sub();
			check.cal(a,b);
		}
		else if (c.equals("*"))
		{
			check = new mul();
			check.cal(a,b);
		}
		else if (c.equals("/"))
		{
			check = new div();
			check.cal(a,b);
		}

	}

}
