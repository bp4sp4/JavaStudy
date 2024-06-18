package test;

public class Dog extends Animals {

    @Override
    public void eat() {
        System.out.println("냠냠");
    }

    @Override
    public void cry() {
        System.out.println("멍멍");
        System.out.println("멍멍");
        System.out.println("멍멍");
    }

    @Override
    public void lash() {
        System.out.println("꼬리 흔들흔들");
    }
}
