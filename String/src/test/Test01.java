package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		String txt1 = "Oh";
		String txt2 = "My";
		String txt3 = "God";
		
		System.out.println(txt1 +" " + txt2 + " " + txt3);
		
//		문자열 입력
//		id를 입력 받고, 아래와 같이 환영 메시지를 출력하세요.
//		Welcome! id
//		입력 예시
//
//		ID를 입력 하세요 : hagulu
//		출력 예시

		Scanner sc = new Scanner(System.in);
		System.out.print("ID를 입력 하세요 : ");
	    String id = sc.nextLine();
	
	    System.out.println("Welcome! " + id);
	    
	    
	    
	    String wd = sc.next();
	    String wd2 = sc.next();
	    String wd3 = sc.next();
	    
	    String[] words = new String[3];
//	    words[0] = sc.next();
//	    words[1] = sc.next();
//	    words[2] = sc.next();
	    
	    for (int i = 0; i < words.length; i++) {
	    	words[i] = sc.next();
	    }
	    
	    for (int i = 0; i < words.length; i++) {
	    	System.out.println(words[i]);
	    }
        
        


	}

}
