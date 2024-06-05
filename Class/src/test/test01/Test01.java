package test.test01;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PhoneData gallaxy = new PhoneData();
		gallaxy.maker = "samsung";
		gallaxy.model = "갤럭시ZFlip3";
		gallaxy.phoneNumber = "010-4710-9210";
		
		PhoneData apple = new PhoneData();
		
		apple.maker = "apple";
		apple.model = "iphone";
		apple.phoneNumber = "010-4722-9210";
		
		System.out.println(gallaxy.maker+ " " + gallaxy.model+ " " + gallaxy.phoneNumber);
		System.out.println(apple.maker+ " " + apple.model+ " " + apple.phoneNumber);
		
	}

}
