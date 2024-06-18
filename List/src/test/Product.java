package test;

public class Product {

    private String productName;
    private int productPrice;
    private int productInventory;

    public Product(String productName, int productPrice, int productInventory) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productInventory = productInventory;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public int getProductInventory() {
        return productInventory;
    }
    
    public void setProductInventory(int productInventory) {
        this.productInventory = productInventory;
    }

    @Override
    public String toString() {
        return "제품명 : " + productName + " 가격 : " + productPrice + " 재고 : " + productInventory;
    }

}
