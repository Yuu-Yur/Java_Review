package chapter_6;

public class Chapter_6 {
	public static void main(String[] args) {
		//레퍼런스 변수.toString() 객체를 string으로 변환
		//== 와 equals() ==는 값 비교
		//레퍼런스 변수의 값은 참조기때문에 == 불가 (String도 마찬가지)
		//따라서 내용자체를 비교하기위해 .equals() 사용
		
		//Wrapper 8개
		//Byte Short Integer Long Character Float Double Boolean
		//Wrapper의 의의 = 객체만 사용할 수 있는 컬렉션등에 기본타입을 사용하기 위해 Wrapper객체 사용
		//Wrapping => Wrapper.valueOf();
		//Unwrapping => 기본타입Value();
		//String을 기본타입으로 변환 Wrapper.parse기본타입(String);
		
		//String은 클래스로 쓸 수도 있음
		//보통은 String a = "a";로 쓰지만
		//String b = new String("b");도 있음
		//차이점은 전자는 JVM의 스트링 리터럴테이블에 생성 이때는 공유됨
		//같은 값을 주면 같은 곳을 가르킴
		//후자는 힙 메모리에 생성 공유되지 않음, 같은 값을 주어도 다른 메모리위치를 가르킴
		//전자나 후자나 한번 생성하면 수정 불가능
		//concat으로 덧붙인다 하더라도 덧붙이기 전의 스트링에 추가되는게 아니라
		//덧붙여진 새로운 스트링이 생성되는것
		//String을 쓴 변수는 모두 값을 가지는 것이 아니라 레퍼런스 변수이다.
		//따라서 String비교에는 반드시 equals()
		//String.compareTO() 괄호안보다 먼저나오면(사전적 알파벳이 먼저) 음수
		//String.trim() 좌우의 공백 제거
		
		//StringBuffer 가변 스트링
		//String과 달리 문자열 변경 가능
		//.append 추가
		//.insert 인덱스 위치에 삽입, 시작은 0
		//.replace 인덱스 시작에서 끝위치를 바꿈, 시작은 0
		
		//StringTokenizer 클래스
		//StringTokenizer(String, 구분문자) slice와 비슷
		//단! 구분문자가 여럿이라도 그냥 다 붙여씀
		
		//Math 클래스
		//기본 산술연산 method 제공
		//Math.random() <-난수발생, 0~1.0의 실수 난수발생
		//보통 Random 클래스 이용해서 nextInt(0<= n <int)
	}

}
