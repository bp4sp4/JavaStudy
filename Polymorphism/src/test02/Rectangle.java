package test02;

public class Rectangle extends Shape {

	
	// 가로, 세로
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "가로 : " + width + " 세로 : " + height;
	}
	
	// 넓이 구하기
	@Override
	public double calculateArea() {
		return width * height;
	}
	
	// 넓이를 출력하는 기능
	@Override
	public void printArea() {
		 System.out.println("사각형의 넓이는 : " + calculateArea());
	}
}
