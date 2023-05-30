package chap08;

public class Car1Test {

	public static void main(String[] args) {
		Car1 car1 = new Car1();
		System.out.println("car1.conpany : " + car1.company);
		System.out.println();
		  
		Car1 car2 = new Car1("자가용");
		System.out.println("car2.conpany : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		  
		Car1 car3 = new Car1("자가용", "빨강");
		System.out.println("car3.conpany : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		  
		Car1 car4 = new Car1("택시", "검정", 200);
		System.out.println("car4.conpany : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);

	}

}
