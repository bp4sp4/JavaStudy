package ex;

public class Ex01 {

	public static void main(String[] args) {
		// 특정 문자열을 10번 출력하는 기능
		
//		ThreadExtends thread1 = new ThreadExtends("###");
//		ThreadExtends thread2 = new ThreadExtends("@@@");
//		thread1.start();
//		thread2.start();
		
		ThreadImplements threadImple = new ThreadImplements("###");
		
		Thread thread = new Thread(threadImple);
		thread.start();
		
		// 특정 thread 기다리
		thread.join();
		
		
		System.out.println("끝!!");
	}

}
