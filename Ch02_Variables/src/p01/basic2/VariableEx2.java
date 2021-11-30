package p01.basic2;

// variable naming(변수 이름) : 
//  1. 영문, _, $가 포함되는 것은 가능
//     => java로 개발된 S/W 제품
//  2. 변수이름 맨 앞에 숫자가 나오면 안됨
//     단, 변수이름 중간이나 맨마지막에 숫자 사용하는 것은 가능
//  3. 변수이름은 소문자로 시작하는 것이 관행
//  4. 변수이름은 충분히 변수의 기능을 설명할 수 있도록 길게 쓰는 것을 권장 (예: interestRate, 이자율)
//  5. 변수이름이 여러개의 단어로 구성된 경우 (예: interestRate)에 두번째 단어부터 마지막 단어의 첫번째 글자는 대문자로 쓰는 것을 권장
//     => camel notation (낙타표기법)

// class naming(class 이름)
// 1. 대부분의 variable naming만 동일
//    => 차이점 : class이름은 대문자로 시작

// 변수 사용 방법
// 1. 변수 선언 => 변수 타입 + 변수이름 (예: int count => int가 변수 타입을 말하고, count가 변수 이름을 말함)
//    => 초기값을 다른 변수를 사용하여 초기값을 줄 수도 있음
// 2. 변수 사용 => 변수에 새로운 값을 넣는 경우, 변수에 있는 데이터 값을 읽는 경우, 출력하는 경우 
public class VariableEx2 {

	public static void main(String[] args) {
		int count;
		double interestRate;
		double $radius;
		double _radius;
//		double 1radius;
		double radius1;
		int junior = 15;			// 10 대
		// 기계어 코드로 변환시키면
		// 1. junior 변수의 값을 읽어라
		// 2. 값을 읽은 junior 변수 값에 5를 더해라
		// 3. 더한 값 20을 adult 변수가 있는 메모리 방에 값을 넣어라
		int adult = junior + 5;	// 성인 : 10대 + 5을 해서 초기화

		System.out.println("junior = " + junior);
		System.out.println("adult = " + adult);

		count = 10;
		System.out.println("count = " + count);
		
		interestRate = 0.1;
		System.out.println("interestRate = " + interestRate);
		
		$radius = 5;
		System.out.println("$radius = " + $radius);

		_radius = 10;
		System.out.println("_radius = " + _radius);
	}

}
