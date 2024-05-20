package test;

import java.util.Scanner;

public class Test03_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 사칙연산
		System.out.println("입력1 : ");
		System.out.println("입력2 : ");
		int a3 = scan.nextInt();
		int a4 = scan.nextInt();
		int sum2 = a3+a4;
		int minus2 = a3-a4;
		int gob2 = a3*a4;
		int divd = a3/a4;
		
		
		System.out.println("덧셉 : " + sum2);
		System.out.println("뺄셈 : " + minus2);
		System.out.println("곱셈 : " + gob2);
		System.out.println("나눗셈 : " + divd);
		
		// 2. 몫과 나머지
		System.out.println("입력1 : ");
		System.out.println("입력2 : ");
		int a5 = scan.nextInt();
		int a6 = scan.nextInt();
		int div = a5/a6;
		int namuzi = a5%a6;
		System.out.println("몫 : " + div + " 나머지 : " + namuzi);

		// 3. 정사각형 넓이
		System.out.println("길이 : ");
		int a1 = scan.nextInt();
		int gob = a1*a1;
		System.out.println("정사각형의 넓이 : " + gob);

		// 4. 삼각형의 넓이
		System.out.println("밑변 : ");
		System.out.println("높이 : ");
		int a7 = scan.nextInt();
		int a8 = scan.nextInt();
		double triangle = (a7*a8)/2.0;
		
		System.out.println("삼각형의 넓이 : " + triangle);
		
		// 5. 교체
		System.out.println("x : ");
		System.out.println("y : ");
		int a9 = scan.nextInt();
		int a10 = scan.nextInt();
		
		System.out.println("x : " + a10 + " y :" + a9);
		
		
		// 6. 초 변환
		System.out.println("초 : ");
		int b1 = scan.nextInt();
		int minit = b1/60;
		int secnd = b1%60;
		
		System.out.println(minit + " 분 " +secnd + " 초 ");
	}

}
