package test;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		// 3, 8, 9, 4, 2, 1, 7, 5
		List<Integer> integerList = new ArrayList<>();
		integerList.add(3);
		integerList.add(8);
		integerList.add(9);
		integerList.add(4);
		integerList.add(2);
		integerList.add(1);
		integerList.add(7);
		integerList.add(5);
		System.out.println(integerList);
		
		integerList.set(3, 6);
		System.out.println(integerList);
		integerList.add(2, 10);
		System.out.println(integerList);
		integerList.remove(1);
		integerList.remove(6);
		System.out.println(integerList);
	}

}
