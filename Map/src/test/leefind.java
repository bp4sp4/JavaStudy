package test;

import java.util.HashMap;
import java.util.Map;

public class leefind {

	public static void main(String[] args) {
		Map<String, String> leeMap = new HashMap<>();
		leeMap.put("이지은" , "X");
		leeMap.put("서장훈" , "X");
		leeMap.put("유재석" , "X");
		leeMap.put("이광수" , "X");
		leeMap.put("박나래" , "X");
		
		 for (String key : leeMap.keySet()) {
	            if (key.startsWith("이")) {
	                leeMap.put(key, "O");
	            }
	        }
		 System.out.println(leeMap);

	}

}
