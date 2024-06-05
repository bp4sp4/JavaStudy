package test;

public class Product {

	private String name;
    private int price;
    private String expiration;
   
    public Product (String name, int price, String expiration) {
    	this.name = name;
    	this.price = price;
    	this.expiration = expiration;
    }
    
    public int calculatePrice(int count) {
		return price * count;
    }
    
    public void printInfo () {
    	System.out.println("이름 : " + name);
    	System.out.println("가격 : " + price);
    	System.out.println("유통기한 : " + expiration);
    }
    


    public boolean availableSale(String today) {
    	
    	return expiration.compareTo(today) >= 0;
//    	if(expiration.compareTo(today) >= 0) {
//    		return true;
//    	} else {
//    		return false;
//    	}
    	
//    String expirationDate = expiration.replace("-", "");
//    String todayDate = today.replace("-", "");
//    
//    int expirationInt = Integer.parseInt(expirationDate);
//    int todayInt = Integer.parseInt(todayDate);
//    
//    if(expirationInt >= todayInt) {
//    	return true;
//    }else {
//    	return false;
//    }
    	
//        String[] expirationArray = expiration.split("-");
//        String[] todayArray = today.split("-");
//
//        int expirationYear = Integer.parseInt(expirationArray[0]);
//        int expirationMonth = Integer.parseInt(expirationArray[1]);
//        int expirationDay = Integer.parseInt(expirationArray[2]);
//
//        int todayYear = Integer.parseInt(todayArray[0]);
//        int todayMonth = Integer.parseInt(todayArray[1]);
//        int todayDay = Integer.parseInt(todayArray[2]);
//
//        if (expirationYear > todayYear) {
//            return true;
//        } else if (expirationYear == todayYear && expirationMonth > todayMonth) {
//            return true;
//        } else if (expirationYear == todayYear && expirationMonth == todayMonth && expirationDay >= todayDay) {
//            return true;
//        } else {
//            return false;
//        }
    }

	
}
