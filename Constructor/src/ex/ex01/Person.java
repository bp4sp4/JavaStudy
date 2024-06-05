package ex.ex01;

public class Person {
	
	// 이름 , 생년월일
	private String name;
	private String birthday;
	
	
	// 기본 생성자
//	public Person() {
//		System.out.println("생성!!");
//	}
	
	// Name 값 수정 기능
	// setter 는  void (리턴 값)
	// this를 붙인다.
	public void setName(String name) {
		this.name = name;
	}
	
	// birthday 값 리턴 가능
	// getter는 멤버변수타입 + get(변수명)
	// return 변수명
	public String getBirthday() {
		return birthday;
	}
	

	public Person(String name, String birthday) {
		this.name = name;
		this.birthday = birthday;
	}
	
	// 정보 출력 기능
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("생년월일 : " + birthday);
	}
	
	
}
