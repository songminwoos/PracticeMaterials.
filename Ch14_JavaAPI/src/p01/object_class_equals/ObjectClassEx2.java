package p01.object_class_equals;

// String(문자열)의 ==, equals
// 1. String class에서 == 사용
//   1.1) String type의 변수를 선언할 때 문자열 literal이 같은 것을 여러번 선언하면, 
//     Java는 하나의 문자열 literal만 힙메모리에 만듬
//     => 예를 들면, s1 = "홍길동", s2 = "홍길동"로 변수 선언할 경우, Java는 "홍길동"문자열 1개만 힙메모리에 생성함
//        같은 문자열인 경우 힙메모리에 하나만 생성하기 때문에, 결국은 s1과 s2는 같은 주소값을 가짐
//   1.2) new String("문자열")을 사용하면 무조건 힙메모리에 인스턴스 새로 생성함. 비록 "문자열"이 동일한 내용이더라도 새로 생성
//     => 예를 들면, s4 = new String("홍길동"), s5 = new String("홍길동")로 선언한 경우 s4, s5의 문자열이 같더라도
//        s4, s5는 별도의 힙메모리에 생성되어 s4와 s5 변수에 들어 있는 힙메모리 주소값이 틀림
// 2. String class에서 equals method 사용
//   2.1) 같은 문자열 literal로 정의된 경우는 ==와 equals 결과가 동일 (변수 s1, s2인 경우)
//   2.2) new String으로 같은 문자열을 생성한 경우는 ==와 equals 결과가 틀림 (변수 s4, s5인 경우)
//     => String class의 equals method는 문자열이 동일한지 여부로 비교하도록 java에서 개발됨
//     => 부모 class인 Object class의 equals 메소드를 자식인 String class에서 override하여 새로 구현함
public class ObjectClassEx2 {

	public static void main(String[] args) {
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍길동1";
		String s4 = new String("홍길동");
		String s5 = new String("홍길동");
		
		boolean result;
		
		result = (s1 == s2);
		System.out.println("s1 == s2 : " + result);
		result = (s1 == s3);
		System.out.println("s1 == s3 : " + result);

		result = (s4 == s5);
		System.out.println("s4 == s5 : " + result);
		
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("s1.equals(s3) : " + s1.equals(s3));
		System.out.println("s4.equals(s5) : " + s4.equals(s5));
	}

}










