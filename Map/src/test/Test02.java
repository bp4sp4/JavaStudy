package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test02 {
    public static final Map<String, String> capitalMap = new HashMap<String, String>() {
        {
            put("대한민국", "서울");
            put("덴마크", "코펜하겐");
            put("독일", "베를린");
            put("러시아", "모스크바");
            put("벨기에", "브뤼셀");
            put("브라질", "브라질리아");
            put("스웨덴", "스톡홀름");
            put("스위스", "베른");
            put("스페인", "마드리드");
            put("아르헨티나", "부에노스아이레스");
            put("이집트", "카이로");
            put("이란", "테헤란");
            put("이탈리아", "로마");
            put("일본", "도쿄");
            put("필리핀", "마닐라");
            put("핀란드", "헬싱키");
            put("프랑스", "파리");
            put("터키", "앙카라");
            put("캐나다", "오타와");
            put("콜롬비아", "보고타");
        }
    };
//    
//    나라-수도가 들어있는 20개의 쌍이 Map으로 주어진다.
//    이 중 랜덤으로 5개의 문제가 주어지고, 사용자로부터 나라에 해당하는 수도를 입력 받는다.
//    정답인지 아닌지 수도를 입력한 즉시 출력한다.
//    모두 풀고 나면 점수(100점 만점)가 출력된다.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        Set<String> keys = capitalMap.keySet();
        List<String> keyList = new ArrayList<>(keys);

        Collections.shuffle(keyList);
        List<String> selectedCountries = keyList.subList(0, 5);
        
        int score = 0;
        
        for(String country : selectedCountries) {
        	System.out.print(country + " 의 수도 이름은?");
        	String answer = scan.nextLine();
        	if (capitalMap.get(country).equals(answer)){
        		System.out.println("정답입니다.");
        		score += 20;
        	} else {
        		System.out.println("틀렸습니다.");
        	}
        }
        System.out.println("총 점수는 : " + score);
    }
}


