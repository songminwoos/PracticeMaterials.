package p02.call_by_reference.basic;

// stack memory의 String type 변수가 갖는 주소값의 의미
// 1. Java는 string 문자열이 동일한 경우는 heap memory에 1개만 생성
//    => String 문자열이 동일한 변수를 여러개 만들어도 String의 변수의 주소값은 동일
//    => Java의 원칙은 동일한 문자열이라고 하더라도 변수가 틀리면 heap memory에 따로 만드는 것이 원칙임 
// 2. String 문자열이 틀리면 heap memory에 다른 문자열을 만듬
// 3. == 의미 : stack memeory에 있는 변수의 값을 비교하는 것임
//    - 변수가 primitive인 경우  ==이 값을 비교하는 것과 같은 효과
//    - 변수가 참조타입인 경우 ==이 주소를 비교하는 것과 같은 효과
public class TestStringCompare {

	public static void main(String[] args) {
		String s1 = "Welcome to Java";
		String s2 = "Welcome to Java";
		String s3 = "Welcome to C++";
		int num1 = 1;
		int num2 = 3;
		

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));

		// s1과 s2의 실제 값을 비교
		if (s1.equals(s2)) {
			System.out.println("s1과 s2 문자열 contents(내용)이 같습니다.");
		} else {
			System.out.println("s1과 s2 문자열 contents(내용)이 다름니다.");
		}

		// stack의 값인 주소를 서로 비교
		if (s1 == s2) {
			// 객체 : heap memory에 생성된 객체
			// s1과 s2 객체가 서로 같습니다. => heap memory의 객체가 서로 동일
			System.out.println("s1과 s2 객체가 서로 같습니다.");
		} else {
			System.out.println("s1과 s2 객체가 서로 틀립니다.");

		}	

		if (num1 == num2) {
			System.out.println("num1과 num2의 값이 서로 같습니다.");
		} else {
			System.out.println("num1과 num2의 값이 서로 다릅니다.");

		}	
	}

}
