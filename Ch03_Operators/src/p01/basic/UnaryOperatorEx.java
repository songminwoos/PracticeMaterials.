package p01.basic;

// 연산자 유형
// 1. 1항 연산자 (Unary Operator) : operand(피연산자)가 1개만 있는 경우 -, +, !  예) n1 = -n1;에서 -n1
//    - ! => boolean data type에서만 사용, not의 의미 (예를 들면 !true => false, !false => true)
// 2. 2항 연산자 (binary operator) : operand(피연산자)가 2개 있는 경우  (산술연산자 : +, -, *, /, %)
public class UnaryOperatorEx {

	public static void main(String[] args) {
		int n1 = 20;
		
		System.out.println("Number = " + n1);
		
		n1 = +n1;
		System.out.println("Number = " + n1);
		
		// 기계어 명령어 관점에서
		// 1. n1의 값을 읽어옴 (20을 읽어옴)
		// 2. 20값에 음수부호로 적용하여 새로운 값을 만듬 (-20)
		// 3. -20값을 n1 메모리에 넣음
		n1 = -n1;
		System.out.println("Number = " + n1);
		
		boolean bRun = false;
		
		System.out.println("boolean 값 = " + bRun);
		
		bRun = !bRun;
		System.out.println("boolean 값 = " + bRun);
	}

}








