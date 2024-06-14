# JavaStudy
## 부지런히 쓰기 꾸준함이 중요 24/05/20(월) 시작

<h4>2406/14(금)</h4>
<h2>Hash 키 값 찾기 </h2>

~~~

// 키 목록 얻어 오기
// 키들의 목록에서 반복문으로 키를 하나씩 얻어 온다.
	
		Set<String> keySet = memberMap.keySet();
		
		for(String id:keySet) {
			String value = memberMap.get(id);
			System.out.println(value);
		}

~~~

<h4>24/06/13</h4>
<h3>클래스로 만든 리스트 가져오기 </h3>

~~~
	Member member1 = new Member("박상훈", "010-1111-1111");
		
		List<Member> memberList = new ArrayList<>();
		memberList.add(member1);
		memberList.add(new Member("유재석", "010-5555-1111"));
		memberList.add(new Member("지석진", "010-3322-4422"));
		memberList.add(new Member("유재석", "010-5511-1234"));
		
		System.out.println(member1);
		System.out.println(memberList);
		
		Member member2 = memberList.get(2);
		System.out.println(member2);
		
		// 멤버 이름 출력 : 박상훈님
		System.out.println(member1.getName() + "님");
		
		
		for(Member member:memberList) {
			System.out.println(member.getName() + "님");
		}
~~~

<h4>24/06/12</h4>

<h3>List</h3>

- 배열과 같이 같은 타입의 여러 개의 자료를 저장하는 자료구조.
- 배열이 가진 메모리 낭비와 삽입 삭제의 불편함을 개선하였다.
- 기본 타입은 사용 불가능 하고 객체 형태로만 저장 가능하다.
- generic을 활용해서 타입의 안정성을 확보한다.

~~~
ArrayList<Integer> integerList = new ArrayList<>();
~~~

<h4>24/06/08</h4>

<h3>추상 클래스 (Abstract Class) 구현이 없는 메소드</h3>

~~~
public abstract class Animal {

    // 추상메소드
    public abstract void cry();

    public void eat() {
        System.out.println("냠냠");
    }
}
~~~
- 구현내용이 없는 메소드를 추상 메소드 라고 한다.
- abstract 키워드를 통해서 구분해준다.

- 추상 클래스 (Abstract Class)
	- 추상 메소드가 하나라도 있는 클래스를 추상 클래스 라고 한다.
	- 추상 클래스는 그 자체로 객체를 생성할 수 없다.
	- 추상 클래스를 상속받은 클래스는 해당 메소드를 필수적으로 구현해야 한다.
	- 상속을 통해서만 객체를 생성해서 사용할 수 있다.

<h4>24/06/07</h4>

java.lang
- java 에서 가장 많이 사용 되는 Class 를 모아 놓은 package
- 따로 import 해주지 않아도 자동으로 포함된다.
- String, System(println) 등 이 대표적인 java.lang 에 포함된 Class 이다.
- 다른 java.lang 에 포한된 Class 는 아래 링크를 참조

- 업 캐스팅(Up Casting)
~~~
Animal animal = new Dog("누렁이");
 ~~~
- 자식 -> 부모 클래스로(위쪽 방향으로) 캐스팅
- 개를 동물이라고 표현 할 수 있듯이, Animal 을 상속 받은 Dog 은 Animal 로 객체를 저장 할 수 있다.
- Animal 형태로 객체를 저장 했지만, Dog 객체의 형태를 잃어 버린 것은 아니다.
- 부모 클래스로 type이 변환된 것이므로
- 부모 클래스의 메소드를 사용할 수 있다.
- 부모 클래스에 있는 메소드를 오버라이드 한 메소드를 사용할 수 있다.
- 자식 클래스에만 있는 메소드는 사용할 수 없다

- 다운 캐스팅 (Down Casting)
~~~
Animal animal = new Dog("누렁이");

if (animal instanceof Dog) {
    Dog dog = (Dog) animal;
    dog.lash();
}
~~~
- 부모 -> 자식 클래스로(아래 방향으로) 캐스팅
- 특정 자식객체임이 확인 되어야만 캐스팅이 가능하다.
- instanceof로 객체의 타입을 확인해야 한다.

<h4>24/06/05</h4>

<h3>상속(inheritance)</h3>

- extends 키워드를 사용하여 부모 클래스로부터 상속한다.
- 다중 상속 불가
- 한 번에 하나의 클래스만 extends 가능하지만, A -> B -> C 구조로 상속은 가능하다.
<pre>
	<code>
- 자식 클래스에서 부모 클래스의 변수나 메소드를 접근할 때 super 키워드 사용
- 자식 클래스에서 부모 클래스의 메소드를 재 정의할 때 @Override 사용
	@Override
	public void introduce() {
	    // 부모 클래스에 있는 메소드를 재정의
	}
	</code>
</pre>


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
