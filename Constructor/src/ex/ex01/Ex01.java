package ex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		Person me = new Person("박상훈", "19981027");
//		me.name = "박상훈";
//		me.birthday = "1998/10/27";
		me.printInfo();
		
//		me.name = "김이박";
		me.setName("김이박");
		me.printInfo();
		
		// 생년월일 출력
		System.out.println(me.getBirthday());
	}

}
