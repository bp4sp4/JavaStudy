package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Test03 {

	public static void main(String[] args) {
		
//		id 중복 체크
//		아래와 같이 회원 가입된 id 목록이 주어진다.
//		["hagulu", "happy", "google", "bts", "iu", "cuteboy"]
//		id 를 입력 받고, id 가 중복 될경우 "중복입니다", 중복이 되지 않을 경우 "사용가능" 을 출력 하세요.
//		입력 예시
//
//		id : hagulu
//		출력 예시
//
//		중복 입니다.
//		 List<String> idList = new ArrayList<>();
//	     idList.add("hagulu");
//	     idList.add("happy");
//	     idList.add("google");
//	     idList.add("bts");
//	     idList.add("iu");
//	     idList.add("cuteboy");
//	     
//	     Scanner sc = new Scanner(System.in);
//	     System.out.println("id 입력 : ");
//	     String inputid = sc.nextLine();
//	     
//	     if(idList.contains(inputid)) {
//	    	 System.out.println("중복입니다.");
//	     }else {
//	    	 System.out.println("사용가능");
//	     }
	     
//	     2. 체조 경기 평균 점수
//	     체조 경기에서 아래와 같은 심사위원 점수가 집계 되었습니다.
//	     최고점과 최저점을 제외한 나머지 점수의 평균을 구하세요.
//	     for문으로 구현할 것
//
//	     [8, 7, 6, 10, 9, 4]
//	     출력 예시
//
//	     최고점과 최저점을 제외한 평균 점수는 7.5
	     
	     List<Integer> numList = new ArrayList<>();
	     numList.add(8);
	     numList.add(7);
	     numList.add(6);
	     numList.add(10);
	     numList.add(9);
	     numList.add(4);
	     System.out.println(numList);
	     
	     int maxScore = numList.get(0);
	     int minScore = numList.get(0);
	     
	     for(int i = 1; i < numList.size(); i++ ) {
	    	 int score = numList.get(i);
	    	 if (score > maxScore) {
	    		 maxScore = score;
	    	 }
	    	 if (score < minScore) {
	    		 minScore = score;
	    	 }
	     }
	     int sum = 0;
	     int count =0;
	     boolean maxRemoved = false;
	     boolean minRemoved = false;
	     for (int i = 0; i < numList.size(); i++) {
	    	    int score = numList.get(i);
	    	    if (score == maxScore && !maxRemoved) {
	    	        maxRemoved = true;
	    	        continue;
	    	    }
	    	    if (score == minScore && !minRemoved) {
	    	        minRemoved = true;
	    	        continue;
	    	    }
	    	    sum += score;
	    	    count++;
	    	}
	     double avg = (double) sum / count;
	     
	     System.out.println(avg);
	     
	     
//	     3. 로또 번호
//	     Random 클래스를 이용해서 1~45 범위의 6개의 중복 되지 않는 숫자를 리스트에 저장 하세요.
//	     저장된 숫자를 오름 차순으로 정렬해서 출력 하세요.
//	     출력 예시
//
//	     [3, 6, 19, 26, 37, 44]
	     Random random = new Random();
	     
	     List<Integer> numberList = new ArrayList<>();
	     for (int i = 0; i < 6; i ++) {
	     // 1 ~ 45
	    	 int randomNumber = random.nextInt(45) + 1;
		     
	    	 if(numberList.contains(randomNumber)) {
	    		 i--;
	    		 continue;
	    	 }
	    	 
		     numberList.add(randomNumber);
	     }
	     numberList.sort(Comparator.naturalOrder());
	     System.out.println(numberList);
	     	     
	}

}
