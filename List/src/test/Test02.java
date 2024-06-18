package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		// 20 3 5 84 17
		List<Integer> integerList = new ArrayList<>();
		integerList.add(20);
		integerList.add(3);
		integerList.add(5);
		integerList.add(84);
		integerList.add(17);
		System.out.println(integerList);
		
		int minvalue = integerList.get(0);
		for(int i = 1; i < integerList.size(); i++) {
			if(integerList.get(i) < minvalue) {
				minvalue = integerList.get(i);
			}
			
		}
		System.out.println(minvalue);
		
//		3. 합계 구하기
//		List 요소들의 총 합계를 구하세요.
//		Iterator를 사용하세요.
//		출력 예시
//
//		129
		
		Iterator<Integer> iter = integerList.iterator();
		
	    int sum = 0; 
        while (iter.hasNext()) {
            sum += iter.next();
        }
        System.out.println(sum);

//        리스트 삭제
//        List 에서 짝수 인 값을 모두 삭제하고 전체 값을 출력 하세요.
//        [3, 5, 17]
        iter = integerList.iterator();
        while (iter.hasNext()) {
        	int number = iter.next();
            if(number % 2 == 0)
            	iter.remove();
        }
	}

}
