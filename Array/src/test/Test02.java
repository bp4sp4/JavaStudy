package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
//		 배열 값 변경
//		 index 와 값을 차례로 입력 받아서, 아래 배열에 해당하는 index에 값을 바꾸고 출력 하세요.
//		 int[] numbers = {3, 5, 2, 10, 39}
//		 입력 예시
//
//		  변경할 index와 값을 입력하세요 : 2 16
//		 출력 예시
//
//		 3 5 16 10 39 
		int[] numbers = {3, 5, 2, 10, 39};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변경할 index와 값을 입력하세요: ");
		int index = sc.nextInt();
		int value = sc.nextInt();
		
	   if (index >= 0 && index < numbers.length) {
            numbers[index] = value;
        } else {
            System.out.println("잘못된 인덱스값입니다.");
            sc.close();
            return;
            //d
        }
	   for (int number : numbers) {
		   System.out.print(number + " ");
	   }


	}

}
