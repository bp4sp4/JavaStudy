package ex;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		// 츄파춥스 가격을 입력받고, 3의 가격을 출력 한다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("츄파츕스 가격을 입력하세요 :");
		int candy = scan.nextInt();
		
		int total = candy * 3;
		System.out.println("츄파츕스 3개의 가격 : " + total);
		
		// 두개의 수를 한번에 입력 받기
		// 츄파츕스 가격과 개수를 입력 받고 계산 결과를 출력하는 프로그램
		
		System.out.println("츄파츕스 가격을 입력하세요.");
		candy = scan.nextInt();
		System.out.println("개수를 입력하세요.");
		int count = scan.nextInt();
		
		total = candy * count;
		
		System.out.println("츄파츕스 " + count + "개의 가격" + total + "원 입니다.");
	}

}
