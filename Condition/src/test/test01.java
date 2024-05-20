package test;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("수를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		if(num < 10) {
//			System.out.println(num + " 은 10보다 작습니다.");
//		}
//		System.out.println("두개의 수를 입력하세요 : ");
//
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		if (a > b ) {
//			System.out.println(">");
//		} else if ( a <b ) {
//			System.out.println("<");
//		} else if ( a == b ) {
//			System.out.println("==");
//		}
		
//		
//		System.out.println("시험성적을 입력하세요 : ");
//
//		int result = sc.nextInt();
//		
//		if (result <= 70) {
//			System.out.println("합격 입니다.");
//		}

		System.out.println("수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
	    if (num % 2 == 1) {            
	    	System.out.println("홀수");        
	    } else {            
	    	System.out.println("짝수");        
	    }
	}

}
