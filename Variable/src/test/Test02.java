package test;

public class Test02 {

	public static void main(String[] args) {
		
		int score = 90;
		char grade = 'A';
		double  point = 4.0; 
		
		System.out.println("시험 적" +score + "점 이상이면 " +grade + "학점이고 평점은 " + point + " 입니다." );
		
		score = 80;
		grade = 'B';
		point = 3.0;
		
		System.out.println("시험 성적" +score + "점 이상이면 " +grade + "학점이고 평점은 " + point + " 입니다." );
		
		int number1 = 33;
		double number2 = 35.325;
		
		double result  = number1 * number2;
		System.out.println("두수의 합 : " + result);
		
		int hour = 943;
		System.out.println(hour + "시간" + (hour/ 24)+ " 일입니다.");
		
		int width = 8;
		int height = 9;
		int wh = width * height;
		
		System.out.println("사각형의 넓이 : " + wh);
		System.out.println("삼각형의 넓이 : " +(double)wh/2 );
		
		
		int kr = 93;
		int mh = 88;
		int eng = 94;
		double avg = (kr + mh + eng) / 3.0;
		
		System.out.println("평균은 : "+ avg);
		
		int cel = 30;
		
		double fahren = 9 / 5.0 * cel + 32;
		System.out.println("섭씨 : " + cel + " 화씨 : " + fahren);
		
	}

}
