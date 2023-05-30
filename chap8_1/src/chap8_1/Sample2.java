package chap8_1;

public class Sample2 {

	public static void main(String[] args) {
		System.out.println("sum:"+(args[0]+args[1])); //매개변수 값 직접 더하기
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println("sum is "+(num1+num2));

	}

}
