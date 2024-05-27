# JavaStudy
## 부지런히 쓰기 꾸준함이 중요 24/05/20(월) 시작

<h4>24/05/24</h4>

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
