package test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
//		문자열 변환
//		아래 문자열에서 A 를 B로 바꿔서 출력 하세요.
//		String gradeString = "My grade is A";
//		출력 예시
//
//		My grade is B
		
		String gradeString = "My grade is A";
		String newgradeString = gradeString.replace("My grade is A", "My grade is B");
		System.out.println(newgradeString);
		
//		문자열 자르기
//		아래와 같이 전화번호가 저장되어 있을 때 출력예시와 같은 형태로 -를 포함하여 출력하세요.
//		String phoneNumber = "01012345678";
//		출력 예시
//
//		010-1234-5678
		
		String phoneNumber = "01012345678";
		String pn = phoneNumber.substring(0, 3) + "-" +
                	phoneNumber.substring(3, 7) + "-" +
                	phoneNumber.substring(7);

		System.out.println(pn);
		
//		문자열 정수 변환
//		아래와 같이 생년월일이 저장된 String 이 있을 때 올해 나이를 출력 하세요 (한국 나이)
//		String birthString = "19950721";
//		출력 예시
//
//		1995년생의 나이는 29살
		
		String birthString = "19950721";
		
		
		
		Scanner sc = new Scanner(System.in);

        System.out.print("단어를 입력하세요 : ");
        String word = sc.nextLine();

        int cnt = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e') {
                cnt++;
            }
        }

        System.out.println("e의 개수는 " + cnt + "개 입니다.");
        
//        단어 수 세기
//        아래 문자열의 단어 개수를 출력 하세요.(중복 포함)
//        String sentence = "To be, or Not to Be. That Is The Question";
//        출력 예시
//
//        단어 개수 : 10
        
        String sentence = "To be, or Not to Be. That Is The Question";
        
	}
	
	

}
