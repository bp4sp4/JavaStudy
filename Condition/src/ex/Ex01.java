package ex;

public class Ex01 {

	public static void main(String[] args) {
		// 몸무게가 70kg이 넘지 않는다면 치킨을 먹자
		// 만약 몸무게가 70kg 이하라면 치킨 먹자
		// 조건 : 몸무게가 70kg 이하
		// 실행문 : 치킨먹자
		
		int weight = 68;
		
		if (weight > 70) {
			System.out.println("치킨먹자");
		}
		if(weight <= 60 ) {
			System.out.println("폭식");
		}
		if(weight == 68) {
			System.out.println("목표달성!");
		}
		if(weight != 72) {
			System.out.println("72가 아니네");
		}
		
		if(true) {
			System.out.println("조건이 맞다!");
		}
		
		System.out.println(weight <= 70);
		
		boolean result1 = true;
		boolean result2 = weight < 60;
		
		if(result2) {
			System.out.println("폭식!!!!!!");
		}
		
		// 변수 끼리 비교 연산
		int number1 = 5;
		int number2 = 10;
	}
}
