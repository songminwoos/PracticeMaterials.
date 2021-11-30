package p01.basic;

import java.util.Scanner;

// 2개의 정수값을 입력 받아, 2 정수에 대하여 나누기 연산을 수행
// 분모로 입력된 정수값이 0이 되면 Exception error발생하고 프로그램이 강제 종료되는 현상이 발생
public class Quotient {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("2개 정수값을 입력하세요.");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2) );

	}

}
