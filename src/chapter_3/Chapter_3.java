package chapter_3;

public class Chapter_3 { // for, do-while
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			sum += i;
			System.out.println(sum);
		} // 기초적인 for문 counter i를 사용 두번째가 조건 세번째가 counter증가

		int k = 0;
		while (k < 10) {
			k = k + 2;
		} // 기초적인 while문 ()안이 true인동안 반복

		int j = 0;
		do {
			j = j + 3;
		} while (j < 2); // do-while문 do 문이 한번은 실행

		// 반복문은 중첩가능
		int a = 2;
		int b = 4;
		while (a++ < b) {
			if (a == b) {
				continue;
			}
			System.out.println(a);
		} // continue 이후를 스킵하고 while이면 조건식, for이면 counter 증가(반복작업)로 간다.
		
		while (true) {
			System.out.println(a++);
			if (a==10) {
				break;
			}
		} // break 반복문 탈출
	}
}
