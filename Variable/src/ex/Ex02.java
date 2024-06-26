package ex;

public class Ex02 {

	public static void main(String[] args) {
		// 문자 저장
		// 퀴즈의 정답은 O 입니다.
		
		char answer = 'O';
		System.out.println("퀴즈의 정답" +answer + " 입니다.");

		// 소수(실수) 저장
		// 원주율은 3.14
		
		double pi = 3.14;
		System.out.println("원주율 : " + pi);
		
		// 형변환 (casting)
		// double -> int 
		
		int intPi = (int) pi;
		System.out.println("정수 pi : " + intPi);
		
		// int -> double
		double doublePi = intPi;
		System.out.println("더블형 Pi : " + doublePi);
		
		// 평균 구하기 
		int score = 95;
		int score2 = 100;
		
		//double avg = (score + score2) / (double)2;
		
		double avg = (score + score2) / 2.0;
		System.out.println("평균 : " + avg);
	}

}
