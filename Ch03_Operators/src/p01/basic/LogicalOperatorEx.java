package p01.basic;

// 논리연산자(Logical Operator) : 비교연산자와 같이 사용, 비교연산자를 부분으로 사용
// 1. && => A && B 예를 들면 true && true => true, false && true => false, true&&false=>false, false&&false=>false
// 2. || => A || B 예를 들면 true || true => true, false || true => true, true||false=>true, false||false=>false
// 3. !  => !A   예를 들면 A가 true이면 !A는 false, A가 false이면 !A는 true
public class LogicalOperatorEx {

	public static void main(String[] args) {
//		int a1 = 10, a2 = 20, a3 = 20, a4 = 0;
		int a1 = 10;
		int a2 = 20;
		int a3 = 20;
		int a4 = 0;
		boolean bresult;

		System.out.println("a1 < a2 = " + (a1 < a2));
		System.out.println("a2 == a3 = " + (a2 == a3));
		bresult = (a1 < a2) && (a2 == a3); // true&&true => true
		System.out.println("bResult = " + bresult);
		bresult = (a1 < a2) || (a2 == a3); // true||true => true
		System.out.println("bResult = " + bresult);

		System.out.println("a1 > a2 = " + (a1 > a2));
		System.out.println("a2 == a3 = " + (a2 == a3));
		bresult = (a1 > a2) && (a2 == a3);
		System.out.println("bResult = " + bresult);
		
		bresult = (a1 > a2) || (a2 == a3);
		System.out.println("bResult = " + bresult);
		
		bresult = !(a1 > a2);
		System.out.println("bResult = " + bresult);
	}

}








