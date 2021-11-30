package p01.basic;

import java.util.Scanner;

// Java Exception class 사용하여 에러 처리
// 1. try { } catch { }  문법을 사용
// 2. try안에는 나눗셈 method를 실행하고, 나눗셈 method를 실행하면서 에러가 발생할 경우 catch 안에 있는 코드 실행
// 3. try안에서 에러가 발생하더라도, catch안에 있는 코드 실행한 이후에, 프로그램의 나머지 코드를 정상적으로 실행
public class QuotientWithException {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("2개 정수값을 입력하세요.");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		try {
			// 정상적으로 프로그램을 실행
			int result = quotient(num1, num2);
			System.out.println(num1 + " / " + num2 + " = " + result );
		} catch (ArithmeticException e) {
			// 에러가 발생시 실행하는 코드
//			System.out.println("Exception 발생 : 분모에 정수 0을 사용하여 나누기 실행");
			System.out.println(e.getMessage());
		}

		System.out.println("프로그램 계속 실행");
	}
	
	public static int quotient (int num1, int num2) {
		if (num2 == 0) {
			throw new ArithmeticException("분모에 해당하는 정수에 0을 사용할 수 없습니다.");
		}
		
		return num1 / num2;
	}

}








