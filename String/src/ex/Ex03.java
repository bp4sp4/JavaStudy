package ex;

public class Ex03 {

	public static void main(String[] args) {
		
		String text = "Hello";
		
		// 문자열 변수는 값뿐만 아니라 
		// 저장된 값을 기반으로 기능을 수행하는 함수(메소드)를 포함한다.
		
		// 문자열 길이 구하기
		int length = text.length();
		
		System.out.println(length);
		
		System.out.println(text.length());
		
		// 특정 위치 에서 문자 구하기
		char alphabet = text.charAt(1);
		System.out.println(alphabet);
		
		// 문자열을 문자들을 통해서 출력
		for(int i = 0; i< text.length(); i++) {
			System.out.print(text.charAt(i));
		}
		System.out.println();
		
		// 문자열 자르기 
		
		String ss = text.substring(0, 4);
		System.out.println(ss);
		
		String sss = text.substring(1, 3);
		System.out.println(sss);
		
		// 특정 문자열로 시작, 끝나는지 확인
		String name = "김인규";
		
		boolean isKim = name.startsWith("김");
		System.out.println(isKim);
		
		// 문자열 일부 바꾸기
		// 인규 -> 선재
		
		String name2 = name.replace("인규", "선재");
		System.out.println(name2);
		
		// 문자열 조개기
		String members = "김인규, 유재석, 하하, 조세호";
		
		// 특정 문자열을 기준으로 문자열을 쪼개기
		String[] names = members.split(",");
		
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "님");
		}
		System.out.println();
		

	}

}
