package p03.realnumber_problem;

// 실수 연산할 때 프로그래밍 팁
// 1. 실수를 정수화하여 연산하고, 최종 값을 다시 실수로 변환하여 사용하는 것이 좋음
//    => 이유 : 컴퓨터가 10진수 실수값을 2진수 실수값으로 정확하게 표현할 수 없기 때문임
public class RealNumberCorrectUseEx {

	public static void main(String[] args) {
		int apple = 1;
		
		// totalPieces변수를 만든 목적은 실수 연산을 안하고 정수 연산을 하기 위해서
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;	// temp <= 3
		
		double result = temp/10.0; 
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + "조각이 남는다.");
	}

}
