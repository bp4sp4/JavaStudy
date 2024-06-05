package test.test02;

public class Product {

	public static void main(String[] args) {
		
		ProductSystem ggang = new ProductSystem();
		ggang.name = "새우깡";
		ggang.price = 1300;
		ggang.expirationDate = "2021-03-02";
		
		ggang.printInfo();
		
		int area = ggang.calculatePrice(13);
		System.out.println("5개의 가격 : " + area);

		// 판매 가능여부 확인 가능
		// today : ex) 2024-06-03
		boolean availableSale(String today){
			
		}
	}

}
