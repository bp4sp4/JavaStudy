package test;

import java.util.Scanner;

public class Test03_2 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 // 1. 자릿수 쪼개기(선생님 강의 듣기)
	
	 System.out.println("입력 : ");
	 int num = sc.nextInt();
	 
	 int result = num / 1000;
	 System.out.println(result);
	 
	 num = num  % 1000;
	 result = num / 100;
	 System.out.println(result);
	 
	 num = num % 100;
	 result = num / 10;
	 System.out.println(result);

	 num = num % 10;
	 System.out.println(num);

	 // 2. 자릿수 합 구하
	 System.out.println("입력 : ");
	 int num2 = sc.nextInt();
			 
	 System.out.println(num2 % 10);
	 
	 num2 = num2 / 10;
	 System.out.println(num2 % 10);
	 
	 num2 = num2 / 10;
	 System.out.println(num2);
	 }
	 
	 
//	 // 4. 역순 출력 
//	 System.out.println("입력 : ");
//	 String number4 = sc.nextLine();
//	 
//	 

}
