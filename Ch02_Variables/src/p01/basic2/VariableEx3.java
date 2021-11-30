package p01.basic2;

import java.util.Scanner;

// 변수 값을 초기화(설정)하는 방법
// 1. 변수 선언후에, 나중에 변수에 값을 설정하는 방법
// 2. 변수 선언과 동시에 변수에 값을 설정하는 방법

// 변수 초기화 권장 사항
// 1. 변수 초기값을 줄 수 있는 상황이면 주는 것을 권장
//    interestRate = 0.1; => 만약에 해당 회사(은행) 기본이자율이 10%라면 초기값을 주는 것이 소스코드 관리 및 이해하는데 도움이 됨
// 2. 변수 초기값을 줄 수 없는 상황이면 초기값으로 setting 권장
//    count = 0 (예를 들면 int등 정수값은 0이 초기값이고, double등 실수값은 초기값이 0.0)
// 3. 프로그램 외부에서 초기 데이터를 받아야 하는 경우에는 초기값을 주기가 어려움
//    => 변수 선언만 하고 초기값을 주지 않아도 됨 (예: int age;)
//    => 그래도 초기값을 줄 수 있으면 주는 것도 괜찮음
// 4. 변수 선언 위치 : 가급적 프로그램 처음 시작할 때 변수를 선언 해라
// 5. 변수 선언할 때 변수에 대한 설명을 하는 것을 적극 권장

// literal(리터럴) : 변수에 변수의 값을 직접 입력하는 문자
// 예를 들면, int count = 0;에서 0을 리터럴이라 함
// 1. 0, 5.0, 0.1 등을 리터럴이라 함
// 2. 0을 정수 리터럴, 5.0, 0.1을 실수 리터럴 이라 부름
public class VariableEx3 {

	/*********************************************/
	/* 변수 이름 : count                           */
	/*           수학 성적에서 80점 이상인 학생수      */
	/* 생성일자 : 2021년 10월 27일               */
	public static void main(String[] args) {
		int count = 0;	// 수학 성적에서 80점 이상인 학생수
		double radius = 5.0;	// 원의 반지름
		double interestRate = 0.1;	// 이자율
		// Scanner : 변수 타입, input : 변수이름
		Scanner input = new Scanner(System.in);
//		int age;
		int age = 0;
		
		System.out.println("나이를 입력하세요 : ");
//		int age = input.nextInt();
		age = input.nextInt();
		System.out.println("age = " + age);
		
		System.out.println("count = " + count);
		
		System.out.println("interestRate = " + interestRate);
		
		System.out.println("radius = " + radius);

		count = 20;
		System.out.println("count = " + count);
		
		
	}
		
}
