package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		int year = 2000;
        int month = 11;
        int day = 15;
        
        String yearString = String.valueOf(year);
        String monthString = String.valueOf(month);
        String dayString = String.valueOf(day);
        
        System.out.println(yearString + monthString + dayString);
        
//        문자열 정수 변환
//        아래와 같이 생년이 저장된 String 이 있을 때 올해 나이를 출력 하세요 (한국 나이)
//        String yearString = "1995";
//        출력 예시
//
//        1995년생의 나이는 29살
        
        Scanner sc = new Scanner(System.in);
        
       
        String yearString2 = sc.nextLine();
        int birthYear = Integer.parseInt(yearString);
        int koreaAge = birthYear+1;
        System.out.println(yearString + "년생의 나이는 " + koreaAge + "살");

//        
//        개수 세기
//        아래 배열에 물품 목록이 저장되어 있다.
//        String[] goods = {"새우깡", "육개장", "신라면", "코카콜라", "육개장", "육개장", "새우깡", "신라면"};
//        제품명을 입력받고 해당 제품이 배열에 몇 개 있는지 출력하세요.
//        입력 예시
//
//        제품명 : 육개장
//        출력 예시
//
//        3개
        
        String[] goods = {"새우깡", "육개장", "신라면", "코카콜라", "육개장", "육개장", "새우깡", "신라면"};
        
        System.out.print("제품명 : ");
        String goodsmenu = sc.nextLine();

        int count = 0;
        for (String item : goods) {
            if (item.equals(goodsmenu)) {
                count++;
            }
        }

        System.out.println(count + "개");
        
	}

}
