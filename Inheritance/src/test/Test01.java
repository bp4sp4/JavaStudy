package test;

public class Test01 {

	public static void main(String[] args) {
		
		   IPhone iPhone = new IPhone("010-1234-5678");
	       System.out.println(iPhone.infoString());
	       iPhone.internetBrowsing("https://www.google.com");
	       iPhone.call("010-000-0000");
	       iPhone.sendMessage("010-1111-2222", "ㅋㅋㅋㅋ");

	}

}
