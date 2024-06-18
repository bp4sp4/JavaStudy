package test;

public class Test01 {

	public static void main(String[] args) {

		 Animals[] animals = new Animals[2];
	        animals[0] = new Cat();
	        animals[1] = new Dog();

	        for(int i = 0; i < animals.length;  i ++) {
	        	animals[i].cry();
	        }
	}

}
