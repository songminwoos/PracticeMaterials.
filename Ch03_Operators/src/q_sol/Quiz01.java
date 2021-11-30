package q_sol;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		// Create new Scanner object

		// Prompt the user to enter a number between 0 and 1000.
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		// 세자리수 정수를 입력않하면 어떻게 해야 하지?
		// 1. 정수를 입력하는데, 1자리 이하이거나, 세자리 이상인 경우 => 3자리수 정수를 다시 입력해 주세요//
		// 정수를 입력하는 것이 실수, 문자열, 문자코드 등 체크

		int lessThan10 = number % 10;
		number /= 10;				
		int tens = number % 10;		
		number /= 10;				
		int hundreds = number % 10;		
		number /= 10;					
		int sum = hundreds + tens + lessThan10;	

		// Display results
		System.out.println("The sum of the digits is " + sum);
	}

}
