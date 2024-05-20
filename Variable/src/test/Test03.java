package test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 컨트롤  쉬프트 O 모든 기능 임포트
		// 1. 입력 출력 
		System.out.println("나이를 입력하세요.");
		int age = scan.nextInt();
		System.out.println("이름 : 박상훈 나이 : " + age);
		
		// 2. 입력과 더하기
		System.out.println("두수를 입력하세요.");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum = a+b;
		System.out.println(a+" + " + b + " = " + sum);
		
		// 3. 입력과 빼기
		System.out.println("두수를 입력하세요.");
		int c = scan.nextInt();
		int d = scan.nextInt();
		int minus = c-d;
		System.out.println(c + " - " + d + " = " + minus);
		
		
		// 4 구구단
		System.out.println("단수 입력하세요.");
		int dan = scan.nextInt();
		for(int i=1; i<=5; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
		
		System.out.println("단수 입력하세요.");
		int dan = scan.nextInt();
		
		// 요런 느낌 
		System.out.println(dan + "X 1 = "+ (dan * 1 ));
		
		
		// 5. 원 넓이 구하기
		System.out.println("지름을 입력하세요.");
		double a1 = scan.nextDouble();
	    double radius = a1 / 2.0; 
	    double pi = 3.14; 
	    double area = pi * radius * radius; 

	     System.out.printf("원의 넓이는 %.2f 입니다", area);
	
	
	}

}
