package p01.practice;

// 1. main method
//    - method이름이 고정되어 있음, JVM이 main method를 최초에 호출
// 2. 일반 method (예 : max method)
//    - method 이름을 자유스럽게 변경이 가능
// 3. method header부분의 return value type에서 void라는 것이 있음. 
//    => 이 것은 method에서 값을 return 값이 없는 경우에 사용
//    => 실제 코딩에서는 void로 선언된 메소드에 "return;"명령어를 사용하거나 생략할 수도 있음 
// 4. method body에는 변수 선언, 코딩, return 명령어 사용 가능
// 5. method 중요 용어 : 예로, public static int max(int num1, int num2) 
//   - paramter : num1, num2
//   - method signature : JVM이 method가 중복여부를 체크할 때 사용함 => 예로,  max(int num1, int num2)
// 6. JVM이 method를 실행하는 순서
//    1) JVM이 main method를 호출하고, activation record를 stack memory에 만듬
//       => 메소드에서 선언된 순서대로 메모리에 방을 잡음 (변수 i가 먼저 방을 잡고, 그 위에 j가 잡고, 마지막으로 k가 잡음)
//    2) k방을 잡고, max method를 호출하면, max method가 호출되면서 max method의 activation record를 stack에 생성
//       => max method에서 선언된 변수들이 순서대로 메모리에 올라감 (parameter num1, num2, 변수 result)
//       => main method에서 max를 호출할 때 paramter값이 max method의 num1, num2로 값이 복사해 넘어감
//    3) max method의 본문 내용을 실행하고 result값을 main method에서 호출한 코드부분으로 결과값을 return
//       => main method의 변수 k에 max method에서 return한 결과값을 받음
//    4) 사용이 완료된 max method의 activation record를 stack 메모리에서 삭제 
//       (num1, num2, result변수도 같이 메모리에서 삭제됨)
//    5) main method가 실행이 끝나면 main method의 activation record를 stack에서 삭제하고 프로그램이 종료됨
public class TestMax {

	// main method라고 부름
	public static void main(String[] args) {
		int i = 5;
		int j = 12;
		int k = max(i,j);

		System.out.println(i + "와 " + j + "중 최대값은 " + k + "입니다.");
		
		return;
	}

	// 2개의 숫자 중에 최대값(max)을 구하는 메소드를 정의
	public static int max(int num1, int num2) {
		int result;
		
		if (num1 > num2) {
			result = num1;
		} else {
			result = num2;
		}
		
		return result;
	}
}







