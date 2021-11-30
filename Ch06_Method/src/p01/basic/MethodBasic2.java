package p01.basic;

// sum method 구현하기
// 1. method 정의
//   - 프로그램에서 여러번 반복 사용되는 특정 코드 덩어리를 별도의 method로 정의
//   - 정의된 메소드를 다른 프로그램에서 호출하여 사용하는 방법
// 2. method 사용 효과
//   - 소스코드 량을 대폭 줄이 수 있고, 프로그램 내에서 중복되는 코드 덩어리 제거 가능
//   - 메소드로 정의된 코드 덩어리를 나중에 수정할 경우 메소드만 수정하면 됨
// 3. 실제로 로그인 여부 체크등의 공통 기능은 method로 구현하는 훨씬 효율적임
// 4. C 언어에서는 method를 함수(function)이라 부름
// 5. method는 Java, C++등 objected oriented language(객체지향언어)에서 C의 함수를 부르는 별칭
public class MethodBasic2 {

	public static void main(String[] args) {
		
		// sum(1, 10)을 실행할 때 기계어로 처리 순서 
		// 1. sum method를 호출하고, 1을 sum method의 startValue변수에 값을 넣음
		// 2. 10을 sum method의 endValue변수에 값을 넣음
		// 3. sum method의 본문 내용을 실행 (result 변수를 메모리에 생성하고, 초기값으로 0을 세팅, for문 수행)
		// 4. sum method에서 result값을 sum(1,10)을 사용한 코드(println 으로)로 넘겨줌
		System.out.println("1과 10사이의 합 = " + sum(1, 10));
		System.out.println("27과 37사이의 합 = " + sum(27, 37));
		System.out.println("35과 49사이의 합 = " + sum(35, 49));

	}

	public static int sum(int startValue, int endValue) {
		int result = 0;
		
		for (int i=startValue; i<=endValue; i++) {
			result = result + i;
		}
		
		return result;
	}
}







