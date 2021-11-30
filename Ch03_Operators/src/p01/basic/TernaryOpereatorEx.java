package p01.basic;

// 3항 연산자(Ternary Operator) : 피연산자(oprand)가 3개인 경우
// 문법 =>  A ? B : C (예를 들면 (n1<n2) ? n1 : n2 에서, A는 (n1<n2)이고, B는 n1이고, C는 n2 임
//     => A는 논리연산식으로 true아니면 false값만 가짐
//     => A가 true이면 B를 실행하고, A가 false이면 C를 실행한다.
public class TernaryOpereatorEx {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 10;
		int max;

		System.out.println("n1>n2 = " + (n1>n2));

		max = (n1>n2) ? n1 : n2;
		
		System.out.println("max = " + max);

		int result;
		
		result = (n1>n2) ? (n1 + n2) : (n1 - n2);
		System.out.println("Result = " + result);
	}

}











