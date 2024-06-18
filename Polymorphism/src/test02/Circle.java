package test02;

public class Circle extends Shape {

	private int radius;
	protected String name;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "반지름 : " + radius;
	}
	
	// 넓이를 구하는 기능
	@Override
	public double calculateArea() {
		return radius * radius * 3.14;
	}
	
	// 넓이를 출력하는 기능
	@Override
	public void printArea() {
		System.out.println("원의 넓이는 : " + calculateArea() + " cm^2입니다.");
	}
}
