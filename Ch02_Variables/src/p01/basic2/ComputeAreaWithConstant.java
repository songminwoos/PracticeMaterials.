package p01.basic2;

import java.util.Scanner;

// 상수 : 값이 변경되지 않는 수
// 1. final 키워드를 변수 타입 앞에 선언
// 2. 상수 초기값은 상수 변수 선언과 동시에 넣어주기를 권장
// 3. 상수로 선언된 변수는 값을 변경 불가
public class ComputeAreaWithConstant {

	public static void main(String[] args) {
		final double PI = 3.14159;
		
		Scanner input = new Scanner(System.in);
		
		// 1. 원의 반지름을 console에서 키보드로 입력된 데이터 읽기
		System.out.println("원의 반지름을 입력하세요 : ");
		double radius = input.nextDouble();

		// 2. 원의 면적 계산하기 : 입력데이터를 출력데이터로 가공
		double area = radius * radius * PI;
		
		// 3. 원의 면적을 console창에 보여주기
		System.out.println("원의 반지름이 " + radius + "인 "
								+ "원의 면적은 " + area + " 입니다.");

		// 상수로 선언된 변수는 값을 변경 불가
//		PI = 3.15;

	}

}
