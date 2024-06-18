package ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		// 맵
		// 회원의 이름 목록
		// hagulu  yu   bada  ohndar
		// 김인규, 유재석, 바다 ,  김인규

		Map<String, String> memberMap = new HashMap<>();
		
		memberMap.put("hangulu", "김인규");
		memberMap.put("yu", "유재석");
		memberMap.put("bada", "바다");
		memberMap.put("ohndar", "김인규");
		
		System.out.println(memberMap);
		
		// 키 목록 얻어 오기
		// 키들의 목록에서 반복문으로 키를 하나씩 얻어 온다.
	
		Set<String> keySet = memberMap.keySet();
		
		for(String id:keySet) {
			String value = memberMap.get(id);
			System.out.println(value);
		}
	}

}
