package test.test02;

public class CircleWidth {

	public static void main(String[] args) {
		
        // 반지름이 8인 원 객체 생성
        Circle circle = new Circle();
        circle.radius = 8;

        // 원의 넓이 출력
        double area = circle.calwidth();
        System.out.println("원의 넓이 : " + area);

        // 원의 둘레 출력
        double circumference = circle.calwidthdol();
        System.out.println("원의 둘레 : " + circumference);

        // 원 25개의 넓이 출력
        // Overload - 같은 이름의 파라미터가 다른 메소드
        // 파라미터 개수. 파라미터 타입 
        double totalArea = circle.calgat(25);
        System.out.println("원 25개 넓이 : " + totalArea);

	}

}
