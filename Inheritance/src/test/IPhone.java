package test;

public class IPhone extends IPodTouch {

    private String phoneNumber;

    public IPhone(String phoneNumber) {
    	this.phoneNumber = phoneNumber;
    	super.setModel("iPhone");
    }

    @Override
    public String infoString() {
        return super.infoString() + "\n전화번호 : " + getPhoneNumber();
    }

    public void call(String number) {
        System.out.println(number + " 로 통화 중");
    }

    public void sendMessage(String number, String message) {
        System.out.println(number + " 로 " + message + " 전송");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
