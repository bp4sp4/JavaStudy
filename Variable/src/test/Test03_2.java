package test;

import java.util.Scanner;

public class Test03_2 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 // 1. 자릿수 쪼개기(선생님 강의 듣기)
	 System.out.println("입력 : ");
	 String number = sc.nextLine();
	 
	 for (int i = 0; i < number.length(); i++) {
         System.out.println(number.charAt(i));
     }
	 
	 // 2. 자릿수 쪼개기 역순(선생님 강의 듣기)
	 System.out.println("입력 : ");
	 String number2 = sc.nextLine();
	 for( int i = number.length() -1; i>=0; i--) {
		 System.out.println(number.charAt(i));
	 }
	 
	 // 3. 자릿수 합 구하
	 System.out.println("입력 : ");
	 String number3 = sc.nextLine();
	
	 }
	 
	 
	 // 4. 역순 출
	 System.out.println("입력 : ");
	 String number4 = sc.nextLine();
	 
	 
	}

}
