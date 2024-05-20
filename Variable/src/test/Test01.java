package test;

public class Test01 {

	public static void main(String[] args) {
		int age = 27;
		System.out.println("이름 : 박상훈 : " + age);
		
		int a = 3;
		int b = 5;
		int sum = a + b;
		int minus = a - b;
		
		System.out.println(a + "+" + b + " = " + sum);
		System.out.println(a + "-" + b + " = " + minus);
		for(int i=1; i<=10; i++){
			System.out.print("["+i+"단]\t");
			for(int j=1; j<=10; j++){
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}

}
