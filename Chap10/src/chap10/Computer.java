package chap10;

public class Computer extends Calculator{
	@Override 
	double areaCircle(double r) { //재정의
		System.out.println("Executing areaCircle() of te Calculator object. ");
		return Math.PI*r*r;
}
}
