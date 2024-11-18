package chapter_3;

public class Chapter_3_2 {
	public static void main(String[] args) {
		// Array
		int[] intArray;
		int intArray2[];
		// 위의 두가지 모두 int형식의 배열에 대한 레퍼런스변수를 선언한 것이다.
		// 단 아직 레퍼런스 변수가 참조할 배열은 생성되지 않았다.
		intArray = new int[5];
		// 여기서 배열을 생성하고 레퍼런스변수에 할당한다.
		// 이런식으로 배열을 생성할 때는 배열의 크기를 정해주어야만 한다.
		// 반대로 레퍼런스 변수 선언시에는 배열의 크기를 정할 수 없다. ex int[5] intArray; 는 오류가 발생한다.

		// 이것을 합치면
		int[] intArray3 = new int[8];
		// 또는
		int intArray4[] = { 1, 2, 3, 4, 5 };

		intArray2 = intArray4;
		// 이 경우 intArray4가 intArray2에 복사되는게 아님
		// 어디까지나 레퍼런스, 참조기때문에 같은것을 참조하는 변수가 되는 것임
		// 사실상 intArray2와 intArray4는 이름만 다른 완전히 같은 변수라고 볼 수 있음

		System.out.println(intArray4.length);
		// .length는 길이, for의 조건문에 사용하기 편리함

		// foreach는 향상된for문이라고도 함
		// 배열 레퍼런스 종류를 사용할 수 있음
		// 배열, iterator 을 사용한 컬렉션, iterable한 컬렉션, map의 set,values 등을 사용하여 '순회'함(모든 값을
		// 한번씩 넣음)
		int sum = 0;
		for (int i : intArray4) {
			sum += i;
		}

		
		int[][] secondDimentionArray = new int[2][3];
		// 2차원 배열은 앞의 []가 행 뒤의 []가 열이라고 볼 수 있다.
		// 배열명[n][m]으로 하나하나에 접근할 수도 있고 배열명[n]으로 1차원 배열에 접근할 수도 있다. 물론 그냥 배열명으로 2차원배열에 접근할 수도 있다.
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
		}
		// try : exception이 일어날 수도 있는 코드를 실행
		// catch : ()안의 exception이 일어나면 안의 코드를 실행, 특정할 수도 있고 exception 전체를 가르킬 수도 있다.
		// finally : exception이 일어나도, 일어나지 않아도 실행
		
	}
	
	public int[] returnArray() {
		int[] intArray5 = {6,7,8,9};
		return intArray5;
	} // 반환형을 지정하면 무조건 그 반환형의 자료형을 return해주어야한다. 즉 반환형을 가지는 메서드는 해당 자료형이라고 볼 수 있다.
	// 단 여기서 반환할 때 해당 배열을 반환하는 것이 아니라 해당 배열의 레퍼런스 변수를 반환하는 것임을 주의
	// {6,7,8,9}는 가만히 있고 이를 가르키는 intArray5만 반환되는 것이다.
	
}
