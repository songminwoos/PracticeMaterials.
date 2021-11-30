package p01.basic;

// String의 길이 구하기 방법
// 1. length() 메소드(method)를 사용
// 2. 한글과 영어글자 1개를 length에서 1 로 인식
// 3. 문자열은 예를 들면 ""안에 있는 리터럴을 의미 (예, "Welcome to Java")
// 4. Java에서 String의 데이터 값인 문자열에서 각 문자는 unicode로 구성되어 있음
public class StringBasic2 {

	public static void main(String[] args) {
		String message = "Welcome to Java";
		String message2 = "안녕하세요, 자바씨!!";
		
		System.out.println(message + " 변수의 길이는 " + message.length() + "입니다.");

		System.out.println(message2 + " 변수의 길이는 " + message2.length() + "입니다.");

	}

}
