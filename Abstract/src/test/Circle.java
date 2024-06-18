package test;

public class Circle extends Shape {
	
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return radius * radius * 3.14;
	}

	@Override
	public double calculateRound() {
		return 2 * 3.14 * radius;
	}

	@Override
	public void printArea() {
		System.out.println("원의 넓이는 : " + calculateArea());
		System.out.println("원의 둘레는 : " + calculateRound());
		
	}

}
