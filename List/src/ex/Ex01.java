package ex;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		
		List<Integer> integerList = new ArrayList<>();
		integerList.add(25);
		integerList.add(20);
		integerList.add(10);
		
		System.out.println(integerList);
		// 값 수정
		integerList.set(0, 30);
		System.out.println(integerList);
		// 값 삭제
		integerList.remove(2);
		System.out.println(integerList);
		// 리스트 비우기
		integerList.clear();
		System.out.println(integerList);
		// 문자열 리스트
		List<String> stringList =  new ArrayList<>();
		
		stringList.add("apple");
		stringList.add("bear");
		stringList.add("chair");
		System.out.println(stringList);
		
		stringList.set(2, "car");
		System.out.println(stringList);
		
		// 값 삭제
	    stringList.remove(1);
	    System.out.println(stringList);
	    
	    // 값을 통한 삭제( 객체를 통한 삭제 )
	    stringList.remove("apple");
	    System.out.println(stringList);
	    
	}
	

}
