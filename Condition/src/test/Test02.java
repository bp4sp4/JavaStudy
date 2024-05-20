package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("두 점수를 입력하세요 : ");
//
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		if (num1 >= 70 && num2 >= 70) {
//            System.out.println("합격 입니다.");
//        } else {
//            System.out.println("불합격 입니다.");
//        }
		
		
//		System.out.println("수를 입력하세요 : ");
//		
//		int num1 = sc.nextInt();
//		
//		if (num1 % 2 == 0 && num1 % 3 == 0) {
//            System.out.println(num1 + "는 2와 3의 공배수 입니다.");
//        } else {
//            System.out.println(num1 + "는 2와 3의 공배수가 아닙니다.");
//        }
//		
		
		System.out.print("1~10 사이의 수를 입력 하세요 : ");
	     int number = sc.nextInt();
	        
	     if (number >= 1 && number <= 10) {
	         System.out.println("입력하신 수는 " + number + "입니다.");
	     } else {
	         System.out.println("잘못 입력 하셨습니다.");
	     }
		
	}

}
