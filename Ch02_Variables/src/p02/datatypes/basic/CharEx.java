package p02.datatypes.basic;

// char : 문자 한글자를 관리하기 위한 타입
// 1. 문자열을 이루는 문자 한글자를 관리함 (예: 문자열 "홍길동"은 char 문자인 '홍', '길', '동'
// 2. ASCII (American Standard Code Information Interchange)
//   - 컴퓨터에서 영문자, 숫자, 특수기호들을 이진수로 표현한 것임
//   - 미국 컴퓨터제조업체 또는 미국에 컴퓨터를 수출하는 모든 제조업체가 따라야하는 표준 규약
//   - 단점 : 미국에서 컴퓨터로 프로그래밍하고 사용하는 문제가 없는데, 다른 나라들은 컴퓨터 사용하는데 문제 존재
// 3. 유니코드(unicode) : 2bytes
//   - 한국어, 중국어, 일어 등 모든 나라 언어를 지원하는 전세계 global 표준 코드
//   - 유니코드 안에 ASCII code가 포함이 되어 있음
public class CharEx {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';	// unicode escape"
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);
		System.out.println("c5 = " + c5);
		System.out.println("c6 = " + c6);
	}

}
