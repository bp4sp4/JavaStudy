package test;

public class Animal implements Runnable {
	private String sound;
	
	public Animal(String sound) {
		this.sound = sound;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i ++) {
			System.out.println(sound);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}
