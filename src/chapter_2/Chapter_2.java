package chapter_2;

import java.util.Scanner;

public class Chapter_2 { //class

	public static void main(String[] args) { //method
		Scanner scanner = new Scanner(System.in); // system.in : java의 표준 입력 스트림, 바이트로 return함
		exampleMethod(); //method 호출
		int i; //변수 선언
		i = 0; //변수 초기화
		String identifier; //식별자는 _,$을 제외한 특수문자 사용 불가, 첫 글자는 숫자가 될 수 없음
		boolean dataType = true; //자료형은 기본 8개 boolean, char, byte, short, int, long, float, double
		Chapter_2 cha2 = new Chapter_2(); //레퍼런스 변수, 실제로 값을 가지는 것이 아니라 오른쪽에서 새로 만든 인스턴스를 참조하라는 역할만 한다
		final char a = 'a'; //상수는 final로 선언 변경 불가
		double j = i; //int인 i를 double인 j로 묵시적 형변환
		i = (int)j; //double인 j를 int인 i로 묵시적 형변환할수 없어서(double이 더 자세한 자료형) 명시적으로 변환
		i = scanner.nextInt();
		j = scanner.nextDouble(); //받아들이는 system.in은 바이트로만 받지만 scanner이 int나 double로 변환해준다
		i++; //i = i + 1 과 같음
		if (i>j) { // 비교연산자 boolean 자료형 반환
			System.out.println(i);
		} else {
			System.out.println(j);
		}
		int k = (i>j)?i:(int)j; // 3항 연산자, 조건 ? true일때 : false일때
		switch (i) { //switch 키 가 case의 값에 적용되면 실행
		case 30: {
			System.out.println(i);
			break;
			//break가 없으면 다른 case를 침범함
		}
		case 50: {
			System.out.println(j);
			break;
		}
		default:
			System.out.println("지정한 수가 아닙니다");
		}
		
		
		
		scanner.close();
	}
	
	public static void exampleMethod() { //method
		System.out.println("method 예제입니다");
	}
}
