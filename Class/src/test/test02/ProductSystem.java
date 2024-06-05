package test.test02;

public class ProductSystem {
	String name;
    int price;
    String expirationDate;
    
    // 정보 출력 기능
    void printInfo() {
    	System.out.println("이름 : " + name);
    	System.out.println("가격 : " + price);
		System.out.println("유통기한 : " + expirationDate);
    }
    
    int calculatePrice(int count) {
    	return price * count;
    }

}
