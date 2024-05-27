package ex;

public class Ex01 {

	public static void main(String[] args) {
		// 여러개의 값을 저장할 배열 선언
		// 어떤 값이 당장 저장 될지는 모르지만, 정수 10개를 저장할 공간 확보
		int[] numbers = new int[10]; 
		
		int[] scores = {90, 95, 85, 100, 80};
		
		System.out.println(scores[2]);
		System.out.println(scores[0]);
		System.out.println(scores[4]);
		
		scores[3] = 90;
		
		int index = 2;
		System.out.println(scores[index]);
		System.out.println(scores[index -1]);
		
//		System.out.println(scores[index + 4 ]);
		
		for(int i =0; i < 5; i++) {
			System.out.print(scores[i] +  "");
		}
		System.out.println();
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum +=scores[i];
		}
		System.out.println("총합 : " + sum);
	}

}
