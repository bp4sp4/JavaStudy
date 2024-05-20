package ex;

public class Ex02 {

	public static void main(String[] args) {
		int walking = 10002;
		int weight = 72;
		
		// 만보를 걷고 몸무게가 70kg 가 넘지 않으면 치킨 먹자
		// 만약 만보를 걷는다 몸무게가 70kg 이하이다. 그러면 치킨 먹자
//		if(walking >= 10000 && weight <= 70) {
//			System.out.println("치킨먹자!");
//		}
		
		// 만보를 걷거나 몸무게가 70kg 가 넘지 않으면 치킨 먹자
		// 만약 만보를 걷는다 또는 몸무게가 70이하다. 그러면 치킨 먹자
		if(walking >=10000 || weight <=70 ) {
			System.out.println("치킨먹자");
			
		}
		
		int number= 20;
		// 10 < number < 40
		// 10보다 크코 40 보다 작다.
		// 만약 10보다 크고 그리고  40보다 작다.
		if(10 < number &&  number< 40) {
			System.out.println("10보다 크고 40보다 작다.");
		}
		
		// number <= 10, number >= 40
		
		if(number <=10 || number >=40) {
			System.out.println("10보다 작거나 40보다 큰 수 ");
		}
	}

}
