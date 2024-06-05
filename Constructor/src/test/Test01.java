package test;

public class Test01 {

	public static void main(String[] args) {
		Circle circle = new Circle(8);
//		원의 넓이 : 200.96
//		원의 둘레 : 50.24
//		원 25개 넓이 : 5024.0
		
		// 원의 넓이 
		double area = circle.getarea();
		System.out.println("원의 넓이 : " + area);
		
		// 원의 둘레
		double round = circle.getRound();
		System.out.println("원의 둘레 : " + round);
		
		// 원의 갯수에 따른 넓이
		double area3 = circle.getTotalArea(25);
		System.out.println("원 25개의 넓이 : " + area3);

		
		Product ggang = new Product("새우깡", 1300, "2024-09-12");
		int productprice = ggang.calculatePrice(5);
		System.out.println("제품 5개의 가격 : " + productprice );
		if(ggang.availableSale("2024-06-03")) {
			System.out.println("판매가능 상품");
		} else {
			System.out.println("판매 불가능 상품");
		}
	}

}
