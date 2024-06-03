# JavaStudy
## 부지런히 쓰기 꾸준함이 중요 24/05/20(월) 시작

<h4>24/06/03</h4>

접근 제어자
- 객체 사용 시 데이터에 접근 가능한 제어 단계
- default: 지정하지 않았을 경우 default. 같은 패키지 내에서만 접근이 가능하다.
- public: 접근 제한이 없다. 모두 접근 가능.
- protected: 같은 패키지 내에서 접근 가능, 다른 패키지의 자손클래스에서 접근 가능
- private: 같은 클래스 내에서만 접근 가능. 외부에서는 접근 불가.

<h4>24/05/31</h4>

Class(클래스)
- 여러 변수를 묶어서 하나로 관리 하기 위한 설계도
- 어떤 정보를 어떤 변수에 넣어 사용 할지를 정의

<pre>
	<code>
성적 (과목이름, 점수, 석차)  
	public class ScoreData {
	    int score;
	    String name;
	    int ranking;
	}
	</code>
</pre>
- 묶어진 변수들을 속성, field, 멤버 변수(member variable) 라고 한다.

Method(메소드)
- 메소드는 데이터를 전달 받고, 수행하고, 결과를 돌려 주는 과정
- 리턴타입: 결과값의 자료형

<h4>24/05/30</h4>

String -> int == integer.parseInt
int -> String == String.ValueOf("d");
<h4>24/05/28</h4>

String
- String 관련 유용한 메소드들
- charAt(index)	문자열의 index번째 문자(char)를 얻는다.	char
- contains(특정 문자열)	특정 문자열이 포함되어 있는지 확인	boolean
- startsWith(특정 문자열)	특정 문자열로 시작하는지 확인	boolean
- endsWith(특정 문자열)	특정 문자열로 끝나는지 확인	boolean
- length()	문자열의 길이	int 알파벳의 개수
- replace(수정할 문자열, 새로운 문자열)	문자열 중 일부를 교체	String 바뀐 문자열 전체
- split(특정 구분자)	구분자를 기준으로 문자열을 잘라서 배열에 넣는다.	String[]
- substring(index)	문자열을 index번째부터 맨 뒤까지 자른다.	String 잘린 문자열
- substring(sindex, eindex)	s_index번째부터 자르고 싶은 마지막 index + 1	String 잘린 문자열

<h4>24/05/28</h4>

- 이차원 배열 예시
<pre>
<code>
int[][] scores = {
    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
    {65, 63, 57, 87, 88, 92, 78, 85, 70, 68},x`
    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
};

for(int i = 0; i < scores.length; i++) {
    int sum = 0;
    for(int j = 0; j < scores[i].length; j++) {
	sum += scores[i][j];
    }
    System.out.println( i+1 + "번째 평균 점수는 " + (sum / (double)scores[i].length));
}

</code>
</pre>

<h4>24/05/27</h4>

- 배열 예시
<pre>
	<code>
	int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		
        numbers[3] = 6;
        // 배열 출력
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
	</code>
</pre>

## Function(함수)
<h3>함수의 기본 구조</h3>
- 리턴타입 : 결과형의 자료형
<pre>
  <code>
	리턴타입 함수명(매개변수) {
    		// 코드 구현...
   		 return 결과값;
	}
  </code>
</pre>

- 매개변수(Parameter)가 없는 경우

<pre>
  <code>
	리턴타입 함수명() {
   	    // 코드 구현...
       	    eturn 결과값;
	}
  </code>
</pre>

- 리턴값이 없는경우

<pre>
	<code>
	void 함수명() {
	 // 코드 구현...
	}
	</code>
</pre>

- 매개변수(Parameter)가 2개 있는 경우

<pre>
	<code>
	리턴타입 함수명(자료형 a, 자료형 b) {
	    // 코드 구현...
	    return 결과값;
	}
	</code>
</pre>

<h3>24/05/23(목)</h3>

## 반복문 - 이중 루프 예시

<pre>
  <code>
	for (int i = 0; i < 3; i++) {
		for(int j = 0; j < 5; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
  </code>
</pre>

<h3>24/05/22(수)</h3>

## 반복문 - 횟수 반복 (for)

- 반복문 예시(for)
<pre>
  <code>
    	for(int i = 0; i<5; i++) {
		System.out.println("Hello world\!");
	}
  </code>
</pre>


<h3>24/05/21(화)</h3>

## 반복문 - 횟수 반복 (while)

- 반복문 예시(while)
<pre>
  <code>
    	int weight  = 75;
		while(weight >= 70 ) {
			System.out.println("으쌰으쌰");
			weight = weight -2;
			weight -= 2;
		}
		System.out.println("운동 끝!");
  </code>
</pre>

## Switch 제어문

- 예시
- 조건 마지막에 break;
- 마지막은 defualt

<pre>
  <code>
    switch(grade) {
		case 'A':
			System.out.println("소고기");
			break;
		case 'B':
			System.out.println("삼겹살");
			break;
		case 'C':
			System.out.println("치킨");
			break;
		default:
			System.out.println("굶어");
		}
  </code>
</pre>

<h3>24/05/20(월)</h3>

## if문
- 알고 있었지만 까먹은 꿀팁 혹은 공부내용
  - 컨+쉬+o (자바 임포트)
  - 뎁스, 들여쓰기, 인덴트(indent)
- 조건문 , 논리 연산자
  - if 조건()안에는 true 혹은 false 라는 값만 들어 갈 수 있다!
  - 비교 연산은 연산이다!
  - 비교 연산의 결과는 true 혹은 false 이다.
