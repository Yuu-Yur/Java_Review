package chapter_5;

public class Chapter_5 {
	//상속 extends
	//서브클래스와 슈퍼클래스
	//subclass는 superclass의 field와 method를 사용할 수 있음
	//subclass의 constructor가 실행될 때 super의 constructor도 실행된다.
	//default 생성자가 기본 , super(매개변수)로 지정 가능
	//물론 constructor의 첫줄에 super(매개변수);를 써야 함
	
	//upcasting : sub의 인스턴스를 super의 레퍼런스 변수에 할당하는 것
	//sub의 field와 method를 가지고 있더라도 super의 레퍼런스 변수이므로 sub의 field와 method에 접근 불가
	//downcasting : super의 인스턴스를 sub의 레퍼런스 변수에 할당하는 것
	//downcasting은 upcasting된 sub의 인스턴스를 다시 sub의 레퍼런스 변수에 할당하는것 <- 명시적타입변환 필요
	//upcasting된 super의 레퍼런스 변수는 어떤 인스턴스를 가르키는지 구분하기 어려우므로
	//instanceof -> boolean값
	
	//method overriding
	//sub에서 super의 method를 중복해서 작성하면 super의 method 무력화
	//super의 method와 이름,매개변수,리턴 타입이 같아야 함.
	//따라서 여러 서브에서 같은 super의 method를 중복작성한다면 같은이름의 method로
	//sub마다 다른 method를 실행할 수 있음
	//upcasting하여 sub의 method에 접근이 불가능 하더라도 method overriding은 일어남
	//가끔overriding했지만 super의 method에 접근할 필요가 있음
	//super.~ 이때 super.method는 정적바인딩
	//abstract class는 instance 생성 불가
	//abstract class를 상속받으려면 추상클래스여야 함
	//단 sub에서 abstract method를 구현한다면(overriding) abstractClass가 아님
	//즉 superClass가 abstractClass일 경우는 굳이 super의 method를 사용할 필요 없고 하위class에서 override할 예정일 때
	//따라서 abstract class가 있다면 이 abstractClass의 의미는 sub의 코드의 틀을 잡는것에 가까움
	
	//이 abstractClass가 커진것이 interface
	//상수,abstract method, default method, private method(interface 내에 코드가 작성되어야 함), static method
	//또한 interface끼리 상속이 가능, interface라면 다중상속도 허용됨
	//interface를 구현하기 위한 class엔 implements << @overriding같은 확인용에 가까움ㅈ
	
}
