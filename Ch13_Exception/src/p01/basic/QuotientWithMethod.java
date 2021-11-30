package p01.basic;

import java.util.Scanner;

// 분모 정수인 num2에 대하여 0인지를 체크하는 로직을 메소드로 만들어 사용
// System.exit(1) : 프로그램 강제 종료 (에러 없이)
public class QuotientWithMethod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("2개 정수값을 입력하세요.");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

//		int result = quotient(num1, num2);
		System.out.println(num1 + " / " + num2 + " = " + quotient(num1, num2) );

	}
	
	public static int quotient (int num1, int num2) {
		if (num2 == 0) {
			System.out.println("분모에 해당하는 정수에 0을 사용할 수 없습니다.");
			System.exit(1);
		}
		
		return num1 / num2;
	}

}








