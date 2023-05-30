package chap10;

public class ComputerExample {

	public static void main(String[] args) {
		int r=10;
		Calculator calculator = new Calculator();
		//calculator 객체의 원의 넓이
		System.out.println("circle area: "+calculator.areaCircle(r));
		Computer computer = new Computer();
		//computor 객체의 원의 넓이
		System.out.println("circle area: "+computer.areaCircle(r));

	}

}
