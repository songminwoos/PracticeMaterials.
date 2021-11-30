package p01.basic;

// String data type (int : integer data type, short : short type)
// 1. 문법 형식 String 변수이름
//    - 예로, String message는 type이 String이라는 말이고, 변수는 message임
//    - JVM에 변수 message라는 이름으로 메모리에 공간을 잡아달라는 의미
// 2. String type으로 선언된 변수를 메모리에 방(공간)을 잡을 때 방의 크기는 정해져 있지 않게(가변적으로) 만들어 놓았음 
//   - primitive type(int, double, boolean 등)은 방 크기가 고정되게 만들어 놓았음
//   - 참고로, String을 포함한 모든 참조타입은 방크기가 가변적 크기로 만들어 놓았음
// 3. String type의 실제 사용 예
//   - 고객이름, 주소, 직업, 직장명, 상품명, 휴대폰전화번호 ("01012345678")
public class StringBasic {

	public static void main(String[] args) {
		String message = "안녕하세요, 자바씨~~";
		String message2 = "예, 반갑습니다. 자바씨.";

		System.out.println(message);
		System.out.println(message2);
	}

}
