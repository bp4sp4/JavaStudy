package test;

public class Circle {
	
//	출력 예시
//
//	원의 넓이 : 200.96
//	원의 둘레 : 50.24
//	원 25개 넓이 : 5024.0
	private double radius;
	
	 public Circle(double radius) {
	        this.radius = radius;
	    }
	
	// 원의 넓이 구하기
    public double getarea() {
        return 3.14 * radius * radius;
    }

    // 원의 둘레 구하기
    public double getRound() {
        return 2 * 3.14 * radius;
    }

    // 개수에 따른 원의 넓이 구하기
    public double getTotalArea(int count) {
        return getarea() * count;
    }
	
	
}
