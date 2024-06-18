package test;

public class Test01 {

	public static void main(String[] args) {
		Animal sound1 = new Animal("어흥");
		Animal sound2 = new Animal("음메~");
		Animal sound3 = new Animal("히잉");
		
		 Thread lionThread = new Thread(sound1);
	     Thread sheepThread = new Thread(sound2);
	     Thread horseThread = new Thread(sound3);
	     
	     lionThread.start();
	     sheepThread.start();
	     horseThread.start();
	}

}
