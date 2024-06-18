package test;

public class Rectangle extends Shape {

//	
//	사각형 넓이 250.0 둘레 70.0
//	원 넓이 200.96 둘레 50.24
	
	private int width;
	private int height;
	
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		return width * height;
	}
	
	@Override
	public double calculateRound() {
		return (width+height) * 2;
	}
	
	@Override
	public void printArea() {
		System.out.println("사각형 넓이는 : " + calculateArea());
		System.out.println("사각형 둘레는 : " +calculateRound());
		
	}
}
