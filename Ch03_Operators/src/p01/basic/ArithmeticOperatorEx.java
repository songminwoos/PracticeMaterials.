package p01.basic;

// 4칙 연산자
// 1. % => 나누기의 나머지를 구함 (10%3 => 1, 12%5 => 2, 23%7 => 2)
public class ArithmeticOperatorEx {

	public static void main(String[] args) {
		int a1 = 10;
		int a2 = 3;
		int result;
		double result1;

		result = a1 + a2* 5;
		System.out.println("result = " + result);
		
		result = a1 - a2;
		System.out.println("result = " + result);
		
		result = a1 * a2;
		System.out.println("result = " + result);
		
		// 기계어 명령어 관점
		// 1. int type인 a1, a2에 대하여 산술연산을 수행하고 결과를 int type으로 만듬 (소숫점 계산않함)
		// 2. 소수점이 제거된 int type 결과값을 double type으로 자동 형변환
		// 3. double type으로 자동 형변환된 값을 result1에 넣음
		result1 = a1 / a2;
		System.out.println("result1 = " + result1);

		// 기계어 명령어 관점
		// 1. a2를 int type(4bytes)에서 double type(8bytes)으로 변경
		// 2. a1을 a2처럼 int type(4bytes)에서 double type(8bytes)으로 변경
		// 3. a1과 a2를 산술연산해서 결과값을 double type(8bytes)에 저장
		// 4. result1에 double type(8bytes) 결과값을 저장
		result1 = a1 / (double)a2;
		System.out.println("result1 = " + result1);
		
		result = a1 % a2;
		System.out.println("result = " + result);
	}

}














