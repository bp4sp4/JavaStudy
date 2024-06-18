package test;	

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Product pd1 = new Product("육개장", 1200, 150);
        Product pd2 = new Product("육개장", 850, 30);
        Product pd3 = new Product("천마표팝콘", 1500, 0);
        
        List<Product> productList = new ArrayList<>();
        
        productList.add(pd1);
        productList.add(pd2);
        productList.add(pd3);
		
//		for(Product product:productList ) {
//			System.out.println("제품명 : " + product.getProductName() + " 가격 : " + product.getProductPrice() + " 재고 : " +product.getProductInventory());
//		}
		
//		2. 제품 제거
//		재고가 없는 상품을 리스트에서 삭제하고, 전체 리스트를 출력 하세요.
//		출력 예시
//
//		[(제품명 : 새우깡 가격 : 1200 재고 : 150), (제품명 : 육개장 가격 : 850 재고 : 30), (제품명 : 신라면 가격 : 800 재고 : 15)]
		
//		 Iterator<Product> iterator = productList.iterator();
//	        while (iterator.hasNext()) {
//	            Product product = iterator.next();
//	            if (product.getProductInventory() == 0) {
//	                iterator.remove();
//	            }
//	        }
//	        for (Product product : productList) {
//	            System.out.println(product);
//	        }
//	        
//	        3. 제품 판매
//	        판매한 제품명과 개수를 입력 받고, 가격을 계산하고, 재고 개수를 업데이트 하세요.
//	        계산된 가격과 제품 리스트를 출력 하세요.
//	        입력 예시
//
//	        상품명 : 육개장
//	        개수 : 7
//	        출력 예시
//
//	        가격 : 5950원
//	        [(제품명 : 새우깡 가격 : 1200 재고 : 150), (제품명 : 육개장 가격 : 850 재고 : 23), (제품명 : 신라면 가격 : 800 재고 : 15)]
	        
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.print("상품명 : ");
	        String productName = sc.nextLine();
	        
	        System.out.print("개수 : ");
	        int price = sc.nextInt();
	        
	        for(Product product:productList) {
	        	int totalPrice = product.getProductInventory() * price;	       
                    product.setProductInventory(product.getProductInventory() - price);
                    System.out.println("가격 : " + totalPrice + "원");
	        }
	        
	        System.out.println(productList);
	        

	        
	        
	}
	
	

}
