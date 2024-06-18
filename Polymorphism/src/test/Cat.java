package test;

public class Cat extends Animals {
    @Override
    public void eat() {
        System.out.println("냠냠");
    }
    
    @Override
    public void cry() {
    	System.out.println("야옹");
    }
    
    @Override
    public void lash() {
    	System.out.println("핥짝핥짝 그루밍 ");
    }
}
