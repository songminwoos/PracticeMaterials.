package p99.quiz.choijh;

import java.util.Scanner;

public class Quiz03 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요. (1/3)");
		int num1 = input.nextInt();
		System.out.println("정수를 입력하세요. (2/3)");
		int num2 = input.nextInt();
		System.out.println("정수를 입력하세요. (3/3)");
		int num3 = input.nextInt();
		
		int maxNum = 0; 
		int midNum = 0; 
		int minNum = 0;
		
		if ( (num1 > num2) && (num1 > num3) ) {
			maxNum = num1;
			if (num2 > num3) {
				midNum = num2;
				minNum = num3;
			} else {
				midNum = num3;
				minNum = num2;
			}
		} else if ( (num2 > num1) && (num2 > num3) ){
			maxNum = num2;
			if (num1 > num3) {
				midNum = num1;
				minNum = num3;
			}else {
				midNum = num3;
				minNum = num1;
			}
		} else {
			maxNum = num3;
			if (num1 > num2) {
				midNum = num1;
				minNum = num2;
			} else {
				midNum = num2;
				minNum = num1;
			}
		}
		
		System.out.println(maxNum + " " + midNum + " " + minNum);
	}
	
}
