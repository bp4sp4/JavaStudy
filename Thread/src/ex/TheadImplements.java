package ex;

public class TheadImplements implements Runnable {
	
	private String message;
	
	public void ThreadExtends(String message) {
		this.message = message;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i ++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(message);
		}
	}
}
